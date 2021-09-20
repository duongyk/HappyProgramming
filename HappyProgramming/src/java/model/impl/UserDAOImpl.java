/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl;

import context.MyDAO;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import model.inter.UserDAO;

/**
 *
 * @author Duong
 */
public class UserDAOImpl extends MyDAO implements UserDAO {

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
    public static void main(String[] args) {
        UserDAOImpl dao = new UserDAOImpl();
        User od = new User("duongg","123456");
        ArrayList<User> a=dao.getUserList();
        for(User u: a){
            System.out.println(u.getUsername()+"    "+u.getPasswrd());
            System.out.println("");
        }
    }
}
