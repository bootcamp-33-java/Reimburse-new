/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ParkingLot;
import models.Reimburse;
import models.Vehicle;
import tools.HibernateUtil;

/**
 *
 * @author FIKRI-PC
 */
@WebServlet(name = "dashboardEmployee", urlPatterns = {"/dashboardEmployee"})
public class dashboardEmployee extends HttpServlet {
private GeneralDAO<Reimburse> rdao = new GeneralDAO<>(HibernateUtil.getSessionFactory(), Reimburse.class);
private GeneralDAO<ParkingLot> pdao = new GeneralDAO<>(HibernateUtil.getSessionFactory(), ParkingLot.class);
private GeneralDAO<Vehicle> vdao = new GeneralDAO<>(HibernateUtil.getSessionFactory(), Vehicle.class);
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
        try (PrintWriter out = response.getWriter()) {
           request.getSession().setAttribute("reimburses", rdao.getAll());
           request.getSession().setAttribute("parkingLots", pdao.getAll());
           request.getSession().setAttribute("vehicles", vdao.getAll());
           RequestDispatcher rd = request.getRequestDispatcher("dashboardEmployee.jsp");
            rd.include(request, response);
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
        String id = request.getParameter("id");
        String history = request.getParameter("history");
        String ticket = request.getParameter("ticket");
        String date = request.getParameter("date");
        String price = request.getParameter("price");
        String employee = request.getParameter("employee");
        String parking = request.getParameter("parking");
        String vehicle = request.getParameter("vehicle");
        String owner = request.getParameter("owner");
        String stnk = request.getParameter("stnk");
        
//        Reimburse reimburse = new Reimburse(0, 0, ticket, Date.valueOf(date), new BigDecimal(price), 
//                0,  new ParkingLot(Integer.parseInt(parking) ),new Vehicle(new String(vehicle)) );
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
