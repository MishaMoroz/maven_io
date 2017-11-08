package homework.io;
import java.io.*;

public class Homeworkio {
    public static void main(String[] args) {


        try{
            MyReader reader = new MyReader(args[0]);
            MyWritter writer = new MyWritter(args[1]);
            Formatter formatter = new Formatter();
            formatter.format(reader, writer);

        } catch (IOException e){
            e.printStackTrace();
        }
        }
    }
