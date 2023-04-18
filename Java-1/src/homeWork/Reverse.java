package homeWork;

public class Reverse {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int initIndx = 0;
        int afterIndx = s.length-1;
        //---Changing the data with indexes within one array
        while(initIndx <= afterIndx){
            char temp = s[initIndx];
            s[initIndx] = s[afterIndx];
            s[afterIndx] = temp;
            initIndx++;
            afterIndx--;
        }
        System.out.println(s);
    }
}
