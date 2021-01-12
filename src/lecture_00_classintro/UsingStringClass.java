package lecture_00_classintro;

public class UsingStringClass {


    public static void main(String[] args) {

        String teacherName = new String("Nijat Muhtar");
        String fullName = new String("Nijat Muhtar");  // Object(data, copy of useful method in the class)


        // int length();
        int ret1 = fullName.length();
        Integer result = new Integer(fullName.length());
        System.out.println(ret1);

        // boolean isEmpty(),
        // boolean isBlank()
        boolean ret2 = fullName.isEmpty();
        ret2 = fullName.isBlank();
        System.out.println(ret2);

        // char charAt(int index);
        char ret3 = fullName.charAt(4);
        System.out.println(ret3);

        // boolean equals(String otherTextObj);
        boolean ret4 = fullName.equals(teacherName);
        System.out.println(ret4);

    }
}
