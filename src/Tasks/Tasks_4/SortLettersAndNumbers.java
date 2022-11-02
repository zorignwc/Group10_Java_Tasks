package Tasks.Tasks_4;

import java.util.Arrays;

/*
Given Alphanumeric String, we need to split the string
 */

public class SortLettersAndNumbers {
    public static void main (String[] args) {
        String str = "DC501GCCCA098911";
        




    }
        public static void SortLetterAndNumberFromString (String str) {

            String str2 = "";
            for(int i = 0; i<str.length(); i++){
                str2 += "" + str.charAt(i);
                if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1){
                    if(Character.isDigit(str.charAt(i+1)) ){
                        str2 +=",";
                    }
                }
               if(Character.isDigit(str.charAt(i)) && i<str.length()-1){
                   if(Character.isAlphabetic(str.charAt(i+1))){
                        str2 +=",";

                    }
                }
            }
            String[] arr = str2.split(",");
            str = ",";
            for(String each : arr){
                char[] chars = each.toCharArray();
                Arrays.sort(chars);
                for(char eachChar : chars){
                    str += ""+eachChar;
                }

            }
            System.out.println(str);


        }

}
