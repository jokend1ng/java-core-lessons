package exam2.menu;

import exam2.service.Command;

public class ExitCommand extends MenuTask  {
private String name;

    public ExitCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
    exit();
    }
}
