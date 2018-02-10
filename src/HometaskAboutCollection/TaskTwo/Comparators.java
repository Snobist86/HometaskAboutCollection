package HometaskAboutCollection.TaskTwo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Comparators {

    public static Student maxAverageMark(List<Student> students) {
        Student theBestStudent = students.get(0);
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (theBestStudent.getAverageMark() <= student.getAverageMark()) {
                theBestStudent = student;
            }
        }
        return theBestStudent;
    }

    public static class StudentFirstNameComparator implements Comparator<Student> {
        private StudentLastNameComparator studentLastNameComparator = new StudentLastNameComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                result = studentLastNameComparator.compare(o1, o2);
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
            return result;
        }
    }

    public static class StudentAgeComparator implements Comparator<Student> {
        private StudentLastNameComparator studentLastNameComparator = new StudentLastNameComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getAge().compareTo(o2.getAge());
            if (result == 0) {
                result = studentLastNameComparator.compare(o1, o2);
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
            return result;
        }
    }

    public static class StudentAverageMarkComparator implements Comparator<Student> {
        private StudentLastNameComparator studentLastNameComparator = new StudentLastNameComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o2.getAverageMark().compareTo(o1.getAverageMark());
            if (result == 0) {
                result = studentLastNameComparator.compare(o1, o2);
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
            return result;
        }
    }

    public static class StudentLastNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
