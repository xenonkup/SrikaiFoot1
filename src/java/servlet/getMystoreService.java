package services;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Mystores;
import org.json.JSONObject;
import servlet.Mystoresdata;

public class getMystoreService extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String requestUrl = request.getRequestURI();
        String name = requestUrl.substring("/SrikaiFoot/GetMystoreService/".length());
        Mystores mystore = Mystoresdata.getInstance().getMystore(name);
        if (mystore != null) {
            String json = "{\n";
            json += "\"fname\": " + JSONObject.quote(mystore.getFname()) + ",\n";
            json += "\"lname\": " + JSONObject.quote(mystore.getLname()) + ",\n";
            json += "\"shirt\": " + JSONObject.quote(mystore.getShirt()) + "\n";
            json += "\"trousers\": " + JSONObject.quote(mystore.getTrousers()) + "\n";
            json += "\"hat\": " + JSONObject.quote(mystore.getHat()) + "\n";
            json += "\"price\": " + JSONObject.quote(mystore.getPrice()) + "\n";
            json += "\"address\": " + JSONObject.quote(mystore.getAddress()) + "\n";
            json += "}";
            response.getOutputStream().println(json);
        } else {
            //That person wasn't found, so return an empty JSON object. We could also return an error.
            response.getOutputStream().println("{}");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
