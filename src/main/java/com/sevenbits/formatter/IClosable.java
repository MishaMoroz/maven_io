package com.sevenbits.formatter;
import java.lang.AutoCloseable;

public interface IClosable extends AutoCloseable {
   @Override
   void close() throws Exception;
}