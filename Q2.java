package cswassignGenericspart2;

import java.util.*;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
    	return name;
    	}
    public int getAge() {
    	return age;
    	}

    @Override
    public String toString() {
        return "User [Name=" + name + ", Age=" + age + "]";
    }
}

public class ArrayListUser {
    public static void main(String[] args) {
        ArrayList<User> u = new ArrayList<>();
        u.add(new User("Alice", 25)); 
        u.add(new User("Bob", 20));
        u.add(new User("Charlie", 22));

        u.sort(Comparator.comparingInt(User::getAge)); // Sorting by age
        for (User user : u) {
            System.out.println(u);
        }
    }
}
