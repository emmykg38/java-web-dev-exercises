package exercises.controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

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

        String text = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        String[] newThing = new String[32];

        newThing = text.split(" ");

        ArrayList<String> gahh = new ArrayList<>();

        Collections.addAll(gahh, newThing);
//        System.out.println(gahh.toString());


//        ArrayList <String> wordList = new ArrayList<>();
//        wordList.add("Puppy");
//        wordList.add("Salamander");
//        wordList.add("Frogs");
//        wordList.add("Rocks");
//        wordList.add("Volcano");






        int answer = evenNumSum(num);
        System.out.println("The sum of even numbers is " + answer);

//        returnFive(wordList);
        System.out.println("The words that have five letters are: " + returnFive(gahh));
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

    public static ArrayList<String> returnFive(ArrayList <String> arrayList) {
        Scanner input = new Scanner(System.in);
        System.out.println("What length of word would you like to search for?");
        int userInteger = input.nextInt();

        ArrayList <String> newList = new ArrayList<>();

        for (String word : arrayList) {
            if (word.length() == userInteger) {
                newList.add(word);
            }
        }

        return newList;
    }







}




