package exam2.menu;

import exam2.repositiry.Repository;
import exam2.service.Command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static exam2.menu.PreparedGame.vozvrat;

public class SmallMenu {
    private final Map<Integer, Command> smallMenu;
    Repository rp = new Repository();

    public SmallMenu() {
        smallMenu = new HashMap<>();
        smallMenu.put(1, new SmallChoose1());
        smallMenu.put(2, new SmallChoose2());
        smallMenu.put(3, new ReturnCommand("3. Выйти в главное меню"));


    }

    public void getChoice(int value) throws IOException {
        smallMenu.get(value).execute();

    }

    public void getSmallMenu() throws IOException {
        smallMenu.get(1).setName("1. " + rp.getIgra().get(vozvrat.get(vozvrat.size() - 1)).getWayA());
        smallMenu.get(2).setName("2. " + rp.getIgra().get(vozvrat.get(vozvrat.size() - 1)).getWayB());

        System.out.println(rp.getIgra().get(vozvrat.get(vozvrat.size() - 1)).getDescription());
        if (("1. ").equals(smallMenu.get(1).getName())&& "2. ".equals(smallMenu.get(2).getName())){
            System.exit(0);
        } else {

            for (int i = 1; i <= smallMenu.size(); i++) {
                System.out.println(smallMenu.get(i).getName());
            }
            int choice = PreparedGame.sc.nextInt();
            if (choice == 3) {
                smallMenu.get(3).execute();
            } else {
                getChoice(choice);
                getSmallMenu();
            }

        }


    }

}
