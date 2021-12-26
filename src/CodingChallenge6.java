import java.util.Arrays;

public class CodingChallenge6 {

    public static void main(String[] args){
//the wanted word is in lowercase
//the crowd of letters are all in upper case
//skip the uppercase letters and find only the lower case letters

//declare a sample string
        String sample = "YFemHUFBbezFBYzFBYLleGBYEFGBMENTment";

//declaring the result variable
        String result = "";

//        sample.split(" ");
//        String[] splitLetters = sample.split("");
//        System.out.println(splitLetters);
//        System.out.println(Arrays.toString(splitLetters));

        char[] charArray = sample.toCharArray();
//        System.out.println(charArray);

//        checking the letters
       for(int i=0;i<charArray.length;i++){
           if( !Character.isUpperCase(charArray[i])) {
             result = result + charArray[i];
           }
       }

        System.out.println(result);


        }
       }