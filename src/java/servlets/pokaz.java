package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rsi.JDG;
import rsi.webClient;

@WebServlet(name = "pokaz", urlPatterns = {"/pokaz"})
public class pokaz extends HttpServlet {

    //@WebServiceRef(wsdlLocation = "http://localhost:8081/axis2/services/RSI/RSI_JDG_WSService?wsdl")
    private webClient wc = new webClient();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            JDG[] jdg = wc.getHandle().pokaz();
            request.setAttribute("jdg", jdg);
            request.getRequestDispatcher("pokaz.jsp").forward(request, response);

        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
