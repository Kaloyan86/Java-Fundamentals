package ObjectAndClasses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Student
        // name -> String
        // averageScore -> double

        Student st1 = new Student("Kaloyan", 5.00);
        Student st2 = new Student("Peter", 5.50);
        Student st3 = new Student("Anton", 5.00);
        Student st4 = new Student("Sofia", 6.00);

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

        students.stream()
                .sorted((s1, s2) -> {
                    int sort = Double.compare(s2.getAverageScore(), s1.getAverageScore());
                    if (sort == 0) {
                        return s1.getName().compareTo(s2.getName());
                    }
                    return sort;
                })
                .forEach(s -> System.out.println(s.toString()));

    }

    static class Student {
        String name;
        double averageScore;

        Student() {

        }

        Student(String name, double averageScore) {
            this.name = name;
            this.averageScore = averageScore;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }


        @Override
        public String toString() {
            return String.format("I am %s with avg. score: %.2f", this.name, this.averageScore);
        }
    }


}
