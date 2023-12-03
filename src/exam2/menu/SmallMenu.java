package exam2.menu;

import exam2.service.Command;

import java.io.IOException;

public class SmallMenu {
    Command select1;
    Command select2;

    public SmallMenu(Command select1, Command select2) {
        this.select1 = select1;
        this.select2 = select2;
    }
    void smallChoose1() throws IOException {
        select1.execute();

    }
    void smallChoose2() throws IOException {
        select2.execute();
    }
}
