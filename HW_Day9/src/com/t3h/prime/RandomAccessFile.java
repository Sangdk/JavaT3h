package com.t3h.prime;

import java.io.File;
import java.io.FileOutputStream;

public class RandomAccessFile {

    public void writeFile(String str) {
        try {
            File f = new File("C:/Users/Deki/Desktop/nbPrime.txt");
            if(!f.exists()){
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(f,true);
            out.write(str.getBytes());
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
