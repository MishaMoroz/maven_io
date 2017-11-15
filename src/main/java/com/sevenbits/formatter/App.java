package com.sevenbits.formatter;

import com.sevenbits.formatter.file.MyReader;
import com.sevenbits.formatter.file.MyWritter;

import java.io.*;

public class App {
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
