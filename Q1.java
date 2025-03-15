package cswassignGenericspart2;

import java.util.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
    	return key; 
    	}
    public V getValue() { 
    	return value;
    	}
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }

    @Override
    public String toString() {
        return "Pair [Key=" + key + ", Value=" + value + "]";
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        Pair<String, Double> pair2 = new Pair<>("Weight", 75.5);
        System.out.println(pair1);
        System.out.println(pair2);
    }
}
