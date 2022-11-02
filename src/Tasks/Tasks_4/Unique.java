package Tasks.Tasks_4;

public class Unique {
    /*
    Write a return method that can find the unique characters from String
    EX: Unique("AAABBBCCCDEF")
     */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        for(int i=0; i<str.length(); i++){
            //
            if(str.contains("" + str.charAt(i))){
                //
                str = str.replaceAll("" + str.charAt(i), "");
            }
        }
        System.out.println(str);
    }


}
