package allprohrams;

import java.util.ArrayList;
import java.util.List;

public class B4_ArrayPrintUnique2 {
    public static void main(String[] args) {
        int Array[] = { 1, 1, 2, 3, 4, 4, 5, 5, 6 };
        List<Integer> unique = new ArrayList<>();

        for (int arr : Array) {
            int count = 0;
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] == arr) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(arr);
            }
        }

        System.out.println(unique); // [2, 3, 6]
    }
}
