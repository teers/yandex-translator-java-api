package com.rmtheis.yandtran.gui;

import com.rmtheis.yandtran.clipboard.GetClipboard;
import com.rmtheis.yandtran.detect.Detect;
import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.language.LanguageForGUI;
import com.rmtheis.yandtran.translate.Translate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by l1fee on 12.06.15.
 */
public class GUI {
    Language input,output;
    private JPanel panel1;
    private JButton Button;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextArea textField1;
    private JTextArea textField2;
    private JButton button1;

    public GUI() {
        //set default
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);
        textField1.setBorder(border);
        textField2.setBorder(border);
        input = Language.RUSSIAN;
        output = Language.RUSSIAN;
        comboBox1.setModel(new DefaultComboBoxModel(LanguageForGUI.values()));
        comboBox2.setModel(new DefaultComboBoxModel(LanguageForGUI.values()));
        comboBox1.addItem("Autodetect");
        comboBox1.setSelectedItem("Autodetect");
        comboBox2.setSelectedItem(LanguageForGUI.ru);
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem()=="Autodetect"){
                    input = Detect.detect(textField1.getText());
                }
           textField2.setText(Translate.translate(textField1.getText(), input, output));
        }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED && e.getItem()!="Autodetect"){
                    input = Language.valueOf(e.getItem().toString());
                }
            }
        });
        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    output = Language.valueOf(e.getItem().toString());
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textField1.setText(GetClipboard.getClipBoard());
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Translate");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
