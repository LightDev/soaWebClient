package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rsi.JDG;
import rsi.webClient;

@WebServlet(name = "modyfikujSummary", urlPatterns = {"/modyfikujSummary"})
public class modyfikujSummary extends HttpServlet {

    private webClient wc = new webClient();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nip = (String) request.getSession().getAttribute("nip2");
            System.out.println("nip2 " + nip);
            JDG jdg = new JDG(
                    request.getParameter("nip"),
                    request.getParameter("nazwa"),
                    request.getParameter("wlasciciel"),
                    (String) request.getSession().getAttribute("dataZalozenia"),
                    (String) request.getSession().getAttribute("krs"),
                    (String) request.getSession().getAttribute("rodzajDzialalnosci"),
                    (String) request.getSession().getAttribute("adresSiedziby"),
                    (request.getSession().getAttribute("czyPierwsza").equals("Tak")) ? true : false);
            String s = "";
            try {
                s = wc.getHandle().modyfikuj(jdg);
            } catch (RuntimeException e) {
                String msg = "Wystąpił błąd przy połączeniu z usługą osobową.<br>" + e.getMessage() + "<br>";
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            request.setAttribute("info", s);
            request.getRequestDispatcher("modyfikujSummary.jsp").forward(request, response);


        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
