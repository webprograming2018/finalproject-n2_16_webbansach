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

/**
 *
 * @author HOANG
 */
public class AuthorDAO {
    public ArrayList<Author> getListAuthor() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM author";
        ArrayList<Author> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author();
                author.setAuthor_ID(rs.getLong("author_id"));
                author.setAuthor_Name(rs.getString("author_name"));
                list.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Author getAuthorByID(long id) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM author where author_id = "+id;
        Author author = new Author();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                author.setAuthor_ID(rs.getLong("author_id"));
                author.setAuthor_Name(rs.getString("author_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return author;
    }
    public static void main(String[] args) {
        AuthorDAO authorDAO = new AuthorDAO();
//        for (Author c: authorDAO.getListAuthor()){
//            System.out.println(c.getAuthor_ID()+" "+c.getAuthor_Name());
//        }
        System.out.println(authorDAO.getAuthorByID(1).getAuthor_Name());
    }
}
