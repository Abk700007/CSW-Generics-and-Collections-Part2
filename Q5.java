package cswassignGenericspart2;

import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{ID=" + id + ", Name='" + name + "', Author='" + author + "', Quantity=" + quantity + "}";
    }
}

public class Library {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        // Adding books to the library
        books.put(101, new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 5));
        books.put(102, new Book(102, "To Kill a Mockingbird", "Harper Lee", 3));
        books.put(103, new Book(103, "1984", "George Orwell", 4));

        // Displaying the books
        System.out.println("Library Collection:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }

        Scanner in = new Scanner(System.in);
        
        // (a) Check if a book by name exists
        System.out.println("\nEnter the book name to search:");
        String searchName = in.nextLine();
        boolean found = books.values().stream().anyMatch(book -> book.getName().equalsIgnoreCase(searchName));
        System.out.println("Book found: " + found);
        
        // (b) Remove a book by ID 
        System.out.println("\nEnter the book ID to remove:");
        int removeId = in.nextInt();
        Book removedBook = books.remove(removeId);
        if (removedBook != null) {
            System.out.println("Removed book: " + removedBook);
        } else {
            System.out.println("Book with ID " + removeId + " not found.");
        }

        // Displaying the updated books collection
        System.out.println("\nUpdated Library Collection:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
