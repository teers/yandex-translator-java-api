package com.rmtheis.yandtran.Frame;

import com.rmtheis.yandtran.detect.Detect;
import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.language.LanguageForGUI;
import com.rmtheis.yandtran.translate.Translate;

import javax.swing.*;
import javax.swing.plaf.synth.SynthButtonUI;
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
    private JTextField textField1;
    private JTextField textField2;

    public GUI() {
        //set default
        input = Language.RUSSIAN;
        output = Language.ENGLISH;
        comboBox1.setModel(new DefaultComboBoxModel(LanguageForGUI.values()));
        comboBox2.setModel(new DefaultComboBoxModel(LanguageForGUI.values()));
        comboBox1.addItem("Autodetect");
        comboBox1.setSelectedItem("Autodetect");
        comboBox2.setSelectedItem(LanguageForGUI.en);
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
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Translate");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
