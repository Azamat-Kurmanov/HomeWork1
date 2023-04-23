package homeWork;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        return count(s).equals(count(t));
    }

    public static Map<Character, Long> count(String txt){
        Map<Character, Long> map = new HashMap<>();
        txt.chars().forEach(it -> map.compute((char) it, (k, v) -> (v==null) ? 1 : v+1));
        return map;
    }
}
