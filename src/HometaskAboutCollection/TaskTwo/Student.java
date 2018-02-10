package HometaskAboutCollection.TaskTwo;

import java.util.Collection;

public class Student {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageMark;

    public Student(String firstName, String lastName, Integer age, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public static <T> void printList(Collection<T> list) {
        for (T student : list) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + averageMark + " ";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }
}
