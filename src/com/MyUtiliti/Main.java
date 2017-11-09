package com.MyUtiliti;

import com.MyUtiliti.ExelEvent.ReadXlsFile;
import com.MyUtiliti.ExelEvent.SaveAsExlsFile;

public class Main {

    public static void main(String[] args) {

        //ned to make fasad class

        ReadXlsFile readXlsFile = new ReadXlsFile("Q:/Papa-dok/Java Projekt/test/Read-what", "Q:/Papa-dok/Java Projekt/test/Read-file");

        SaveAsExlsFile makeExelFile = new SaveAsExlsFile("Q:/Papa-dok/Java Projekt/test/Null");



        for (String print : ReadXlsFile.whatSerchArrayList){
            System.out.println(print);
        }

    }
}
