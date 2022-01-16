package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fruit;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit("いちご",700);
		
		//リクエストスコープに保存
		request.setAttribute("fruit",fruit);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Fruit.jsp");
		
		dispatcher.forward(request, response);
	}


}
