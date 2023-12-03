package exam2.menu;

import exam2.service.Command;

import java.io.IOException;

public class ResumeCommand extends MenuTask {


    @Override
    public void execute() throws IOException {
        resume();
    }
}
