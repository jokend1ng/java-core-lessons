package exam2.menu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PreparedGame {
    File file = new File("save.txt");

    public static List<String> vozvrat = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);
    private final SmallMenu smallMenu = new SmallMenu();
    Menu menu =new Menu();

    public  void initiallize() throws IOException {
        file.createNewFile();
        menu.getMainMenu();
        System.out.println("Сделайте выбор: ");
        int x;
        while ((x = sc.nextInt()) <= menu.getSize()) {
            menu.getChoice(x);
        }
    }

    public  void initializeSmallMenu() throws IOException {System.out.println("Сделайте выбор: ");
           smallMenu.getChoice(sc.nextInt());
        }
    }



