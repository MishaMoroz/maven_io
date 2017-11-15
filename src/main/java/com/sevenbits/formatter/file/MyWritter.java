package com.sevenbits.formatter.file;

import com.sevenbits.formatter.IClosable;
import com.sevenbits.formatter.IWritter;
//import com.sevenbits.formatter.IClosable;


import java.io.*;

public class MyWritter implements IWritter, IClosable {
    private FileWriter writer = null;

    public MyWritter(String sourseFile) throws IOException{
        writer = new FileWriter(sourseFile, true);
    }

    public void write(char ch) throws IOException{
        writer.append(ch);
        writer.flush();
    }
    public void indent(int lvl) throws IOException{
        for(int i=0; i<lvl; i++)
        writer.write("    ");
        writer.flush();
    }
    public void close() throws IOException{
        writer.close();
    }

}
