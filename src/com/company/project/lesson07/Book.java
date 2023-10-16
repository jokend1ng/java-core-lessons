package com.company.project.lesson07;

import java.util.Arrays;

// com.company.project.lesson07.Book
public class Book {
    // модификатор private - свойство, конструктор, метод доступны только в текущем классе
    private String name; // значение по умолчанию null (как и для всех ссылочных типов)
    private boolean isPublished; // // значение по умолчанию false (для типа boolean)
    // хранит ссылки на нескольких авторов
    private Author[] authors;
    private int count;

    // ПКМ -> Generate -> Constructor
    // numberOfAuthors - размер массива authors
    // значение numberOfAuthors должно находиться в диапазоне [1, 5)
    public Book(String name, int numberOfAuthors) {
        if (numberOfAuthors>=1&numberOfAuthors<5) {
            authors = new Author[numberOfAuthors];
            setName(name);
        }else{
            throw new ArrayIndexOutOfBoundsException("Не может быть столько авторов");
        }
         // вызов метода внутри класса
    }
    // ПКМ -> Generate -> Setter
    public void setName(String name){ // Setter
        // if (name == null) return;
        if (name == null) { // если значение name равно null
            // будет выброшено исключение, программа завершит выполнение с ошибкой
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }
    // ПКМ -> Generate -> Getter
    public String getName(){ // Getter
        return name;
    }
    // ПКМ -> Generate -> Setter and Getter

    // метод добавления нового автора в массив authors
    public void addAddAuthor(Author author){
        if (count >=1&&count<5&author!=null&!Arrays.asList(authors).contains(author)){
            authors[count]=author;
            count ++;
        }
    }
}
