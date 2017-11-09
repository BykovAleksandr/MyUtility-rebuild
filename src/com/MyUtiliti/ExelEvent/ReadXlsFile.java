package com.MyUtiliti.ExelEvent;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ReadXlsFile {

    //Serch value array list
    public static ArrayList<String> whatSerchArrayList = new ArrayList<>();


    // в конструктор передаем путь к файлу
    // read end whrit in array what serch
    public ReadXlsFile(String readWhatSerch, String readWherSerch){

        try {
            FileInputStream fis = new FileInputStream(readWhatSerch + ".xls");
            Workbook wb = new HSSFWorkbook(fis);

            //TODO
            for (Row row : wb.getSheetAt(0)){
                for (Cell cell : row){
                    System.out.println(cell);
                }
            }

            fis.close();


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        // read whear serch

        try {
            FileInputStream fis = new FileInputStream(readWherSerch + ".xls");
            Workbook wb = new HSSFWorkbook(fis);

            for (Row row : wb.getSheetAt(0)){
                //TODO
                for (Cell cell : row){


                }
            }

            fis.close();


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    // Method which initialize end sort in Values
    public static String getCellText(Cell cell){

        String result = "";

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                result = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    result = cell.getDateCellValue().toString();
                } else {
                    result = Double.toString(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                result = Boolean.toString(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA:
                result =  cell.getCellFormula().toString();
                break;
            case Cell.CELL_TYPE_BLANK:
                break;
            default:
                System.out.println("&&");
        }

        return result;
    }
}
