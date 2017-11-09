package com.MyUtiliti.ExelEvent;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import javax.swing.*;
import java.io.*;

public class SaveAsExlsFile {


    // Add in constructor arrayList with result
    public SaveAsExlsFile(String fileFolderName) {
            // Make exl book
            Workbook wb = new HSSFWorkbook();
            // Create sheet in xls book
            Sheet sheet = wb.createSheet("Equel");
            Sheet sheet1 = wb.createSheet("Not equel");

            // Create row end set position
            Row row = sheet.createRow(0);
            // Create Cell end set position
            Cell cell = row.createCell(0);

            //Write Value in set pos, (row X cell)
            cell.setCellValue("Test");

        try {
            FileOutputStream fos = new FileOutputStream(fileFolderName + ".xls");

            wb.write(fos);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
