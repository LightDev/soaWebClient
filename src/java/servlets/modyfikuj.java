package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rsi.JDG;
import rsi.webClient;

@WebServlet(name = "modyfikuj", urlPatterns = {"/modyfikuj"})
public class modyfikuj extends HttpServlet {

    private webClient wc = new webClient();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            JDG jdg = wc.getHandle().pobierz(request.getParameter("nip"));

            HttpSession session = request.getSession();
            System.out.println("jdg.date " + jdg.dataZalozenia);
            session.setAttribute("nip2", request.getParameter("nip"));
            //request.setAttribute("nip2", request.getParameter("nip"));
            request.setAttribute("nazwa", jdg.nazwa);
            request.setAttribute("nip", jdg.nip);
            request.setAttribute("wlasciciel", jdg.wlasciciel);
            session.setAttribute("dataZalozenia", jdg.dataZalozenia);
            session.setAttribute("krs", jdg.krs);
            session.setAttribute("rodzajDzialalnosci", jdg.rodzajDzialalnosci);
            session.setAttribute("adresSiedziby", jdg.adresSiedziby);
            session.setAttribute("czyPierwsza", jdg.czyPierwsza);
            //session.setAttribute("jdg", newJdg);
            request.getRequestDispatcher("modyfikuj.jsp").forward(request, response);

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
