package com.example.web;

import com.example.model.*;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
						throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
//		response.setContentType("text/html");
//		out.println("Beer Selection Advise<br>");
//		
//		Iterator it = result.iterator();
//		while(it.hasNext()){
//			out.print("<br> try: " + it.next());
//		}
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
