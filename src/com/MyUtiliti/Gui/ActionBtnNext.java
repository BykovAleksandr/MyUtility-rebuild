package com.MyUtiliti.Gui;

import com.MyUtiliti.EqualsIsNotEqualTo.EqualsIsNotEqualTo;
import com.MyUtiliti.ExelEvent.ReadXlsFileFst;
import com.MyUtiliti.ExelEvent.ReadXlsFileSec;
import com.MyUtiliti.ExelEvent.SaveAsExlsFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBtnNext implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        EqualsIsNotEqualTo equalsIsNotEqualTo = new EqualsIsNotEqualTo(ReadXlsFileFst.whatSerchArrayList, ReadXlsFileSec.whearSerchArrayList);
    }
}
