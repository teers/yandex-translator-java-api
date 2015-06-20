package com.rmtheis.yandtran.clipboard;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

/**
 * Created by l1fe on 20.06.2015.
 */
public class GetClipboard  {
    public static String getClipBoard (){
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        boolean textIsValid = (contents!=null && contents.isDataFlavorSupported(DataFlavor.stringFlavor));
        if (textIsValid){
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
