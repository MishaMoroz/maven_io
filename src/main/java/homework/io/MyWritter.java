package homework.io;

import java.io.*;

public class MyWritter implements IWritter{
    private FileWriter writer = null;

    MyWritter(String sourseFile) throws IOException{
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

}
