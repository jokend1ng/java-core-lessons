package exam2.menu;

import exam2.service.Command;

import java.io.IOException;

public class SaveCommand extends MenuTask {




    @Override
    public void execute() throws IOException {
        save();
    }
}
