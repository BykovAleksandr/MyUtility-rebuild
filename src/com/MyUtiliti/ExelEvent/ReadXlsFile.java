package com.MyUtiliti.ExelEvent;

import com.MyUtiliti.Parser.ParserXlsFile;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ReadXlsFile {

    //Serch value array list
    public static ArrayList<String> whatSerchArrayList = new ArrayList<>();
    public static ArrayList<String> whearSerchArrayList = new ArrayList<>();


    // в конструктор передаем путь к файлу
    // read end whrit in arrayList search values
    public ReadXlsFile(String readWhatSerch, String readWherSerch){

        try {
            FileInputStream fis = new FileInputStream(readWhatSerch + ".xls");
            Workbook wb = new HSSFWorkbook(fis);

            // init arrayList serch Value
            for (Row row : wb.getSheetAt(0)){
                for (Cell cell : row){
                    whatSerchArrayList.add(ParserXlsFile.parserXlsFile(getCellText(cell)));
                }
            }

            fis.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        // read and write values in arrayList for the search
        // Читаем/парсим/проверяем вернувшиеся данные на "null"

        try {
            FileInputStream fis = new FileInputStream(readWherSerch + ".xls");
            Workbook wb = new HSSFWorkbook(fis);

            for (Row row : wb.getSheetAt(0)){

                for (Cell cell : row){
                    String tmpString = ParserXlsFile.parserXlsFile(getCellText(cell));
                    if (tmpString != null){
                            whearSerchArrayList.add(tmpString);
                        }


                }

            }

            fis.close();


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    // Method which initialize end sort inStrim Values
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
            //case Cell.CELL_TYPE_BLANK:
                //break;
            default:
                System.out.println("Her");
        }

        return result;
    }

}
