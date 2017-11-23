package com.MyUtiliti;

import com.MyUtiliti.EqualsIsNotEqualTo.EqualsIsNotEqualTo;
import com.MyUtiliti.ExelEvent.ReadXlsFileFst;
import com.MyUtiliti.ExelEvent.ReadXlsFileSec;
import com.MyUtiliti.ExelEvent.SaveAsExlsFile;
import com.MyUtiliti.Gui.Display;


public class Fasad {

    public Fasad(){
/*
        Display display = new Display();
        display.setVisible(true);
*/
        new ReadXlsFileFst("C://Users/bykov/Desktop/test/Read-what.xls");
        new ReadXlsFileSec("C://Users/bykov/Desktop/test/Read-whear.xls");

        new EqualsIsNotEqualTo(ReadXlsFileFst.whatSerchArrayList, ReadXlsFileSec.whearSerchArrayList);
        new SaveAsExlsFile("C://Users/bykov/Desktop/test/result.xls",EqualsIsNotEqualTo.equalsValueArrayList, EqualsIsNotEqualTo.notEqualsValueArrayList);
    }
}
