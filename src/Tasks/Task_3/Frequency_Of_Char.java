package Tasks.Task_3;

public class Frequency_Of_Char {
    public static void main(String[] args) {
        /*
        Write a return method that find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
        String str3 = "AAABBBCDDD##!!11";
        String result3 = "";
        //Nested for Loop
        //Inner loop
        for(int i = 0; i<str3.length(); i++){
            int num = 0;
            //outer loop
            for(int j = 0; j<str3.length(); j++){
                //if statement
                if(str3.charAt(i)==str3.charAt(j)){
                    num++;

                }
            }
            result3 = str3.charAt(i)+ "" + num;
            str3 = str3.replace("" + str3.charAt(i), "");
            i=-1;

            System.out.print(result3);
        }
    }
}
