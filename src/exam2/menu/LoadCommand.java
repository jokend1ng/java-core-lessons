package exam2.menu;



import java.io.IOException;

public class LoadCommand extends MenuTask {
private String name;

    public LoadCommand(String name) {
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
        load();
    }
}
