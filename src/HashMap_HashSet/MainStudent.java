package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Katarina", 23, "Noxus");
        Student student2 = new Student("Garen", 26, "Demacia");
        Student student3 = new Student("Kennen", 24, "Ionia");
        Student student4 = new Student("Kayle", 25, "Targon");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);

        System.out.println(student1.equals(student2));
        System.out.println(studentMap.containsKey(1));
        System.out.println(" ");


        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
