package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	객체 직렬화
//	클래스에 대한 고유값
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		String op = request.getParameter("op");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int result=calc(num1, num2, op);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>servlet을 이용한 계산기 결과</title></head>");
		out.println("<body><h2>계산결과 : "+num1+" "+op+" "+num2+" = "+result+"</h2></body>");
		out.println("</HTML>");
	}

	public int calc(int num1, int num2, String op) {
		if (op.equals("+")) {
			return num1 + num2;
	      } else if (op.equals("-")) {
	    	  return num1 - num2;
	      } else if (op.equals("x")) {
	    	  return num1 * num2;
	      } else if (op.equals("/")){
	    	  return num1 / num2;
	      }else {return 0;}
		
	}

}
