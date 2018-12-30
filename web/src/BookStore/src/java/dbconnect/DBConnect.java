/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HOANG
 */
public class DBConnect {

    public static Connection cons = null;

    public static Connection getConnection() {
        if (cons == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cons = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/new_schema", "root", "root");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection() + "");
    }

}
