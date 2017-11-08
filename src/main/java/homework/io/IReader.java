package homework.io;

import java.io.IOException;

public interface IReader {
    char read() throws IOException;
    void close() throws IOException;
    boolean hasNext() throws IOException;
}