package com.MyUtiliti;

import com.MyUtiliti.EqualsIsNotEqualTo.EqualsIsNotEqualTo;
import com.MyUtiliti.ExelEvent.ReadXlsFile;
import com.MyUtiliti.ExelEvent.SaveAsExlsFile;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        //ned to make fasad class

        ReadXlsFile readXlsFile = new ReadXlsFile("Q:/Papa-dok/Java Projekt/test/Read-what", "Q:/Papa-dok/Java Projekt/test/Read-file");

        SaveAsExlsFile makeExelFile = new SaveAsExlsFile("Q:/Papa-dok/Java Projekt/test/Null");


        EqualsIsNotEqualTo equalsIsNotEqualTo = new EqualsIsNotEqualTo(ReadXlsFile.whatSerchArrayList, ReadXlsFile.whearSerchArrayList);



        for (String print : EqualsIsNotEqualTo.equalsValueArrayList){
            System.out.println(print);
        }

        System.out.println();

        for (String print : EqualsIsNotEqualTo.notEqualsValueArrayList){
            System.out.println("Нет совпадений: " + print);
        }

/*
        for (String print : ReadXlsFile.whatSerchArrayList){
            System.out.println("Что ищем: " + print);
        }

        System.out.println();

        for (String print : ReadXlsFile.whearSerchArrayList){
            System.out.println("Где ищем: " + print);
        }
*/
    }
}
