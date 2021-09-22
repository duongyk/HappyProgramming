/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.iplm;

import context.MyDAO;
import entity.Request;
import entity.User;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Duong
 */
public class RequestDAO extends MyDAO implements dao.RequestDAO{

    @Override
    public ArrayList<Request> getListByMe(User user) {
        ArrayList<Request> list = new ArrayList<>();
        xSql = "select * from [Request]";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            Request x;
            String xTitle, xContent, xStatus;
            int xMentor;
            Date dlDate, dlHour;

            while (rs.next()) {
                xTitle = rs.getString("title");
                xContent = rs.getString("content");
                xStatus = rs.getString("status");
                xMentor = rs.getInt("toId");
                dlDate = rs.getDate("deadlineDate");
                dlHour = rs.getDate("deadlineHour");
                x = new Request(xTitle, xContent, user.getuId(), xMentor, dlDate, dlHour, xStatus);
                list.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (list);
    }
    
    @Override
    public int createRequest(Request req) {
        ArrayList<Request> list = new ArrayList<>();
        int n = 0;
        xSql = "insert into [Request](title, content, fromId, toId, deadlineDate, deadlineHour, rStatus) "
                + "values (?, ?, ?, ?, getdate(), getdate(), 'pending');";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, req.getTitle());
            ps.setString(2, req.getContent());
            ps.setInt(3, req.getToId());
            ps.setInt(4, req.getToId());
            ps.setDate(5, req.getDeadlineDate());
            ps.setDate(6, req.getDeadlineHour());
            ps.setString(7, req.getStatus());
            n = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}
