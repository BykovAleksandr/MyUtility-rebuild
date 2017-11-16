package com.MyUtiliti.Gui;

import com.MyUtiliti.ExelEvent.SaveAsExlsFile;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ActionFileChooserSaveXls {

    private static String fileFolder;

    public ActionFileChooserSaveXls(JButton btnName, JLabel labbleName) {


        btnName.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JFileChooser fileOpen = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("xls file","xls");
                fileOpen.addChoosableFileFilter(filter);

                int ret = fileOpen.showDialog(null, "Открыть файл");

                if (ret == JFileChooser.APPROVE_OPTION){
                    File file  = fileOpen.getSelectedFile();
                    labbleName.setText(file.getAbsolutePath());


                    try {
                        String tmp = file.getCanonicalPath();
                        setFileFolder(tmp);
                    } catch (IOException e1)
                    {
                        JOptionPane.showMessageDialog(null, e1);
                        //e1.printStackTrace();
                    }
                }
            }
        });
    }
    public String getFileFolder(){
        return fileFolder;
    }
    public void setFileFolder(String fileFolder){
        this.fileFolder = fileFolder;
    }


}
