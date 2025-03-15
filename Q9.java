package cswassignGenericspart2;

import java.util.HashSet;

public class Q9 {
    public static void findRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) { // If already present, add to duplicates
                duplicates.add(num);
            }
        }
        
        System.out.println("Repeating integers: " + duplicates);
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 8, 7, 4, 9, 8};
        findRepeating(arr);
    }
}
