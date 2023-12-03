package exam2.menu;

import java.io.IOException;

public class SmallChoose1 extends MenuTask{
    @Override
    public void execute() throws IOException {
        getWord(list.get(vozvrat.get(vozvrat.size()-1)).getWayA());
    }
}
