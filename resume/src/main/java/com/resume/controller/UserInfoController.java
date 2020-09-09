package com.resume.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resume.dto.BoardPager;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;
import com.resume.service.UserInfoService;

@Controller
public class UserInfoController {

	private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService service;

	@Autowired
	PasswordEncoder passwordEncoder;

	// 사용자 홈 화면
	@RequestMapping(value = "userHome")
	public String userHome() {
		logger.info("this is userHome method");

		return "user/userHome";
	}

	// 사용자 로그인 화면
	@RequestMapping(value = "user/userlogin")
	public String userlogin(UserInfo uDto) {
		logger.info("this is userlogin method");

		return "user/user_login";
	}

	// 사용자 로그인
	@RequestMapping(value = "user/userloginEnd")
	public String userloginEnd(Model model, UserInfo user, HttpSession session) {
		logger.info("this is a userloginEnd method");

		UserInfo result = service.userSelectOne(user);
		String path = "";
		boolean passMatch = passwordEncoder.matches(user.getU_pwd().trim(), result.getU_pwd().trim());
//		System.out.println(passMatch);
//		System.out.println("user.getU_pwd = " + user.getU_pwd().toString());
//		System.out.println("result.getU_pwd = " + result.getU_pwd().toString());
		UserInfo login = service.userSelectOne(user);
		System.out.println(login);
		

			if (result != null && passMatch && login.getU_status().equals("Y")) {

					path = "redirect:/userHome";
					session.setAttribute("loginUser", result);
				}
			else {
				session.setAttribute("loginUser", null);
				path = "redirect:/user/userlogin";
			}
			

		return path;
	}

	// 사용자 로그아웃
	@RequestMapping(value = "user/userlogout")
	public String userlogOut(HttpSession session) {

		logger.info("this is a userlogOut method");
		if (session.getAttribute("loginUser") != null) {
			session.removeAttribute("loginUser");
		}

		return "redirect:/userHome";
	}

	// 사용자 마이페이지
	@RequestMapping(value = "user/myPage")
	public String yPage(Model model, HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("loginUser");
		model.addAttribute("loginUser", user);

		return "user/myPage";
	}

	// 사용자 정보 업데이트
	@RequestMapping(value = "user/userInfoUpdateEnd")
	public String userInfoUpdate(UserInfo uDto) {

		String encPassword = passwordEncoder.encode(uDto.getU_pwd());
		uDto.setU_pwd(encPassword);
		System.out.println("암호화된 비밀번호 = " + uDto.getU_pwd());
		service.userInfoUpdate(uDto);

		return "forward:/user/myPage";
	}

//------------------------------------------------------------------------------관리자------------------------------------------------------------------------------	
	// 사용자 등록 폼
	@RequestMapping(value = "user/userSignUp")
	public String userSignUp() {

		return "user/user_SignUp";
	}

	// 도로명주소 API
	@RequestMapping(value = "user/userJuso")
	public String userJuso() {
		return "user/jusoPopup";
	}

	// 사용자 등록
	@RequestMapping(value = "user/userSignUpResult")
	public String userSignUpResult(UserInfo uDto) {
		System.out.println("컨트롤러  user정보 = " + uDto);

		String encPassword = passwordEncoder.encode(uDto.getU_pwd());
		uDto.setU_pwd(encPassword);
		System.out.println("암호화된 비밀번호 = " + uDto.getU_pwd());

		service.userInsert(uDto);

		return "redirect:/admin/adminUserList";
	}

//	사번 중복체크
	@RequestMapping(value = "/user/idCheck")
	@ResponseBody
	public String idcheck(@RequestParam("u_id") int u_id) throws Exception {
		System.out.println(u_id);
		int result = service.userIdCheck(u_id);
		String data;
		if (result > 0) {
			data = "1";
		} else {
			data = "0";
		}

		return data;
	}

	// 이메일 중복체크
	@RequestMapping(value = "user/emailCheck")
	@ResponseBody
	public String emailCheck(@RequestParam("u_email") String u_email) {
		System.out.println(u_email);
		int result = service.emailCheck(u_email);
		String data;
		if (result > 0) {
			data = "1";
		} else {
			data = "0";
		}

		return data;
	}

	// 사용자 리스트 ajax
	@RequestMapping(value = "admin/adminUserList")
	public String adminUserList() {

		return "admin/adminUserList";
	}

