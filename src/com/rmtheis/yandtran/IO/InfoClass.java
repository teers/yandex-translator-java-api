package com.rmtheis.yandtran.IO;

import java.util.Date;

/**
 * Created by l1fe on 20.06.2015.
 */
public class InfoClass {
    private String inputText,outputText;
    private Date date;
    public void setInputText(String string){
        this.inputText = string;
    }
    public String getInputText(){
        return this.inputText;
    }
    public void setOutputText(String string){
        this.outputText = string;
    }
    public String getOutputText(){
        return this.outputText;
    }
    public void setDate (Date date){
        this.date=date;
    }
    public Date getDate(){
        return this.date;
    }


    @Override
    public String toString(){
        return date.toString()+" исходный текст: "+inputText + " переведенный текс: " + outputText;
    }
}
