package Tasks.Task_3;

public class Remove_duplicate {
    /*
    Write return method that can remove the duplicated value from string
    removeDup("AAABBBCCC") ===> ABC
     */
    public static void main(String[] args) {

        String str = new String("AAABBBCCC11##");
        String result = "";

        for(int i = 0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    result = result + str.charAt(i); // result += str.charAt(j)){
                    str = str.replaceAll("" + str.charAt(i),"");

                }
            }
            System.out.println(result);

        }

    }


}
