package cswassignGenericspart2;

import java.util.HashMap;

public class Q10 {
    public static int findMissingNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Store elements in the map
        for (int num : arr) {
            map.put(num, 1);
        }
        
        // Check for the missing number in the range 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        
        return -1; // If no number is missing
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8, 9, 10, 5};
        int missingNumber = findMissingNumber(arr);
        
        if (missingNumber != -1) {
            System.out.println("Smallest missing positive number: " + missingNumber);
        } else {
            System.out.println("No missing number in the range 1 to 10.");
        }
    }
}
