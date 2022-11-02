package Tasks.Tasks4;

import com.sun.tools.javac.Main;

public class Unique {
    /*
    Write a return method that can find the unique characters from String
    EX: Unique("AAABBBCCCDEF")
     */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            if(str.contains("" + str.charAt(i))){
                str1 = str.replaceAll("" + str.charAt(i), "");
            }
        }
        System.out.println(str1);
    }


}
