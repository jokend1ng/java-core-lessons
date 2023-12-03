package exam2.menu;

import exam2.models.Sequence;
import exam2.repositiry.Repository;
import exam2.service.Command;
import exam2.service.Read;
import exam2.service.Write;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class MenuTask implements Read, Write, Command {
    static List<String> vozvrat = new ArrayList<>();

     Map<String, Sequence> list = new Repository().initialMap();


    void start() throws IOException {
        vozvrat.add("Лисенок");
        getSmallMenu();

    }

    void resume() throws IOException {

        getSmallMenu();
    }

    void exit() {
        System.exit(0);
    }

    void save() throws IOException {
        writeResultsToFile(vozvrat.get(vozvrat.size() - 1));

    }

    void load() throws IOException {
        vozvrat.add(readResultsfromFile());
        getSmallMenu();

    }

    void getMainMenu() {
        System.out.println("1. Начать игру");
        System.out.println("2. Вернуться в игру");
        System.out.println("3. Выйти из игры ");
        System.out.println("4. Сохранить игру");
        System.out.println("5. Загрузить игру");
    }

    void getSmallMenu() throws IOException {
        String s = vozvrat.get(vozvrat.size() - 1);

        System.out.println(list.get(s).getDescription());
        if (list.get(s).getWayA() == "" && list.get(s).getWayB() == "") {

        } else {

            System.out.println("1. " + list.get(s).getWayA());
            System.out.println("2. " + list.get(s).getWayB());
            System.out.println("3. Выйти в главное меню");
            preparedGame.smallMenu();
        }
    }
    void getWord(String s){
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




