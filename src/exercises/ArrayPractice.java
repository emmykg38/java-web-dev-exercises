package exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newText = text.split("\\.");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println(Arrays.toString(newText));
    }
}
