package cswassignGenericspart2;

import java.util.*;

public class Q6{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        
        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(25);
        numbers.add(15);
        numbers.add(30);
        numbers.add(5);
        
        // (a) Display the elements of the TreeSet
        System.out.println("TreeSet Elements: " + numbers);
        
        Scanner in = new Scanner(System.in);
        
        // (b) Check if a number exists in the TreeSet
        System.out.print("\nEnter a number to check if it exists in the TreeSet: ");
        int searchNumber = in.nextInt();
        boolean exists = numbers.contains(searchNumber);
        System.out.println("Number exists in TreeSet: " + exists);
        
        // (c) Remove a specified element from the TreeSet
        System.out.print("\nEnter a number to remove from the TreeSet: ");
        int removeNumber = in.nextInt();
        boolean removed = numbers.remove(removeNumber);
        System.out.println("Number removed: " + removed);
        
        // Display updated TreeSet
        System.out.println("\nUpdated TreeSet Elements: " + numbers);
        
        
    }
}

