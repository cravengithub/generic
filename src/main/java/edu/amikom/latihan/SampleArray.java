package edu.amikom.latihan;

public class SampleArray {
    // psvm [tab]
    public static void main(String[] args) {
        // indeks 0 1 2 3 4 5
        int[] arr = { 87, 45, 32, 76, 22, 48 };
        int[] ann = new int[5];

        // mengubah item array pada indeks ke-2
        arr[2] = 29;
        // menampilkan item array pada indeks ke-3
        System.out.println("indeks ke-3: " + arr[3]);
        System.out.println("panjang: " + arr.length);
        // menampilkan semua item array
        for (int a : arr) {
            System.out.println(a);
        }

        /*
         * for (int a : arr) {
         * System.out.println(a);
         * }
         */

    }
}
