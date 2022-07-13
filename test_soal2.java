import java.util.Arrays;

public class TipeDataFilter {
    public static void main(String[] args) {
            String[] arr = { "1", "ka", "67", "wah", "1772", "edukasi", "7", "98", "-1" };
            int intValue;

            for (int i = 0; i < arr.length; i++) 
            { 
                try {
                    intValue = Integer.parseInt(arr[i]);
                    if (intValue > 0) {
                         System.out.println("Index ke " + i + " adalah integer dengan data " + arr[i] + " "); 
                    } else {
                          System.out.println("Tidak bisa di validasi sistem"); 
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Index ke " + i + " adalah string dengan data " + arr[i] + " "); 
                }
            }
    }
}