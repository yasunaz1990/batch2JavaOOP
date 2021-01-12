package practice;

public class FizzBuzz {


    public static void main(String[] args) {
        fizzBuzz();
    }

    // Method you have to implement:
    // Type 1:  no data return, no input asked
    /*
        Write a program that prints the numbers from 1 to 100.
        But for multiples of three print "Fizz"
        instead of the number and for the multiples of five print "Buzz".
        For numbers which are multiples of both three and five print "FizzBuzz".
     */
    static public void fizzBuzz() {
        int count = 1;
        while (count <= 100) {
            if (count % 3 == 0 && count % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(count);
            }
            count++;
        }
    }
}

/*
Sample Output:
-------------------
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
	...
97
98
Fizz
Buzz
 */