package com.company.project.lesson9;

// множественное наследование интерфейсов разрешено
/*
interface B{}
interface C{}
interface A extends B, C{}
*/
// нельзя создать экземпляр интерфейса
// интерфейс может содержать абстрактные методы (abstract public по умолчанию)
// интерфейс может содержать default или static методы с реализацией (public по умолчанию)
// может содержать константы (public static final свойства)
public interface Drawable /*extends Runnable, Cloneable*/ {
    /*abstract public*/ void draw();
    /*abstract public*/ void clear();
    /*public*/ default void update(){
        clear();
        draw();
    }
    /*public*/ static Drawable createAction(){
        return null;
    }
}
