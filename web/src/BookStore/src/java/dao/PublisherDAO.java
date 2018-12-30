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
import model.Publisher;

/**
 *
 * @author HOANG
 */
public class PublisherDAO {
    public ArrayList<Publisher> getListPublisher() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM publisher";
        ArrayList<Publisher> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Publisher publisher = new Publisher();
                publisher.setPublisher_ID(rs.getLong("publisher_id"));
                publisher.setPublisher_Name(rs.getString("publisher_name"));
                list.add(publisher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Publisher getPublisherByID(long id) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM publisher where publisher_id = "+id;
        Publisher publisher = new Publisher();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                publisher.setPublisher_ID(rs.getLong("publisher_id"));
                publisher.setPublisher_Name(rs.getString("publisher_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return publisher;
    }
    public static void main(String[] args) {
        PublisherDAO publisherDAO = new PublisherDAO();
        for (Publisher c: publisherDAO.getListPublisher()){
            System.out.println(c.getPublisher_ID()+" "+c.getPublisher_Name());
        }
    }
}
