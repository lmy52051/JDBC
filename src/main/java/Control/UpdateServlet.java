package Control;

import Model.Shuiku;
import Service.UpdateService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UpdateService updateService = new UpdateService();
        String name = request.getParameter("name");
        String X = request.getParameter("X");
        String Y = request.getParameter("Y");
        float x = new Float(X);
        float y = new Float(Y);
        Shuiku shuiku = new Shuiku(name, x, y);
        boolean flag = updateService.updateService(shuiku);
        if (flag){
            request.getRequestDispatcher("ShuikuServlet").forward(request,response);
        }else {
            request.getRequestDispatcher("failure.jsp").forward(request,response);
        }

    }
}
