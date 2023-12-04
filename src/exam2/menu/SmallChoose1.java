package exam2.menu;

import java.io.IOException;

import static exam2.menu.PreparedGame.vozvrat;

public class SmallChoose1 extends MenuTask{
    private String name;



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() throws IOException {
        getWord(rp.getIgra().get(vozvrat.get(vozvrat.size()-1)).getWayA());
    }

    @Override
    public String getName() {
    return  this.name;
    }
}
