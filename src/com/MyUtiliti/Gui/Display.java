package com.MyUtiliti.Gui;

import javax.swing.*;

public class Display extends JFrame {

    private JLabel labelWhatSerch = new JLabel("Что ищем ");
    private JLabel LabeleName = new JLabel();

    private JLabel labelWgearSerch = new JLabel("Где и щем ");
    private JLabel LabeleNameTwo = new JLabel();


    private JButton jButtonDownloundFst = new JButton("Звгрузить файл");
    private JButton jButtonDownloundSec = new JButton("Звгрузить файл");

    private JButton jBottonNext = new JButton("Далее");
    private JButton jBottonCancel = new JButton("Отмена");

    public Display(){

        super("Utilit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);

        setResizable(false);
        this.setLocationRelativeTo(null);

    }
}
