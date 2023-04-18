package homeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polindrome {
    public static void main(String[] args) {
//        String slovo = "A man, a plan, a canal: Panama";
//        String slovo = "race a car";
//        String slovo = "0P";
        String slovo = "Madam";
        System.out.println("slovo: " + slovo.toLowerCase());
        String s = slovo.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("ss: " + s);
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPolindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPolindrome = false;
                break;
            }
        }
        if (isPolindrome){
            System.out.println("Palindrom");
        } else {
            System.out.println("NOT Palindrom");
        }
    }
}
