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
import java.util.List;
import model.BillDetail;
import model.BillDetail;
import model.Book;

/**
 *
 * @author TUNGDUONG
 */
public class BillDetailDAO {

    public void insertBillDetail(BillDetail bd) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO billdetail VALUES(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, bd.getBillDetailID());
        ps.setLong(2, bd.getBillID());
        ps.setLong(3, bd.getProductID());
        ps.setDouble(4, bd.getPrice());
        ps.setInt(5, bd.getQuantity());
        ps.executeUpdate();
    }
    public List<BillDetail> getListBillDetailByBillID(long billID)throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "select * from billdetail where billID = "+billID;
        PreparedStatement ps = connection.prepareCall(sql);        
        ResultSet rs = ps.executeQuery();
        List<BillDetail> list = new ArrayList<>();
        while (rs.next()) {
            BillDetail billDetail = new BillDetail();
            billDetail.setBillDetailID(rs.getLong("billDetailID"));
            billDetail.setBillID(rs.getLong("billID"));
            billDetail.setProductID(rs.getLong("productID"));
            billDetail.setPrice(rs.getDouble("price"));
            billDetail.setQuantity(rs.getInt("quantity"));
            list.add(billDetail);
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        //new BillDetailDAO().insertBillDetail(new BillDetail(0, 0, 0, 0, 0));
        BillDetailDAO dao = new BillDetailDAO();
        for (BillDetail bd: dao.getListBillDetailByBillID(Long.parseLong("1545995454279"))){
            System.out.println(bd.getProductID());
        }
    }

}
