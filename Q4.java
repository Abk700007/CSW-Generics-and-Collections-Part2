package cswassignGenericspart2;

import java.util.*;
class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", mark=" + mark + "}";
    }
}

public class Q4{
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding some students
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 78.0));
        students.add(new Student("Charlie", 21, 92.3));

        // (a) Display the list of students
        System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // (b) Check if a student exists in the list
        System.out.println("\nEnter details of the student to check existence:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Mark: ");
        double mark = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        Student searchStudent = new Student(name, age, mark);
        boolean exists = students.contains(searchStudent);
        System.out.println("Student exists in the list: " + exists);

        // (c) Remove a student from the list
        System.out.println("\nEnter details of the student to remove:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Mark: ");
        mark = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Student removeStudent = new Student(name, age, mark);
        boolean removed = students.remove(removeStudent);
        System.out.println("Student removed: " + removed);

        // (d) Count the number of students in the list
        System.out.println("\nTotal number of students: " + students.size());

        
    }
}
