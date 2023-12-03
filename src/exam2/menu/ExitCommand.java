package exam2.menu;

import exam2.service.Command;

public class ExitCommand extends MenuTask  {


    @Override
    public void execute() {
    exit();
    }
}
