package HometaskAboutCollection.TaskTwo;

import java.util.ArrayList;
import java.util.List;

import static HometaskAboutCollection.TaskTwo.Comparators.maxAverageMark;
import static HometaskAboutCollection.TaskTwo.Student.printList;

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Денис", "Акулич", 32, 7.4));
        list.add(new Student("Александр", "Бабок", 32, 6.5));
        list.add(new Student("Татьяна", "Верниковская", 32, 6.6));
        list.add(new Student("Андрей", "Волков", 32, 8.0));
        list.add(new Student("Дмитрий", "Глинский", 32, 7.2));
        list.add(new Student("Максим", "Забабуха", 31, 5.5));
        list.add(new Student("Александр", "Котов", 32, 7.0));
        list.add(new Student("Иван", "Лещик", 32, 5.4));
        list.add(new Student("Михаил", "Обератко", 33, 6.5));
        list.add(new Student("Николай", "Панков", 32, 7.2));
        list.add(new Student("Александр", "Сащенко", 32, 8.4));
        list.add(new Student("Алексей", "Снаговский", 32, 6.7));
        list.add(new Student("Александр", "Степанов", 32, 7.0));
        list.add(new Student("Дмитрий", "Шиманский", 32, 6.6));
        list.add(new Student("Наталья", "Шиханцова", 32, 7.1));

        printList(list);
        System.out.println();
        System.out.println("Лучший студент: " + maxAverageMark(list));

        list.sort(new Comparators.StudentFirstNameComparator());
        System.out.println("\nСписок студентов по имени и фамилии: ");
        printList(list);

        list.sort(new Comparators.StudentAgeComparator());
        System.out.println("\nСписок студентов по возрасту: ");
        printList(list);

        list.sort(new Comparators.StudentAverageMarkComparator());
        System.out.println("\nСписок студентов по среднему баллу: ");
        printList(list);

    }
}
