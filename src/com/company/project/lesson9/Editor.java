package com.company.project.lesson9;

// от final класса нельзя наследоваться
public final class Editor {
    // может использоваться при объявлении переменных
    // доступны методы только указанного типа
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        // final аргументы доступны только для чтения
        this.drawable = drawable;
    }

    public void show(){
        drawable.update();
    }
    public void hide(){
        drawable.clear();
    }
}
