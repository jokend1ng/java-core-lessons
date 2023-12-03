package exam2.menu;

import exam2.service.Command;

import java.io.IOException;

public class StartCommand extends MenuTask {


    @Override
    public void execute() throws IOException {
        start();
    }
}
