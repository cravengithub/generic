package edu.amikom.latihan;

import java.util.Set;
import java.util.HashSet;

public class SampleSet {
    public static void main(String[] args) {
        Set st = new HashSet<>();
        st.add(34);
        st.add(34);
        st.add(true);
        st.add("Hello");
        st.add(3.14);
        st.add(false);
        
        // menghapus item tertentu
        st.remove(34);
        st.remove(3.14);

        // lateral
        String tmp = null;
        // mengambil salah salah satu item bernilai Hello
        for (Object o : st) {
            if (o instanceof String) {
                String sg = (String) o;
                if (sg == "Hello") {
                    tmp = sg;
                    System.out.println(tmp);
                    break;
                }
            }
        }
        System.out.println("hasil: " + tmp);
        System.out.println("panjang set: " + st.size());

    }
}
