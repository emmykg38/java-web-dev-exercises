package exercises.controlflowandcollections;

import java.util.ArrayList;

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


        int answer = evenNumSum(num);
        System.out.println("The sum of even numbers is " + answer);
    }

    public static int evenNumSum(ArrayList<Integer> numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    sum += numbers.get(i);
                }
            }
            return sum;
    }

    //for each loop is better for looping through ArrayLists

    public static ArrayList<String> returnFive(String[] args) {
        ArrayList <String> wordList = new ArrayList<>();
        wordList.add("Puppy");
        wordList.add("Salamander");
        wordList.add("Frogs");
        wordList.add("Rocks");
        wordList.add("Volcano");

        return wordList;
    }







}




