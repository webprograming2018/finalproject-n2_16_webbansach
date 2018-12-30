///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package excel;
//
//import dao.BookDAO;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//
///**
// *
// * @author HOANG
// */
//public class CreateExcel {
//    
//    static String day = "2018-12-28";
//
//    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
//        HSSFFont font = workbook.createFont();
//        font.setBold(true);
//        HSSFCellStyle style = workbook.createCellStyle();
//        style.setFont(font);
//        return style;
//    }
//    public static void main(String[] args) throws Exception {
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        HSSFSheet sheet = workbook.createSheet("Best seller");
//        BookDAO bookDAO = new BookDAO();
//        HashMap<String, Long> map = bookDAO.getListBookBestSellByDay(day);
//        int rownum = 0;
//        Cell cell;
//        Row row;
//        HSSFCellStyle style = createStyleForTitle(workbook);
//        row = sheet.createRow(rownum);
//        //title
//        cell = row.createCell(1, CellType.STRING);
//        cell.setCellValue("Top 10 sản phẩm bán chạy nhất ngày "+day+":");
//        cell.setCellStyle(style);
//        rownum++;
//        row = sheet.createRow(rownum);
//        // EmpNo
//        cell = row.createCell(0, CellType.STRING);
//        cell.setCellValue("STT");
//        cell.setCellStyle(style);
//        // EmpName
//        cell = row.createCell(1, CellType.STRING);
//        cell.setCellValue("Tên sách");
//        cell.setCellStyle(style);
//        // Salary
//        cell = row.createCell(2, CellType.STRING);
//        cell.setCellValue("Số lượng");
//        cell.setCellStyle(style);
//        // Data
//        
//        for (Map.Entry<String, Long> list: bookDAO.getListBookBestSellByDay("2018-12-29").entrySet()) {
//            rownum++;
//            row = sheet.createRow(rownum);
//            //STT
//            cell = row.createCell(0, CellType.STRING);
//            cell.setCellValue(rownum-1);
//            //name
//            cell = row.createCell(1, CellType.STRING);
//            cell.setCellValue(list.getKey());
//            //quantity
//            cell = row.createCell(2, CellType.NUMERIC);
//            cell.setCellValue(list.getValue());
//            if (rownum==11) break;
//        }
//        
//        File file = new File("Desktop/bestseller.xls");
//        file.getParentFile().mkdirs();
// 
//        FileOutputStream outFile = new FileOutputStream(file);
//        workbook.write(outFile);
//        System.out.println("Created file: " + file.getAbsolutePath());
//    }
//}
