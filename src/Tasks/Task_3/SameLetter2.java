package Tasks.Task_3;

import java.util.Arrays;

public class SameLetter2 {


    public static void main(String[] args) {
        String str1 = "java#";
        String str2 = "java#";
        if(sameLetter(str1, str2)){
            System.out.println("True");



        }else{
            System.out.println("False");
        }



    }
    static boolean sameLetter(String str1, String str2){
        //Check if 2 str's are the same length
        if(str1.length() != str2.length()){
            return false;
        }
        //transform strings to array of char.
        char string1ToArray[] = str1.toCharArray();
        char string2ToArray[] = str2.toCharArray();

        //Sort them
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);
        for(int i=0; i<str1.length(); i++){
            if(string1ToArray[i] != string2ToArray[i]){
                return false;
            }
        }
        return true;
    }
}

