package com.sevenbits.formatter.file;

import com.sevenbits.formatter.IClosable;
import com.sevenbits.formatter.IReader;

import java.io.*;

public class MyReader implements IReader, IClosable {
    private InputStreamReader reader = null;
    private FileInputStream file = null;

    public MyReader(String sourceFile) throws IOException{
        file = new FileInputStream(sourceFile);
        reader = new InputStreamReader(file, "UTF-8");
    }

    public char read() throws IOException{
        return (char) reader.read();
    }

    public void close() throws IOException{
        reader.close();
    }

    public boolean hasNext() throws IOException{
        return reader.ready();
    }
}