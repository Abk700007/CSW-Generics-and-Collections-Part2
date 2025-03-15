package cswassignGenericspart2;

import java.util.*;

class Car implements Comparable<Car> {
    private int modelNo, stock;
    private String name;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }

    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2013, "Creta", 10));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2018, "Kia", 20));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
