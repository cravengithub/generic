package edu.amikom.latihan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SampleList2 {
    public static void main(String[] args) {
        List<Integer> it = new LinkedList<Integer>();
        it.add(45);
        it.add(98);
        it.add(73);
        it.add(62);
        it.add(59);

        // mengurutkan item 
        Collections.reverse(it);

        //menampilkan semua item
        for (Integer in : it) {
            System.out.println(in);
        }

    }
}
