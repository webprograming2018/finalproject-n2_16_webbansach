/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.fabric.xmlrpc.base.Value;
import com.sun.xml.internal.fastinfoset.stax.events.Util;
import dbconnect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import model.Bill;
import model.BillDetail;
import model.Book;
import model.Pair;

/**
 *
 * @author HOANG
 */
public class BookDAO {

    public static final int limit = 4;

    public List<Book> getListBook() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBook(String s) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE name LIKE '%" + s + "%'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        if (Util.isEmptyString(s)) {
            return list;
        }
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBook(int page) throws SQLException {
        if (page < 1) {
            page = 1;
        }
        int firstResult, maxResult;
        firstResult = (limit * page) - limit;
        maxResult = limit + 1;
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book" + " limit ?,?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, firstResult);
        ps.setInt(2, maxResult);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public Book getBook(long id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE id = " + id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Book book = new Book();
        while (rs.next()) {
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
        }

        return book;
    }

    public List<Book> getListBookByCategory(long categoryID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE category_id = " + categoryID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBookByAuthor(long authorID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE author_id = " + authorID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBookByPublisher(long publisherID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE publisher_id = " + publisherID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBookRelatedByCategory(long bookID) throws SQLException {
        long categoryID = getBook(bookID).getCategoryID();
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE category_id = " + categoryID + " and id != " + bookID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBookRelatedByAuthor(long bookID) throws SQLException {
        long authorID = getBook(bookID).getAuthorID();
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE author_id = " + authorID + " and id != " + bookID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Book> getListBookRelatedByPublisher(long bookID) throws SQLException {
        long publisherID = getBook(bookID).getPublisherID();
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM book WHERE publisher_id = " + publisherID + " and id != " + bookID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setCategoryID(rs.getLong("category_id"));
            book.setAuthorID(rs.getLong("author_id"));
            book.setPublisherID(rs.getLong("publisher_id"));
            book.setName(rs.getString("name"));
            book.setImage(rs.getString("image"));
            book.setPrice(rs.getDouble("price"));
            list.add(book);
        }
        return list;
    }

    public List<Pair> getListBookBestSellByDay(String day) throws SQLException {
        BillDAO billDAO = new BillDAO();
        BillDetailDAO billDetailDAO = new BillDetailDAO();
        List<Bill> listBill = billDAO.getListBilllByDay(day);
        List<BillDetail> listBillDetail = new ArrayList<>();
        for (Bill bill : listBill) {
            listBillDetail.addAll(billDetailDAO.getListBillDetailByBillID(bill.getBillID()));
        }
        HashMap<String, Long> map = new HashMap<>();
        for (BillDetail bd : listBillDetail) {
            String key = getBook(bd.getProductID()).getName();
            long value = bd.getQuantity();
            if (key != null) {
                boolean check = map.containsKey(key);
                if (check) {
                    long value_old = (long) map.get(key);
                    map.put(key, value + value_old);
                } else {
                    map.put(key, value);
                }
            }
        }
        Map<String, Long> sortedMap
                = map.entrySet().stream()
                        .sorted(Entry.comparingByValue())
                        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        map = (HashMap< String, Long>) sortedMap;
        List<Pair> list = new ArrayList<Pair>();
        for (Map.Entry<String, Long> lists : map.entrySet()) {
            list.add(new Pair(lists.getKey(),lists.getValue()));
        }
        return list;
    }

    public static void main(String[] args) throws SQLException {
        BookDAO bookDAO = new BookDAO();
        List<Book> list = bookDAO.getListBookRelatedByCategory(2);
        System.out.println(list.size());
//        for (Pair lists : bookDAO.getListBookBestSellByDay("2018-12-30")) {
//            System.out.println(lists.getName()+ " " + lists.getValue());
//        }
//        for (Book book : list) {
//            System.out.println(book.getId() + "-" + book.getName() + "-" + book.getImage() + "-" + book.getPrice());
//        }
//        Book book = bookDAO.getBook(4);
        // System.out.println(book.getId() + "-" + book.getName() + "-" + book.getImage() + "-" + book.getPrice());
        //    bookDAO.getListBookBestSellByDay("2018-12-29");
    }
}
