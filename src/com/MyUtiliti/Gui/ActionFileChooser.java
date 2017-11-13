package com.MyUtiliti.Gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ActionFileChooser {

    //TODO to remake new class which wrigt get file folder veriable
    // static file folder variable
    public static String fileFolderName;

    public ActionFileChooser(JButton btnName, JLabel labbleName) {


        btnName.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JFileChooser fileOpen = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("xls file","xls");
                fileOpen.addChoosableFileFilter(filter);

                int ret = fileOpen.showDialog(null, "Открыть файл");



                if (ret == JFileChooser.APPROVE_OPTION){
                    File file  = fileOpen.getSelectedFile();
                    labbleName.setText(file.getName());

                    try {
                        String tmp = file.getCanonicalPath();
                        //set static variable
                        setFileFolderName(tmp);

                    } catch (IOException e1)
                    {
                        JOptionPane.showMessageDialog(null, e1);
                        //e1.printStackTrace();
                    }
                }
                //System.out.println(tmp);
            }
        });


    }

    //return static variable
    void setFileFolderName(String fileFolderName) {
        this.fileFolderName = fileFolderName;
        System.out.println(fileFolderName);
    }


}
