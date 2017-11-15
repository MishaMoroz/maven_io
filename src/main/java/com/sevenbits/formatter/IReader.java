package com.sevenbits.formatter;

import java.io.IOException;

public interface IReader {
    char read() throws IOException;
    void close() throws IOException;
    boolean hasNext() throws IOException;
}