package exercises.controlflowandcollections;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent = "";


        System.out.println("Enter the ID numbers (or ENTER to finish): ");

        do {
            System.out.print("ID: ");
            Integer newId = input.nextInt();

            if (newId != (-1)) {
                System.out.print("Student name: ");
                newStudent = input.next();
                students.put(newId, newStudent);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}

