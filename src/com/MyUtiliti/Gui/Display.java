package com.MyUtiliti.Gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;


public class Display extends JFrame {

    private JPanel rootJp = new JPanel();
    private JLabel labelWhatSerch = new JLabel("Что ищем ");
    private JLabel labelWhearSerch = new JLabel("Где и щем ");
    private JButton jButtonDownloundFst = new JButton("Загрузить файл");
    private JButton jButtonDownloundSec = new JButton("Загрузить файл");
    private JButton jBottonSave = new JButton("Сохранить");
    private JLabel labelSave = new JLabel("Сохранить файл: ");
    private JButton jBottonNext = new JButton("Далее");
    private JButton jBottonCancel = new JButton("Отмена");


    public Display(){

        super("Utilit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,250);

        //setResizable(false);
        this.setLocationRelativeTo(null);
        rootJp.setLayout(new BorderLayout());

        JLabel labeleName = new JLabel("Имя файла");
        JLabel labeleNameTwo = new JLabel("Имя файла");
        JLabel labelSavePath = new JLabel("Путь к файлу");

        JPanel northLableArea = new JPanel();
        Border northBorder = BorderFactory.createTitledBorder("Равно не равно");
        northLableArea.setBorder(northBorder);
        JLabel noteLable = new JLabel("Полностью переделана: структура програмы. Version 2.0");
        northLableArea.add(noteLable);

        rootJp.add(northLableArea, BorderLayout.NORTH);

        JPanel centre = new JPanel();
        Border centreBorder = BorderFactory.createTitledBorder("Выберите файлы");
        centre.setBorder(centreBorder);
        centre.setLayout(new GridLayout(3,3,2,2));
        //centre.setBounds(10,10,600,5);
        centre.add(labelWhatSerch);
        centre.add(labeleName);
        centre.add(jButtonDownloundFst);

        centre.add(labelWhearSerch);
        centre.add(labeleNameTwo);
        centre.add(jButtonDownloundSec);

        centre.add(labelSave);
        centre.add(labelSavePath);
        centre.add(jBottonSave);


        JPanel south = new JPanel();
        Border southBorder = BorderFactory.createTitledBorder("Выберите действие");
        south.setBorder(southBorder);
        south.setLayout(new GridLayout(1,2,2,2));
        south.add(jBottonNext);
        south.add(jBottonCancel);

        rootJp.add(south,BorderLayout.SOUTH);
        rootJp.add(centre,BorderLayout.CENTER);
        rootJp.add(northLableArea, BorderLayout.NORTH);

        setContentPane(rootJp);

        //TODO

        ActionFileChooserFstXls fsBtnChooser = new ActionFileChooserFstXls(jButtonDownloundFst, labeleName);
        ActionFileChooserSecXls secBtnChooser = new ActionFileChooserSecXls(jButtonDownloundSec, labeleNameTwo);
        ActionFileChooserSaveXls saveBtnChooser = new ActionFileChooserSaveXls(jBottonSave, labelSavePath);

        // Start EqualsIsNotEqualTo
        ActionListener actionBtnNext = new ActionBtnNext(saveBtnChooser.getFileFolder());
        jBottonNext.addActionListener(actionBtnNext);
    }
}
