package com.MyUtiliti.ExelEvent;

import com.MyUtiliti.Parser.ParserXlsFile;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ReadXlsFileFst {

    //Serch value array list
    public static ArrayList<String> whatSerchArrayList = new ArrayList<>();

//TODO remake all
    // в конструктор передаем путь к файлу
    // read end whrit in arrayList search values
    public ReadXlsFileFst(String readWhatSerch) {

        try {
            FileInputStream fis = new FileInputStream(readWhatSerch);
            Workbook wb = new HSSFWorkbook(fis);

            // init arrayList serch Value
            for (Row row : wb.getSheetAt(0)) {
                for (Cell cell : row) {
                    whatSerchArrayList.add(ParserXlsFile.parserXlsFile(getCellText(cell)));
                }
            }

            fis.close();
            /*
            for (String print : whatSerchArrayList){
                System.out.println("Что ищем: " + print);
            }
            */
            JOptionPane.showMessageDialog(null, "Файл с искомыми значениями успешно загружен!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

    }      // read and write values in arrayList for the search
        // Читаем/парсим/проверяем вернувшиеся данные на "null"

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
