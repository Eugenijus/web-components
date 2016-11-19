package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ch2Dice
 */
public class Ch2Dice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ch2Dice() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String d1 = Integer.toString((int)(Math.random()*6)+1);
		String d2 = Integer.toString((int)(Math.random()*6)+1);
		
		out.println("<html><body>" +
				"<h1>HF\'s Chap 2 Dice Roller</h1>" + 
				"<p>" + d1 + " and " + d2 + " were rolled." +
				"</body></html>");
	}

}
