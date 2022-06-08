package Control;

import Model.Shuiku;
import Service.AddService;
import Service.ShuikuService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ShuikuServlet", value = "/ShuikuServlet")
public class ShuikuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShuikuService shuikuService = new ShuikuService();
        ArrayList<Shuiku> list = shuikuService.viewListAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("shuiku.jsp").forward(request,response);
    }
}
