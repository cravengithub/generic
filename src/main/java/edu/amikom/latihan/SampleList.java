package edu.amikom.latihan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SampleList {
    public static void main(String[] args) {
        List ls = new LinkedList<>();
        // Menambah item
        ls.add("Apel"); // indek ke-0
        ls.add(87); // indek ke-1
        ls.add(true); // indek ke-2
        ls.add(3.14); // indek ke-3
        ls.add(true);

        // mengambil item pada indeks ke-1
        int nm = (Integer) ls.get(1);
        System.out.println("Iteme ke-1: " + nm);
        // mengubah item
        ls.set(2, false);

        // menghapus Item
        ls.remove(1);
      
        // menampilkan item list
        for (Object obj : ls) {
            System.out.println(obj);
        }

    }
}
