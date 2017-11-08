package homework.io;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class MyReader implements IReader{
    private InputStreamReader reader = null;
    private FileInputStream file = null;

    MyReader(String sourceFile) throws IOException{
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