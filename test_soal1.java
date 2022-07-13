import java.util.Arrays;

public class FizzBuzz{
    public static void main(String[] args) {
            int[] data = { 1, 2, 4, 3, 10, 11, 20, 5, 100, 200 };
            
            for (int i = 0; i < data.length; i++) 
            { 
                if (data[i] == 5 && data[i] == 11) {
                    System.out.println("FizzBuzz"); 
                } else if (data[i] == 5) {
                     System.out.println("Fizz"); 
                } else if (data[i] == 11) {
                     System.out.println("Buzz"); 
                } else {
                    System.out.println(data[i]);
                }

            }
    }
}