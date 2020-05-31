/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author makaf
 */
@WebServlet(name = "loginServlet_1", urlPatterns = {"/loginServlet_1"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /******************************************************************************
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *******************************************************************************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("Served at: ").append(request.getContextPath());
         
        try{
            String id = request.getParameter("userId");
            String pass = request.getParameter("userPass");
            
            //Login Credentials
            System.out.println("***************************************************************");
            System.out.println("The user Id entered: "+id);
            System.out.println("The password entered: "+pass);
            System.out.println("***************************************************************");
            
            customers c1;
            c1 = new customers();
            c1.SelectDB(Integer.parseInt(id));
            c1.Display();
            
            String usrDbLog = pass;
            String usrDbPass = c1.getCustPass();
            
            
            //Database Login Credentials
            System.out.println("***************************************************************");
            System.out.println("Database logged in using id:  " +usrDbLog);
            System.out.println("Database logged in using pass: "+usrDbPass);
            System.out.println("***************************************************************");
            
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("c1",c1);
            
            //Login Authentication 
            if(usrDbLog.equals(usrDbPass)){
                System.out.println("Valid Login!");
                RequestDispatcher rs;
                rs = request.getRequestDispatcher("/displayAccounts.jsp");
                rs.forward(request, response);
            }else{
                System.out.println("Invalid Login!");
                RequestDispatcher rs;
                rs = request.getRequestDispatcher("/errorPage.jsp");
                rs.forward(request, response);
            }      
        }catch(IOException | NumberFormatException | ServletException ex){
            System.out.println("Servlet encountered an Error!");
            System.err.println(ex);
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
