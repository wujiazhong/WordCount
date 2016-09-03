package com.ibm.ids.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowResult
 */
public class ShowResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WordCountFinder wordCountFinder;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowResult() {
        super();
        wordCountFinder = new WordCountFinder();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Parse input
		String content = request.getParameter("content");
		int wordCount = wordCountFinder.countWords(content);
		
		//Print response to the Web Page
		response.setContentType("text/plain");
	    PrintWriter out = response.getWriter();
	    out.println("The word count is " + wordCount);
	}

}
