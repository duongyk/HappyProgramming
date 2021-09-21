/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl;

import context.MyDAO;
import entity.Skill;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duong
 */
public class SkillDAO extends MyDAO {
    public List<Skill> getAllSkill() {
        List<Skill> list = new ArrayList<>();
        xSql = "select * from [Skill]";
        int id;
        String name, detail;
        Skill s;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while(rs.next()) {
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
    
    public List<Skill> getSkillByName(String sName) {
        List<Skill> list = new ArrayList<>();
        xSql = "select * from [Skill] where sName like '% " + sName + "%'";
        int id;
        String name, detail;
        Skill s;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while(rs.next()) {
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
}
