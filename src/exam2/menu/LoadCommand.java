package exam2.menu;


import exam2.service.Read;

import java.io.IOException;

public class LoadCommand extends MenuTask {


    @Override
    public void execute() throws IOException {
        load();
    }
}