	// 사용자 리스트 ajax
	@RequestMapping(value = "admin/adminUserListAjax")
	public String adminUserListAjax(@RequestParam(value = "cPage", defaultValue = "1") int cPage,
			@RequestParam(value = "searchSort", defaultValue = "") String searchSort,
			@RequestParam(value = "searchVal", defaultValue = "") String searchVal, Model model, HttpSession session) {
		logger.info("this is a adminUserList method");

		// 검색 객체 값 넣기
		SearchDto searchDto = new SearchDto(searchSort, searchVal);

		// 총 레코드 가져오기
		int nCount = service.selectUserCount(searchDto);

		// 현재 출력 페이지
		int curPage = cPage;

		// 페이지 객체에 값 저장
		BoardPager boardPager = new BoardPager(nCount, curPage);

		// 페이지 겍체에 검색 정보 저장
		boardPager.setSearchSort(searchSort);
		boardPager.setSearchVal(searchVal);

		// 전체 리스트 출력
		List<UserInfo> adminUserList = service.selectUserList(boardPager);
		model.addAttribute("adminUserList", adminUserList);
		model.addAttribute("boardPager", boardPager);

		return "admin/ajax/adminUserList_ajax";
	}

	// 사용자 리스트 ajax
	@RequestMapping(value = "admin/adminRunUserList")
	public String adminRunUserList() {

		return "admin/adminRunUserList";
	}

	// 사용자 리스트(퇴사자)
	@RequestMapping(value = "admin/adminRunUserListAjax")
	public String adminRunUserListAjax(@RequestParam(value = "cPage", defaultValue = "1") int cPage,
			@RequestParam(value = "searchSort", defaultValue = "") String searchSort,
			@RequestParam(value = "searchVal", defaultValue = "") String searchVal, Model model, HttpSession session) {
		logger.info("this is a adminUserList method");

		// 검색 객체 값 넣기
		SearchDto searchDto = new SearchDto(searchSort, searchVal);

		// 총 레코드 가져오기
		int nCount = service.selectRunUserCount(searchDto);

		// 현재 출력 페이지
		int curPage = cPage;

		// 페이지 객체에 값 저장
		BoardPager boardPager = new BoardPager(nCount, curPage);

		// 페이지 겍체에 검색 정보 저장
		boardPager.setSearchSort(searchSort);
		boardPager.setSearchVal(searchVal);

		// 전체 리스트 출력
		List<UserInfo> adminRunUserList = service.selectRunUserList(boardPager);
		System.out.println(adminRunUserList);
		model.addAttribute("adminRunUserList", adminRunUserList);
		model.addAttribute("boardPager", boardPager);
		return "admin/ajax/adminRunUserList_ajax";
	}

	// 사용자 상세보기
	@RequestMapping(value = "admin/adminUserSelectOne")
	public String adminUserSelectOne(UserInfo user, Model model) {

		UserInfo userInfo = service.adminUserSelectOneUP(user);
		System.out.println(userInfo);
		model.addAttribute("userInfo", userInfo);

		return "admin/adminUserSelectOne";
	}

	// 사용자 수정
	@RequestMapping(value = "admin/adminUserUpdateForm")
	public String adminUserUpdate(UserInfo user, Model model) {

		UserInfo userInfo = service.adminUserSelectOneUP(user);
		System.out.println(userInfo);
		model.addAttribute("userInfo", userInfo);

		return "admin/adminUserUpdateForm";
	}

	// 사용자 수정 완료
	@RequestMapping(value = "admin/adminUserUpdateEnd")
	public String adminUserUpdateEnd(UserInfo user) {

		service.adminUserUpdate(user);

		return "redirect:/admin/adminUserList";
	}

	// 사용자 삭제
	@RequestMapping(value = "admin/adminUserDelete")
	public String adminUserDelete(@RequestParam("u_id") int u_id) {

//		service.adminUserDelete(u_id);

		return "redirect:/admin/adminUserList";
	}

