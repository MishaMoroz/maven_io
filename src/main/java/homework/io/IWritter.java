package homework.io;

import java.io.IOException;

public interface IWritter {
    void write(char ch) throws IOException;
    void indent(int lvl) throws IOException;
}
