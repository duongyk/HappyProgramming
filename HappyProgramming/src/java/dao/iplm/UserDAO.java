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
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
            User x;
            while (rs.next()) {
                x = new User(rs.getInt("uId"), rs.getString("username"), rs.getString("password"),
                        rs.getString("fullname"), rs.getString("uMail"), rs.getString("uPhone"),
                        rs.getDate("dob"), rs.getString("gender"), rs.getString("uAvatar"), rs.getInt("uRole"));
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }

    public User getUserById(int uId) {
        xSql = "SELECT * FROM [User] WHERE [uId] = " + uId;
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

    @Override
    public User getUser(String xName, String xPass) {

        xSql = "select * from [User] where username=? and password=?";

        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xName);
            ps.setString(2, xPass);
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
    public User checkAccount(String xName) { // check xem tài khoản này đã tồn tại trong db chưa

        xSql = "select * from [User] where username=? ";

        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xName);// neu user co roi thi se tra ve 1 object con chua co thi tra ve null        
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
    public void sighup( String uName ,String uPass, String uMail, String fName, String phone,String uAddress,String sex,String DOB,String  role  ){
        String query=" insert into [User]  value(?,?,?,?,?,?,?,?,?)" ;
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
         try {
            ps = con.prepareStatement(xSql);
            ps.setString(1,uName); ps.setString(2,uPass); ps.setString(3,uMail);ps.setString(4,fName);
            
            ps.setString(5,phone);;ps.setString(6,uAddress);ps.setString(7,sex); ps.setString(8,DOB); ps.setString(9, role);
            
            rs = ps.executeQuery();
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }


//    public static void main(String[] args) {
//        UserDAO u = new UserDAO();
//        User x= u.getUser("admin", "administrator");
//        if (x!=null) System.out.println(x.getuRole());
//    }
}