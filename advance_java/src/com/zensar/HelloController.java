package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class HelloController extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("userName");
		System.out.println("name: " +name);
		String city = request.getParameter("userCity");
		System.out.println("city: " +city);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		request.setAttribute("name", name);
		request.setAttribute("city", city);
		try
		{
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			System.out.println("Exeption occured " +e);
		}
	}
}
