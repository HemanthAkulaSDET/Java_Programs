package Practice;

import java.util.HashSet;
import java.util.Set;

public class Duplicate2 {
    public static void main(String[] args) {
        String s = "MADAMA";

        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println(duplicates);
    }
}