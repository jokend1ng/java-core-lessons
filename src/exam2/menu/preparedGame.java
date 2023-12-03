package exam2.menu;

import java.io.IOException;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class preparedGame {
    static Scanner sc =new Scanner(System.in);

    static Menu menu = new Menu(new ReturnCommand(),new StartCommand(),new ResumeCommand(),new ExitCommand(),new SaveCommand(),new LoadCommand());
    static SmallMenu smallMenu=new SmallMenu(new SmallChoose1(),new SmallChoose2());
    public static void initiallize() throws IOException {

        menu.MainMenu();
        System.out.println("Сделайте выбор: ");
         int x;
        while ((x=sc.nextInt())!=3){
            switch(x) {
                case 1-> menu.NewGame();
                case 2-> menu.resumeGame();
                case 3-> menu.exit();
                case 4-> menu.saveGame();
                case 5-> menu.load();
                default -> System.out.println("Неверная цифра");
            }
        }
    }
    public static void smallMenu() throws IOException {

        System.out.println("Сделайте выбор: ");
        switch (sc.nextInt()) {
            case 1-> {smallMenu.smallChoose1();
                menu.resumeGame();}
            case 2-> {smallMenu.smallChoose2();
                menu.resumeGame();}
            case 3-> menu.MainMenu();
            default -> System.out.println("не правильно набран номер");
        }
    }
}
