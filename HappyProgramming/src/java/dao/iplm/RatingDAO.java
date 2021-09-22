/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.iplm;

import context.MyDAO;
import entity.Rating;
import entity.User;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Duong
 */
public class RatingDAO extends MyDAO implements dao.RatingDAO{

    @Override
    public ArrayList<Rating> getRating(User user) {
        ArrayList<Rating> list = new ArrayList<>();
        xSql = "select * from [Rating]";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            Rating x;
            String xComment;
            int xFromId, xToId, xRating;
            Timestamp xDate;

            while (rs.next()) {
                xFromId = rs.getInt("fromId");
                xToId = rs.getInt("toId");
                xComment = rs.getString("comment");
                xRating = rs.getInt("ratingAmount");
                xDate = rs.getTimestamp("ratingDate");
                x = new Rating(xFromId, xToId, xComment, xRating, xDate);
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
    public void insert(Rating x) {
        xSql = "insert into [Rating] values (?,?,?,?,GETDATE())";
        try {
            ps = con.prepareStatement(xSql);
            ps.setInt(1, x.getFromId());
            ps.setInt(2, x.getToId());
            ps.setString(3, x.getComment());
            ps.setInt(4, x.getRating());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
