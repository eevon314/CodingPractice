import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        //Create an array
        String[] numbers = {"one", "two", "three", "four", "five"};
        //Reverse the array
        for (int i = 0; i<Math.floor(numbers.length/2); i++) {
            int len = numbers.length;
            int k = len - i - 1;
            String temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public int solution(List<String> shopping) {
        return 0;
    }

}
