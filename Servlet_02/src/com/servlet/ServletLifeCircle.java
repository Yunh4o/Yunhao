package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletLifeCircle extends HttpServlet {
//	initial ��ʼ��
	@Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
	}
//	destory ����
	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}
	
	
	
}
