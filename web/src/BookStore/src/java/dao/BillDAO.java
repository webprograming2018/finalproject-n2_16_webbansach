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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Bill;
import model.Bill;
import model.BillDetail;

/**
 *
 * @author TUNGDUONG
 */
public class BillDAO {

    public void insertBill(Bill bill) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO bill VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, bill.getBillID());
        ps.setLong(2, bill.getUserID());
        ps.setDouble(3, bill.getTotal());
        ps.setString(4, bill.getPayment());
        ps.setString(5, bill.getAddress());
        ps.setTimestamp(6, bill.getDate());
        ps.executeUpdate();
    }
    
    public List<Bill> getListBilllByDay(String day)throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "select * from bill where date like '%" + day + "%'";
        PreparedStatement ps = connection.prepareCall(sql);        
        ResultSet rs = ps.executeQuery();
        List<Bill> list = new ArrayList<>();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setBillID(rs.getLong("billID"));
            bill.setUserID(rs.getLong("userID"));
            bill.setTotal(rs.getDouble("total"));
            bill.setPayment(rs.getString("payment"));
            bill.setAddress(rs.getString("address"));
            bill.setDate(rs.getTimestamp("date"));
            list.add(bill);
        }
        return list;
    }
    
    public List<Bill> getListBilllByMonth(String month)throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "select * from bill where date like '%-" + month + "-%'";
        PreparedStatement ps = connection.prepareCall(sql);        
        ResultSet rs = ps.executeQuery();
        List<Bill> list = new ArrayList<>();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setBillID(rs.getLong("billID"));
            bill.setUserID(rs.getLong("userID"));
            bill.setTotal(rs.getDouble("total"));
            bill.setPayment(rs.getString("payment"));
            bill.setAddress(rs.getString("address"));
            bill.setDate(rs.getTimestamp("date"));
            list.add(bill);
        }
        return list;
    }
    
    public static void main(String[] args) throws SQLException {
        BillDAO billDAO = new BillDAO();
        List<Bill> list = billDAO.getListBilllByMonth("1");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getBillID()+" "+list.get(i).getDate());
        }
    }

}
