package com.rmtheis.yandtran.Frame;

import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;

import javax.swing.*;
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
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTextField textField2;

    public GUI() {

        input = Language.RUSSIAN;
        output = Language.ENGLISH;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            textField2.setText(Translate.translate(textField1.getText(),input,output));
        }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED){

            }
        }
        });
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here

        }
}
