package lecture_00_classintro;

import java.util.Locale;

public class UsingStringClass {


    public static void main(String[] args) {
        //                               01234567
        String name = new String("Nijat Muhtar ");


        // 1) int length();
        int charNums = name.length();

        // 2)
        // boolean isEmpty(),
        // boolean isBlank()
        boolean noChar = name.isEmpty();

        // 3) char charAt(int index);
        char extracted = name.charAt(3);


        // 4) boolean equals(String otherTextObj);
        boolean isSame = name.equals("Nijat Muhtar");
        System.out.println(isSame);

        // 5) String toUpperCase()
        name = name.toUpperCase();

        // 6) String toLowerCase()
        name = name.toLowerCase();


        // 7) boolean contains(String);
       String actualResult = "Welcome Nijat! Thank you for sign up.";
       boolean isPassed = actualResult.contains("Nijat");
       System.out.println(isPassed);

       // 8) boolean equalsIgnoreCase(String);
        String text1 = "nathan";
        String text2 = "NatHan";

        System.out.println(    text1.equals(text2)            ); // false
        System.out.println(    text1.equalsIgnoreCase(text2)  ); // true

        String heSaid = "hey there \"APPLE\", how are you?";
        System.out.println(heSaid);
    }
}
