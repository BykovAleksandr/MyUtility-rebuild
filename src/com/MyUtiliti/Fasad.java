package com.MyUtiliti;

import com.MyUtiliti.ExelEvent.ReadXlsFileFst;
import com.MyUtiliti.ExelEvent.ReadXlsFileSec;
import com.MyUtiliti.Gui.Display;


public class Fasad {

    public Fasad(){

        Display display = new Display();
        display.setVisible(true);

        //System.out.println(ActionFileChooserSaveXls.getFileFolderName());

        //ReadXlsFileFst readXlsFile = new ReadXlsFileFst(ActionFileChooserSaveXls.getFileFolderName(), secFileFolderName);
        /*
        SaveAsExlsFile makeExelFile = new SaveAsExlsFile("Q:/Papa-dok/Java Projekt/test/Null");
        EqualsIsNotEqualTo equalsIsNotEqualTo = new EqualsIsNotEqualTo(ReadXlsFileFst.whatSerchArrayList, ReadXlsFileFst.whearSerchArrayList);



        for (String print : EqualsIsNotEqualTo.equalsValueArrayList){
            System.out.println(print);
        }

        System.out.println();

        for (String print : EqualsIsNotEqualTo.notEqualsValueArrayList){
            System.out.println("Нет совпадений: " + print);
        }

*/
        for (String print : ReadXlsFileFst.whatSerchArrayList){
            System.out.println("Что ищем: " + print);
        }

        System.out.println();

        for (String print : ReadXlsFileSec.whearSerchArrayList){
            System.out.println("Где ищем: " + print);
        }

    }
}
