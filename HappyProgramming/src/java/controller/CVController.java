/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.iplm.CVDAO;
import dao.iplm.SkillDAO;
import dao.iplm.SkillMentorDAO;
import dao.iplm.UserDAO;
import entity.CV;
import entity.Skill;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class CVController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String service = request.getParameter("service");
            
            CVDAO cvdao = new CVDAO();
            UserDAO userdao = new UserDAO();
            SkillMentorDAO smdao = new SkillMentorDAO();
            
            if(service.equals("updateCV")) {
                int uid = Integer.parseInt(request.getParameter("uid"));
                
                CV mentorCV = cvdao.getMentorCV(uid);
                
                User mentorProfile = userdao.getUserById(uid);
                
                // get all skill id from mentor
                ArrayList<String> mentorSkill = smdao.getAll_Id_Skill_Mentor(request.getParameter("uid"));
                
                //get all available skill
                SkillDAO skilldao = new SkillDAO();
                
                ArrayList<Skill> allSkill = skilldao.getAllSkill();
                
                request.setAttribute("allskill", allSkill);
                request.setAttribute("mentorskill", mentorSkill);
                request.setAttribute("mentorprofile", mentorProfile);
                request.setAttribute("mentorcv", mentorCV);
                request.setAttribute("title","UPDATE CV");
                
                RequestDispatcher rd = request.getRequestDispatcher("/Update-CV.jsp");
                
                rd.forward(request, response);

            }
            
            if(service.equals("submitFormUpdate")) {
                
                int uid = Integer.parseInt(request.getParameter("uid"));
                
                String username = request.getParameter("username");
                
                String fullname= request.getParameter("fullname");
                
                SimpleDateFormat dateFormat = 
                  new SimpleDateFormat("yyyy-MM-dd");
                
                Date dob = null;
                
                try {
                    dob = dateFormat.parse(request.getParameter("dob"));
                } catch (ParseException ex) {
                    Logger.getLogger(CVController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sex = request.getParameter("sex");
                
                String mail = request.getParameter("mail");
                
                String phone = request.getParameter("phone");
                
                String achievement = request.getParameter("achievement");
                
                String  profession = request.getParameter("profession");
                
                String professionIntro = request.getParameter("professionIntro");
                
                String serviceDescription = request.getParameter("serviceDescription");
                
                User mentorInfo = new User(uid, "", phone, fullname, mail, phone, dob, phone, mail, 2);
                
                CV mentorCV = new CV(uid, profession, professionIntro, serviceDescription, achievement);

                userdao.updateUserInfo(uid, mentorInfo);
                cvdao.updateCV(uid, mentorCV);
                
                response.sendRedirect("demoMentorList.jsp");
            }
            
            if(service.equals("viewCVSkill")) {
                
                String uid = request.getParameter("uid");
                                
                ArrayList<Skill> skillList = smdao.getAll_Skill_Mentor(uid);
                
                request.setAttribute("skilllist", skillList);
                request.setAttribute("uid", uid);
                
                RequestDispatcher rd = request.getRequestDispatcher("/demoMentorSkill.jsp");
                rd.forward(request, response);
                
                
            }
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