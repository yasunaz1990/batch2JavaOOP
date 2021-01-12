package lecture_00_classintro;

import java.util.Locale;

public class ClassDemo {

    // We will understand what is a class
    public static void main(String[] args) {


        // Primitive Data Types
        // Integer   10;    int var = 10;
        // Double
        // Char
        // Boolean

        // Buket: class --> allows you to create your own data representations
        //                  1) You can represent you data
        //                  2) You can also group related methods that works on that data

        // Using String class:
        // 1)  Representing a text data, and storing that represented text data into variable
        String fullName = new String("nijat muhtar");
        System.out.println( fullName  );

        // 2)  You can use methods that this String class offers you into
        //     that text data you just created and stored.
        System.out.println(    fullName.toUpperCase()      );
    }
}
