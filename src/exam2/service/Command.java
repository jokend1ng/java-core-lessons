package exam2.service;

import java.io.IOException;

public interface Command {
    void execute() throws IOException;
    String getName();
    void  setName(String s);
}
