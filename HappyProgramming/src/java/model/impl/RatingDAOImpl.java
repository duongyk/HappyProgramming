/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl;

import context.MyDAO;
import model.inter.RatingDAO;

/**
 *
 * @author Duong
 */
public class RatingDAOImpl extends MyDAO implements RatingDAO{

    @Override
    public void insert() {
        System.out.println("a");
    }

    @Override
    public void update() {
        
    }

    @Override
    public void delete() {
        
    }
    
}
