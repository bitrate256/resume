package com.resume.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(request.getSession().getAttribute("loginUser") == null) {
			String msg="로그인 후 이용해 주세요";
			request.setAttribute("msg",msg);
			request.setAttribute("loc","/user/userlogin");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
			return false;
		}
		
		
		// 세션 가져와서 조건 분기 처리
		return super.preHandle(request, response, handler);
	}

}
