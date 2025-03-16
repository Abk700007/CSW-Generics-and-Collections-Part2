package cswassignGenericspart2;

import java.util.*;

//User class with private fields, constructor, getters, and setters
class User {
 private String name;
 private int age;

 // Parameterized constructor
 public User(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Setter methods
 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }
}

//ArrayListUser class to manage the list of User objects
public class Q2 {
 public static void main(String[] args) {
     // Creating an ArrayList of User objects
     ArrayList<User> users = new ArrayList<>();

     // Adding User objects to the list
     users.add(new User("Alice", 25));
     users.add(new User("Bob", 22));
     users.add(new User("Charlie", 30));
     users.add(new User("David", 28));

     // Printing the users before sorting
     System.out.println("Users before sorting:");
     printUsers(users);

     // Sorting users based on age
     users.sort(Comparator.comparingInt(User::getAge));

     // Printing the users after sorting
     System.out.println("\nUsers after sorting by age:");
     printUsers(users);
 }

 // Method to print the list of users
 private static void printUsers(List<User> users) {
     for (User user : users) {
         System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
     }
 }
}
