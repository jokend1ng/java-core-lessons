package exam2.menu;

import exam2.repositiry.Repository;
import exam2.service.Command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Menu {
    Command start;
    Command resume;
    Command exit;
    Command save;
    Command load;
    Command returnMainMenu;

    public Menu(Command returnMainMenu,Command start, Command resume, Command exit, Command save, Command load) {
        this.start = start;
        this.resume = resume;
        this.exit = exit;
        this.save = save;
        if(!"save.txt".isEmpty()) {
            this.load = load;
        }
        this.returnMainMenu = returnMainMenu;
    }

    public void MainMenu() throws IOException {
        returnMainMenu.execute();
    }
    void NewGame() throws IOException {
        start.execute();
    }
    void resumeGame() throws IOException {
        resume.execute();
    }
    void exit() throws IOException {
        exit.execute();
    }
    void saveGame() throws IOException {
        save.execute();
    }
    void load() throws IOException {
        load.execute();
    }

}


