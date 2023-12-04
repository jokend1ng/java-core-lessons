package exam2.menu;

import exam2.service.Command;
import exam2.service.ReadAndWrite;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Menu {

    private Map<Integer,Command>commands;
    ReadAndWrite rw =new ReadAndWrite();
    public Menu() {
        this.commands = new HashMap<>();
        commands.put(1,new StartCommand("1. Начать игру"));
        commands.put(2,new ResumeCommand("2. Вернуться в игру"));
        commands.put(3,new ExitCommand("3. Выйти из игры "));
        commands.put(4,new SaveCommand("4. Сохранить игру"));
        commands.put(5,new LoadCommand("5. Загрузить игру"));
    }
    public void getChoice(int s) throws IOException {
        commands.get(s).execute();
    }
    public void getMainMenu() throws IOException {
        for (int i = 1; i <= commands.size(); i++) {
            if (i == 5 && rw.readResultsfromFile() == null) {

            } else {
                System.out.println(commands.get(i).getName());
            }
        }
    }
    public int getSize(){
        return commands.size();
    }


}


