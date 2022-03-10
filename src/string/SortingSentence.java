package string;

import java.util.Arrays;
import java.util.HashMap;

public class SortingSentence {

    public static void main(String[] args) {

          /*
        ["is2","sentence4","This1","a3"]

        HashMap<Integer, String> map = new hashmp();
        for(1 to 4){

            (is2,1),(sentence4,1)....


         }
         String res = ";

         for(1 to 4){

         .containsKey(1)
         res =+ This
         }
         res += ";
            .put(); .get(key)=>returns value .containsKey .containsValue

        */

        String s = "is2 sentence4 This1 a3";
        String[] c = s.split(" ");
        System.out.print("\"");
        HashMap<Integer, String> map = new HashMap<>();
        for (String item : c) {
            char ch = item.charAt(item.length() - 1);
            int key = Integer.parseInt(String.valueOf(ch));
            String value = item.substring(0, item.length() - 1);
            map.put(key, value);
        }

        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(i + 1)) {
                System.out.print(map.get(i + 1));
            }
            if (i < c.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\"");
    }
}
