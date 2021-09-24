/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Duong
 */
public class Skill {

    private int sId;
    private String sName;
    private String sDetail;

    public Skill() {
    }

    public Skill(String sName, String sDetail) {
        this.sName = sName;
        this.sDetail = sDetail;
    }
    
    public Skill(int sId, String sName, String sDetail) {
        this.sId = sId;
        this.sName = sName;
        this.sDetail = sDetail;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDetail() {
        return sDetail;
    }

    public void setsDetail(String sDetail) {
        this.sDetail = sDetail;
    }

}
