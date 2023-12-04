package exam2.menu;

import exam2.models.Sequence;
import exam2.repositiry.Repository;
import exam2.service.Command;
import exam2.service.ReadAndWrite;

import java.io.IOException;
import java.util.Map;

import static exam2.menu.PreparedGame.vozvrat;


public abstract class MenuTask  implements Command {

    ReadAndWrite rw =new ReadAndWrite();

   Repository rp =new Repository();






    public  void start() throws IOException {
        SmallMenu smallMenu =new SmallMenu();
        vozvrat.add("Лисенок");
        smallMenu.getSmallMenu();

    }

   public  void resume() throws IOException {
       SmallMenu smallMenu =new SmallMenu();

       smallMenu.getSmallMenu();
    }

   public void exit() {
        System.exit(0);
    }

    public void save() throws IOException {
        rw.writeResultsToFile( vozvrat.get( vozvrat.size() - 1));
        Menu menu =new Menu();
        menu.getMainMenu();
    }

   public void load() throws IOException {
       SmallMenu smallMenu =new SmallMenu();
       vozvrat.add(rw.readResultsfromFile());
       smallMenu.getSmallMenu();

    }




   public void getWord(String s){
        String[] linesB;
        String B;
        linesB = s.split("->");
        if (linesB.length > 1) {
            B = linesB[1];
        } else {
            B = linesB[0];
        }

        vozvrat.add(B.trim());

    }


    }




