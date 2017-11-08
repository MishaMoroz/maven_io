package homework.io;
import java.io.*;

public class Formatter {
    Formatter(){
    }

    void format(MyReader reader, MyWritter writer) throws IOException{
        char ch;
        char prevCh=' ';
        int indLvl=0;
        while (reader.hasNext()){
            ch = reader.read();
            if(ch != ' ' && ch != '\n') {
                if(ch == '{'){
                    writer.write(' ');
                    indLvl++;
                }
                if(ch=='}'){
                    indLvl--;
                    writer.indent(indLvl);
                }
                if(prevCh == ';' || prevCh == '{' || prevCh == '}'){
                    writer.write('\n');
                    writer.indent(indLvl);
                }
                writer.write(ch);
                prevCh = ch;
            }
        }
        reader.close();
    }
}
