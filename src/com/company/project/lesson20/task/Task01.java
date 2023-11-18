package com.company.project.lesson20.task;

import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)), new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)), new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)), new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)), new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)), new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)), new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)), new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)), new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)), new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)), new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)), new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))));


        // Используя методы Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        Map<Student.Gender, List<Student>> sortebByGenders = students.stream().collect(Collectors.groupingBy(Student::getGender));

        //  2. Найти средний возраст учеников
        double averageAge = students.stream().map(s -> {
            int getbirthday = s.getBirth().getYear();
            int getnow = LocalDate.now().getYear();
            return getnow - getbirthday;
        }).mapToInt(Integer::intValue).average().orElse(0);

        //  3. Найти самого младшего ученика - Stream -> min(Comparator<Student>): int compare(T o1, T o2);
        int min = students.stream().map(s -> {
            int getbirthday = s.getBirth().getYear();
            int getnow = LocalDate.now().getYear();
            return getnow - getbirthday;
        }).mapToInt(Integer::intValue).min().orElse(0);

        //  5. Собрать учеников в группы по году рождения, результат - Map<Integer, List<Student>>
        Map<Integer, List<Student>> sortedByBirth = students.stream().collect(Collectors.groupingBy(s -> s.getBirth().getYear()));

        //  6. Отсортировать по полу, дате рождения, имени (в обратном порядке),
        Comparator<Student> sortedBy3Fields = Comparator.comparing(Student::getGender).thenComparing(Student::getBirth).thenComparing(Student::getName).reversed();
        students.stream().sorted(sortedBy3Fields).forEach(System.out::println);


        //  собрать в список (ArrayList)
        ArrayList<Student> studentsArray = students.stream().collect(Collectors.toCollection(ArrayList::new));


        Comparator<Student> byGender = (s1, s2) -> s1.getGender().ordinal() - s2.getGender().ordinal();
        Comparator<Student> byBirth = (s1, s2) -> s1.getBirth().compareTo(s2.getBirth());
        Comparator<Student> studentComparator = byGender.thenComparing(byBirth);
        // Function<? super T, ? extends U> keyExtractor
        // R apply(T value);
        studentComparator = Comparator.<Student>comparingInt(student -> student.getGender().ordinal())
                // .thenComparing(Comparator.comparing(student -> student.getBirth()))
                .thenComparing(student -> student.getBirth()).thenComparing(student -> student.getName()).reversed();
        ArrayList<Student> studentArrayList = students.stream().sorted(studentComparator).collect(Collectors.toCollection(ArrayList::new));


        // 7. Собрать в список всех учеников с именем
        String someName = "Петр";
        students.stream().filter(s -> s.getName().equals(someName)).collect(Collectors.toList());

        //  8. Собрать Map<Student.Gender, Integer>,
        Map<Student.Gender, Integer> eightTask = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.summingInt(s -> Period.between(s.getBirth(), LocalDate.now()).getYears())));
        //  где Student.Gender - пол,
        //  Integer - суммарный возраст учеников данного пола

    }
}