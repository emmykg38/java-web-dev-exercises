package exercises;

import java.util.ArrayList;
//import.java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(7);
        num.add(9);
        num.add(4);
        num.add(6);
        num.add(11);
        num.add(1);
        num.add(14);
        num.add(19);
        num.add(17);

        System.out.println("The sum of even numbers is " + evenNumSum(num));
    }

    public static int evenNumSum(ArrayList<Integer> array) {
            int sum = 0;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) % 2 == 0) {
                    sum += array.get(i);
                }
            }
            return sum;
    }


}




