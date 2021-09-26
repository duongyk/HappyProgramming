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
public class SkillMentorDAO extends MyDAO implements dao.SkillMentorDAO{

    @Override
    public ArrayList<Skill> getAll_Skill_Mentor(String uid) {
        ArrayList<Skill> skillList = new ArrayList<>();
        SkillDAO skilldao = new SkillDAO();
        
        Skill skill = new Skill();
        
        try {
          
            xSql = "select * from SkillMentor where uId='"+uid+"'";
            
            ps = con.prepareStatement(xSql);
            
            rs = ps.executeQuery();              
            
            while(rs.next()) {
                skill = skilldao.getSkillById(rs.getString("sId"));
                
                skillList.add(skill);
                
                skill = new Skill();
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return skillList;
    }

    @Override
    public ArrayList<String> getAll_Id_Skill_Mentor(String uId) {
        ArrayList<String> skill_Id_List = new ArrayList<>();
    
        try {
          
            xSql = "select * from SkillMentor where uId='"+uId+"'";
            
            ps = con.prepareStatement(xSql);
            
            rs = ps.executeQuery();              
            
            while(rs.next()) {

                skill_Id_List.add(rs.getString("sId"));
     
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return skill_Id_List;
    }
    
    
    
}