	// 사용자 리스트 jqGrid

//	@RequestMapping(value = "admin/adminUserList1")
//	@ResponseBody
//	public JqGrid adminUserList(@RequestParam(value="page", required=false, defaultValue="1") String page, HttpServletRequest request,
//			@RequestParam(value="rows", required=false, defaultValue="") String rows) {
//		System.out.println("컨트롤러 도착");
//		//그리드에 뿌려주려는 데이터를 DB에서나 어디에서 가져온다
//				JqGrid obj = new JqGrid();
//				
//				rows = request.getParameter(rows);
//				if(rows == null || rows.trim().equals("")) {
//					rows = "0";
//				}
//				//그 데이터를 JqGrid에 setter로 세팅해준다.
//				//이 때 jqgrid가 알아먹을 수 있는 형태의 json으로 보내주어야 한다.
//				List<UserInfo> list = service.userInfoList(page, rows);
//				System.out.println(list);
//				List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
//
//				int int_page = Integer.parseInt(page);
//				System.out.println(int_page);
//				int perPageNum = Integer.parseInt(rows.trim());
//				perPageNum = (int)Double.parseDouble(rows); 		
//				System.out.println("sdgjsfu"+perPageNum);		//결과값 : For input String ""
//				
//				int size = list.size();
//				HashMap<String, Object> tempMap = new HashMap<String, Object>();
//				//DB에서 가져온 데이터의 갯수가 10개라고 가정하고 임의로 수행한다. 그럼 이 키 값들을 멤버로 하는 클래스를 가지고 있어야 한다.
//				for(int i=0; i<size; i++){
//					tempMap = new HashMap<String, Object>();
//					
//					tempMap.put("u_id"		, list.get(i).getU_id());						//사번
//					tempMap.put("u_name"	, list.get(i).getU_name());					//이름
//					if(list.get(i).getD_id() == 1) {												//부서
//						tempMap.put("d_id"	,"경영지원");
//					} else if(list.get(i).getD_id() == 2) {
//						tempMap.put("d_id"	,"연구소");
//					} else if(list.get(i).getD_id() == 3) {
//						tempMap.put("d_id"	,"SI사업부");
//					} 
//					tempMap.put("u_email"	, list.get(i).getU_email());					//이메일
//					if (list.get(i).getU_position() == 1) {										//직위
//						tempMap.put("u_position", "사장");
//					} else if (list.get(i).getU_position() == 2) {
//						tempMap.put("u_position", "부장");
//					} else if (list.get(i).getU_position() == 3) {
//						tempMap.put("u_position", "차장");
//					} else if (list.get(i).getU_position() == 4) {
//						tempMap.put("u_position", "과장");
//					} else if (list.get(i).getU_position() == 5) {
//						tempMap.put("u_position", "대리");
//					} else if (list.get(i).getU_position() == 6) {
//						tempMap.put("u_position", "사원");
//					}
//					tempMap.put("u_phone"		, list.get(i).getU_phone());				//핸드폰번호
//	
//					tempMap.put("u_company", list.get(i).getU_company());			//회사
//					if(list.get(i).getU_marry().equals("Y")) {									//결혼여부
//						tempMap.put("u_marry", "기혼");
//					} else if(list.get(i).getU_marry().equals("N")) {						
//						tempMap.put("u_marry", "미혼");
//					}
//					if (list.get(i).getU_ms().equals("F")) {									//병역
//						tempMap.put("u_ms", "필");
//					} else if(list.get(i).getU_ms().equals("FN")) {
//						tempMap.put("u_ms", "미필");
//					} else if(list.get(i).getU_ms().equals("N")) {
//						tempMap.put("u_ms", "면제");
//					} else if(list.get(i).getU_ms().equals("NA")) {
//						tempMap.put("u_ms", "해당없음");
//					}
//					if(list.get(i).getU_career() == null) {										//경력
//						tempMap.put("u_career", "경력없음");
//					} else {
//					tempMap.put("u_career", list.get(i).getU_career());					
//					}
//					if(list.get(i).getU_tgrade().equals("B")) {								//기술등급
//						tempMap.put("u_tgrade", "초급");
//					} else if(list.get(i).getU_tgrade().equals("M")) {
//						tempMap.put("u_tgrade", "중급");
//					} else if(list.get(i).getU_tgrade().equals("H")) {
//						tempMap.put("u_tgrade", "고급");
//					} else if(list.get(i).getU_tgrade().equals("S")) {
//						tempMap.put("u_tgrade", "특급");
//					}
//					tempMap.put("u_address", list.get(i).getU_address());				//주소
//					if(list.get(i).getU_status().equals("Y")) {									//재직상태
//						tempMap.put("u_status"		, "재직중");
//					} else if(list.get(i).getU_status().equals("N")) {
//						tempMap.put("u_status"		, "퇴사");
//					}
//
//					resultList.add(tempMap);
//				}//for end
//				
//				System.out.println(resultList);
//				//Jqgrid를 리턴해주면 @ResponseBody 어노테이션 그리고 Jackson 라이브러리에 의해
//				//json타입으로 페이지에 데이터가 뿌려진다.
//				obj.setRows(resultList);//list<map>형태의 받아온 데이터를 가공해서 셋(그리드에 뿌려줄 행 데이터들)
//				obj.setPage(int_page);//현재 페이지를 매개변수로 넘어온 page로 지정
//				obj.setRecords(resultList.size());//보여지는 데이터 갯수
//				
//				//total은 rows에 의한 총 페이지 수
//				//총 페이지 갯수는 (데이터갯수 / 한 페이지에 보여줄 갯수)
//				int totalPage = (int)Math.ceil(resultList.size()/Double.parseDouble(rows));
//				System.out.println(totalPage);
//				obj.setTotal(totalPage);
//			
//			System.out.println(obj);
//
//				
//				
//		return obj;
//	}
//
//	@RequestMapping(value = "admin/adminUserList")
//	public String test() {
//		
//		return "admin/adminUserList";
//	}

	@RequestMapping(value = "test")
	public String test() {

		return "user/test";
	}

}// class end
