package cswassignGenericspart2;

import java.util.*;
class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        addressBook.put("John Doe", new Address(101, "Main Street", "New York"));
        addressBook.put("Alice Brown", new Address(202, "Lake View", "Chicago"));
        addressBook.put("Bob Smith", new Address(303, "Hill Road", "San Francisco"));

        // Using an Iterator to display the entries
        Iterator<Map.Entry<String, Address>> iterator = addressBook.entrySet().iterator();
        System.out.println("Address Book Entries:");
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

