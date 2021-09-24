/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.iplm;

import context.DBContext;
import context.MyDAO;
import entity.User;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duong
 */
public class UserDAO extends MyDAO implements dao.UserDAO {

    @Override
    public ArrayList<User> getUserList() {
        ArrayList<User> t = new ArrayList<>();
        xSql = "select * from [User]";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            String xPro_id, xPro_name;
            User x;
            while (rs.next()) {
                xPro_id = rs.getString("username");
                xPro_name = rs.getString("password");
                x = new User(xPro_id, xPro_name);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public User getUser(String xName, String xPass) {

        xSql = "select * from [User] where username=? and password=?";

        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xName);
            ps.setString(2, xPass);
            rs = ps.executeQuery();
            //User(int uId, String username, String password, String fullname, String uMail, 
            //String uPhone, Date dob, String gender, String uAvatar,int uRole)
            if (rs.next()) {
                return new User(rs.getInt("uId"), rs.getString("username"), rs.getString("password"),
                        rs.getString("fullname"), rs.getString("uMail"), rs.getString("uPhone"),
                        rs.getDate("dob"), rs.getString("gender"), rs.getString("uAvatar"), rs.getInt("uRole"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    

    public User getUserById(int uid) {
        
        xSql = "select * from [User] where uid='"+uid+"'";

        try {
            ps = con.prepareStatement(xSql);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return new User(rs.getInt("uId"), rs.getString("username"), rs.getString("password"),
                        rs.getString("fullname"), rs.getString("uMail"), rs.getString("uPhone"),
                        rs.getDate("dob"), rs.getString("gender"), rs.getString("uAvatar"), rs.getInt("uRole"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    // viet thang
    public ArrayList<User> getMentorList() {
        ArrayList<User> mentorList = new ArrayList<>();
        xSql = "select * from [User] where uRole='2'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            int uid;
            String username;
            
            User mentor;
            
            while (rs.next()) {
                uid = Integer.parseInt(rs.getString("uId"));
                username = rs.getString("username");
                mentor = new User(uid, username);
                mentorList.add(mentor);
            }
            
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mentorList;
    }
       
    //viet thang
    public int updateUserInfo(int uid, User user) {
        int status = 0;
        
        SimpleDateFormat sdf = 
                  new SimpleDateFormat("yyyy-MM-dd");
        
        String stringDOB = sdf.format(user.getDob());
        
        xSql = "update [User]"
                +" set fullname='"+user.getFullname()+"'"
                    +" ,uMail='"+user.getuMail()+"'"
                    +" ,uPhone='"+user.getuPhone()+"'"
                    +" ,DOB='"+stringDOB+"'"
                    +" ,gender='"+user.getGender()+"'"
                +" where uId='"+uid+"'";

        try {
            ps = con.prepareStatement(xSql);
            
            status = ps.executeUpdate();
                 
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return status;
    }
    
    public static void main(String[] args) {
//        UserDAO u = new UserDAO();
//        User x= u.getUser("admin", "administrator");
//        if (x!=null) System.out.println(x.getuRole());


            // viet thang test chuc nang update user 
            
//          UserDAO dao = new UserDAO();
//          User user = dao.getUserById(1);
//          
//          user.setFullname("Yasuo");
//          
//          String source ="2001-12-09";
//          
//          SimpleDateFormat sdf = 
//                  new SimpleDateFormat("yyyy-MM-dd");
//          
//          Date date1 = null;
//          
//            try {
//                
//                date1 = sdf.parse(source);
//                
//                System.out.println(sdf.format(date1));
//                
//            } catch (ParseException ex) {
//                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//          
//          user.setDob(date1);
//          
//          int status = dao.updateUserInfo(1, user);
//          
//          System.out.println("status = "+status);
    }
    
    
    
}


