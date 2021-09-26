/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.iplm;

import context.MyDAO;
import entity.Skill;
import java.util.ArrayList;

/**
 *
 * @author Duong
 */
public class SkillDAO extends MyDAO implements dao.SkillDAO {

    @Override
    public ArrayList<Skill> getAllSkill() {
        ArrayList<Skill> list = new ArrayList<>();
        xSql = "select * from [Skill]";
        int id;
        String name, detail;
        Skill s;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("sId");
                name = rs.getString("sName");
                detail = rs.getString("sDetail");
                s = new Skill(id, name, detail);
                list.add(s);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<Skill> getSkillByName(String sName) {
        ArrayList<Skill> list = new ArrayList<>();
        xSql = "select * from [Skill] where sName like '% " + sName + "%'";
        int id;
        String name, detail;
        Skill s;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("sId");
                name = rs.getString("sName");
                detail = rs.getString("sDetail");
                s = new Skill(id, name, detail);
                list.add(s);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
   
    //viet thang
    @Override
    public Skill getSkillById(String sId) {
        Skill skill = new Skill();
        
        xSql = "select * from [Skill] where sId='"+sId+"'";
        
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                skill.setsId(rs.getInt("sId"));
                skill.setsName(rs.getString("sName"));
                skill.setsDetail(rs.getString("sDetail"));
            } 
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return skill;
    }
    
//    public static void main(String[] args) {
//        SkillDAO u = new SkillDAO();
//        ArrayList<Skill> x= u.getAllSkill();
//        for (Skill s: x){
//            System.out.println(s.getsName()+" "+s.getsId());
//        }
//    }
}
