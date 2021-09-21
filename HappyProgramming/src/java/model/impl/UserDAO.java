/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl;

import context.DBContext;
import context.MyDAO;
import entity.User;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duong
 */
public class UserDAO extends MyDAO {

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
        return (t);
    }

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
    
//    public static void main(String[] args) {
//        UserDAO u = new UserDAO();
//        User x= u.getUser("Mentee01", "Daxua011");
//        if (x!=null) System.out.println("aa");
//    }
}
