/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Mystore2.Mystore1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/MyStore"})
public class MyStore extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        String Fname = request.getParameter("fname");
        String Lname = request.getParameter("lname");
        String Shirt= request.getParameter("shirt");
        String Trousers = request.getParameter("trousers");
        String Hat = request.getParameter("hat");
        String Price = request.getParameter("price");
        String Address = request.getParameter("address");
        
        Mystore1 mystore  = new Mystore1();
        mystore.setFname(Fname);
        mystore.setLname(Lname);
        mystore.setShirt(Shirt);
        mystore.setTrousers(Trousers);
        mystore.setHat(Hat);
        mystore.setPrice(Price);
        mystore.setAddress(Address);
        
        HttpSession session = request.getSession();
        session.setAttribute("mystore",mystore);
        
        // forward ไปหน้า updateMovie.jsp
        request.getRequestDispatcher("/addnewMemberToFirebase.jsp").forward(request, response);
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
