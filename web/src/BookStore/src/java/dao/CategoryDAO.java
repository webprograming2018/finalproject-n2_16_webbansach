/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbconnect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Author;
import model.Category;

/**
 *
 * @author HOANG
 */
public class CategoryDAO {
    public ArrayList<Category> getListCategory() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM category";
        ArrayList<Category> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryID(rs.getLong("id"));
                category.setCategoryName(rs.getString("name"));
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Category getCategoryByID(long id) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM category where id = "+id;
        Category category = new Category();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category.setCategoryID(rs.getLong("id"));
                category.setCategoryName(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
//        for (Category c: categoryDAO.getListCategory()){
//            System.out.println(c.getCategoryID()+" "+c.getCategoryName());
//        }
        System.out.println(categoryDAO.getCategoryByID(1).getCategoryName());
    }
}
