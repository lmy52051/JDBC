package Control;

import Model.User;
import Service.DengluService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DengluServlet", value = "/DengluServlet")
public class DengluServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name,password;
        String goPath = "";
        name = request.getParameter("username");
        password = request.getParameter("password");
        if (name == null)
            name = "";
        if(password == null)
            password = "";


        DengluService dengluService = new DengluService();
        User user = dengluService.denglu(name,password);
        request.getSession().setAttribute("user",user);
        if (user.getId().equals("-1"))
            goPath = "Failure.jsp";
        else {
            request.getSession().setAttribute("user",user);
            goPath = "ShuikuServlet";
        }
        request.getRequestDispatcher(goPath).forward(request,response);
    }
}
