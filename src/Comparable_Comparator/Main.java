package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Student student1 = new Student("Katarina", 23, "Noxus");
        Student student2 = new Student("Garen", 26, "Demacia");
        Student student3 = new Student("Kennen", 24, "Ionia");
        Student student4 = new Student("Kayle", 25, "Targon");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for(Student student : list){
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Student student : list){
            System.out.println(student.toString());
        }

        System.out.println(" ");
        long end = System.currentTimeMillis() - start;
        System.out.println("thoi gian chay: " + end + " ms");
    }
}
