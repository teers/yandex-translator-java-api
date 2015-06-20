package com.rmtheis.yandtran.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

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
            OutputStream out = new FileOutputStream(file);
            String string = info.toString()+"\n";
            out.write(string.getBytes());
        }
        catch (IOException e){
             e.printStackTrace();
        }
    }

}
