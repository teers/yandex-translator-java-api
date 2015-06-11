package com.rmtheis.yandtran.Frame;

import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by l1fee on 11.06.15.
 */
public class Frame extends JFrame {
    JTextArea input,output;
    JButton button;
    public Frame(){
        super("Yandex translate");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLayout(new BorderLayout());
        input = new JTextArea();
        output = new JTextArea();
        button = new JButton();
        int inputWidth = getSize().width/2-10;
        int inputHeight = getSize().height/2;
        input.setPreferredSize(new Dimension(inputWidth,inputHeight));
        output.setPreferredSize(new Dimension(inputWidth,inputHeight));
        output.setEditable(false);
        input.setLineWrap(true);
        output.setLineWrap(true);
        button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                output.setText(Translate.translate(input.getText(), Language.RUSSIAN,Language.ENGLISH));
            }
        });
        button.setText("Перевести");
        add("West",input);
        add("East",output);
        add("North",button);
    }
}
