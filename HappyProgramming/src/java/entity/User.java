/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Duong
 */
public class User {

    private int uId;
    private String username;
    private String passwrd;
    private String fullname;
    private String uMail;
    private String uPhone;
    private Date dob;
    private String gender;
    private String avatar;
    private String role;
    private int status;

    public User() {
    }

    public User(String username, String passwrd) {
        this.username = username;
        this.passwrd = passwrd;
    }

    public User(String username, String passwrd, String fullname, String uMail, String uPhone, Date dob, String gender, String avatar, String role, int status) {
        this.username = username;
        this.passwrd = passwrd;
        this.fullname = fullname;
        this.uMail = uMail;
        this.uPhone = uPhone;
        this.dob = dob;
        this.gender = gender;
        this.avatar = avatar;
        this.role = role;
        this.status = status;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
