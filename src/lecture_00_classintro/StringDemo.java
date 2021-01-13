package lecture_00_classintro;

public class StringDemo {


    public static void main(String[] args) {

        String fullName1 = new String("Nathan Cmiel");
        String fullName2 = new String("Nathan Cmiel");

        //     number == number
        //     address == address
       if(fullName1 == fullName2) {
           System.out.println("They are same object");
       }
       else {
           System.out.println("They are separate object");
       }


    }
}
