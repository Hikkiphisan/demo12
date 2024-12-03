package org.example.demo4.controller;

import org.example.demo4.HelloServlet;
import org.example.demo4.model.Customer;
import org.example.demo4.service.DAOManager;
import org.example.demo4.service.IDAOManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletDemo",urlPatterns = "/usersdemo")
public class ServletDemo extends HelloServlet {
    private  final  IDAOManager manager = new DAOManager();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {
        List<Customer> customerList = manager.selectAllManager();
        request.setAttribute("customerList", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/Listmanager.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }


//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
}
