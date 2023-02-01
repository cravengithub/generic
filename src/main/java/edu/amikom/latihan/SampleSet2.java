package edu.amikom.latihan;

import java.util.HashSet;
import java.util.Set;

public class SampleSet2 {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<String>();
        ss.add("A");
        ss.add("B");
        ss.add("C");
        ss.add("D");
        ss.add("E");
        ss.add("latihan");
        ss.add("57");

        // menghapus semua item pada set
        ss.clear();

        for (String st : ss) {
            System.out.println(st);
        }
    }
}
