package com.rmtheis.yandtran.IO;

import java.io.*;

/**
 * Created by l1fe on 20.06.2015.
 */
public class IOclass {
    private static final File file = new File("resources/history.file");
    public static void writeHistory (InfoClass info){
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            Writer out = new OutputStreamWriter(new FileOutputStream(file,true));
            out.write(info.toString()+"\n");
            out.close();
        }
        catch (IOException e){
             e.printStackTrace();
        }
    }
    public InfoClass[] readFile(){
        InfoClass[] result = new InfoClass[10];
        try {
            Reader in = new InputStreamReader(new FileInputStream(file));

            in.close();
        }
        catch (IOException  e){
            e.printStackTrace();
        }
        return result;
    }

}
