package practice;

public class SerachForWord {

    /*
        Given a string array that contains word, you are tasked to
        write a method that return true/false whether the word
        specified by target exists in the array or not.
     */
    public static boolean isFound(String[] words, String target) {
        // step 1:  loop through the array using for loop to visit each element
        for(int i = 0; i <= words.length-1; i++) {
            String eachWord = words[i];

            // filter
            if(eachWord.equals(target) == true) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] testArray = {"tree", "leaf", "ocean", "air", "sun"};
        String targetWord = "leaf";

        boolean result = isFound(testArray, targetWord);

        System.out.println("RESULT:  " + result);
    }
}
