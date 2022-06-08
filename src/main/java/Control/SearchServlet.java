package Control;

import Model.Shuiku;
import Service.DelService;
import Service.Searchservice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Searchservice searchservice = new Searchservice();
        String name = request.getParameter("name");
        ArrayList<Shuiku> list = searchservice.searchService(name);
        request.setAttribute("list",list);
        request.getRequestDispatcher("shuiku.jsp").forward(request,response);
    }
}
