package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomSample
 */
@WebServlet("/RandomSample")
public class RandomSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//フォワードの設定
		RequestDispatcher dispatcher = request.getRequestDispatcher("/forwarded.jsp");
		
		int index = (int)(Math.random() * 9);
		
		if(index % 2 == 1) {
			//リダイレクト
			response.sendRedirect("/example/redirected.jsp");
		}else if(index % 2 == 0) {
			//フォワード
			dispatcher.forward(request, response);
		}
	}

}
