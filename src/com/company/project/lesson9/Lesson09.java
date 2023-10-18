package com.company.project.lesson9;

public class Lesson09 {
    public static void main(String[] args) {
        Point point01 = new Point(4, 7);

        // может использоваться при объявлении переменных
        // доступны методы только указанного типа
        Drawable drawablePoint = new Point(5, 0);
        drawablePoint.draw();

        // может использоваться при объявлении переменных
        // доступны методы только указанного типа
        Runnable runnablePoint = new Point(4, 0);
        runnablePoint.run();

        Point point02 = new Point(9, 0);
        Figure figure = new Figure(new Point[]{point01, point02});

        Editor editor01 = new Editor(point01);
        editor01.show();
        editor01.setDrawable(figure);
        editor01.show();



    }
}
