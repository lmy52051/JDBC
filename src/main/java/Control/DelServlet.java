package Control;

import Model.Shuiku;
import Service.DelService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DelServlet", value = "/DelServlet")
public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DelService delService = new DelService();
        String name = request.getParameter("name");
        Shuiku shuiku = new Shuiku(name);
        boolean flag = delService.delService(shuiku);
        if (flag){
            request.getRequestDispatcher("ShuikuServlet").forward(request,response);
        }else {
            request.getRequestDispatcher("Failure.jsp").forward(request,response);
        }
    }
}
