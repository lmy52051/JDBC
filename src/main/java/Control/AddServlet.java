package Control;

import Model.Shuiku;
import Service.AddService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AddService addService = new AddService();
        String name, bz, X, Y;
        name = request.getParameter("name");
        X = request.getParameter("X");
        Y = request.getParameter("Y");
        bz = request.getParameter("bz");
        float x = new Float(X);
        float y = new Float(Y);
        Shuiku shuiku = new Shuiku(name,x,y,bz);
        boolean flag = addService.addService(shuiku);
        if (flag){
            request.getRequestDispatcher("ShuikuServlet").forward(request,response);
        }else {
            request.getRequestDispatcher("Failure.jsp").forward(request,response);
        }
    }
}
