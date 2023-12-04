package exam2.menu;

import exam2.service.Command;

import java.io.IOException;

public class ResumeCommand extends MenuTask {

private String name;

    public ResumeCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() throws IOException {
        resume();
    }
}
