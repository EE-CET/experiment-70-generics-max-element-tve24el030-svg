import java.util.Scanner;

public class Solution {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        String[] stringArray = new String[m];
        for (int i = 0; i < m; i++) {
            stringArray[i] = sc.next();
        }

        System.out.println("Max Integer: " + findMax(intArray));
        System.out.println("Max String: " + findMax(stringArray));
        
        sc.close();
    }
}
