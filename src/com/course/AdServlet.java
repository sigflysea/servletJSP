package com.course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdServlet
 */
@WebServlet(
		description = "Advanced Servlet", 
		urlPatterns = { 
				"/AdServlet", 
				"/AdServletPath"
		})
public class AdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=(String) request.getParameter("yname");
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		out.print("Charged to your account!  "+name);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("yname");
		String gender= request.getParameter("xname");
		PrintWriter out = response.getWriter();
		out.println("Charged to your account!  "+name);
		out.println("Charged to your account!  "+gender);
		out.println("<h2>" +gender +"</h2>");
		

	}

}
