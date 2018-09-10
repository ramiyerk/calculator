package com.mahesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CalculatorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculator cal=new Calculator();
		int num1=Integer.parseInt(request.getParameter("n1"));
		int num2=Integer.parseInt(request.getParameter("n2"));
		int result;
		int op =Integer.parseInt(request.getParameter("op"));
		switch(op) {
		case 1:
			result=cal.addFunction(num1, num2);
			break;
		case 2:
			result=cal.substractFunction(num1, num2);
			break;
		case 3:
			result=cal.multiplyFunction(num1, num2);
			break;
		case 4:
			result=cal.divideFunction(num1, num2);
			break;
			default:
				result=0;
		}
				
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Calculator</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"      \r\n" + 
				"        <form action='eval' method='post' name='frm'>\r\n" + 
				"        \r\n" + 
				"               Enter num1:\r\n" + 
				"               <input name='n1' type='number' value='"+(num1)+"' /></br><br/>\r\n" + 
				"            \r\n" + 
				"\r\n" + 
				"                Enter num2:\r\n" + 
				"               <input name='n2' type='number'  value='"+(num2)+"' /></br><br/>\r\n" + 
				"            \r\n" + 
				"           \r\n" + 
				"               Operator\r\n" + 
				"                \r\n" + 
				"                <select name='op'>\r\n" + 
				"                   \r\n" + 
				"                    <option value='1'>Addition</option>\r\n" + 
				"                    <option value='2'>Subtraction</option>\r\n" + 
				"                    <option value='3'>Multiplication</option>\r\n" + 
				"                    <option value='4'>Division</option>\r\n" + 
				"                </select>\r\n</br><br/> <hr>" + 
				"            \r\n" + 
				"                Result:\r\n" + 
				"               <input name='n3' type='number' value='"+(result)+"' /></br><br/>\r\n" + 
				"\r\n" + 
				"                <input type='submit' value='submit' />\r\n" + 
				"            \r\n" + 
				"        </form>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
	}


