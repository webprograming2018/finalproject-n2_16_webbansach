/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.BookDAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pair;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author HOANG
 */
public class ThongKeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=bestseller.xls");
        String day = request.getParameter("day");
        System.out.println(day);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Best seller");
        BookDAO bookDAO = new BookDAO();
        try {
            List<Pair> list = bookDAO.getListBookBestSellByDay(day);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        int rownum = 0;
        Cell cell;
        Row row;
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        //title
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Top 10 sản phẩm bán chạy nhất ngày "+day+":");
        cell.setCellStyle(style);
        rownum++;
        row = sheet.createRow(rownum);
        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell.setCellStyle(style);
        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên sách");
        cell.setCellStyle(style);
        // Salary
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Số lượng");
        cell.setCellStyle(style);
        // Data
        try {
            for (Pair lists: bookDAO.getListBookBestSellByDay(day)) {
                rownum++;
                row = sheet.createRow(rownum);
                //STT
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(rownum-1);
                //name
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(lists.getName());
                //quantity
                cell = row.createCell(2, CellType.NUMERIC);
                cell.setCellValue(lists.getValue());
                if (rownum==11) break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        workbook.write(response.getOutputStream()); // Write workbook to response.
        workbook.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
    
}
