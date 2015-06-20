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
            FileWriter out = new FileWriter(file);
           // OutputStream out = new FileOutputStream(file);
            String string = info.toString()+"\n";
            out.write(string);
            out.close();
        }
        catch (IOException e){
             e.printStackTrace();
        }
    }

}
