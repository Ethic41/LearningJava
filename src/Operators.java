/*
 * Author: Dahir Muhammad Dahir
 * Date: 04-June-2019 3:46 PM
 * About: I will tell you later
 */


public class Operators {
    public static void main(String[] args){
        int result = 1 + 2;

        System.out.println(result);

        int originalResult = result;

        result = result - 1;

        result = result * 2;

        int number = 5;

        System.out.println(number++);
        System.out.println(number--);
        System.out.println(number);

        Object letters = "time is one";
        println(letters);
        println(24);

        if (result > number){
            println("time");
            println("time is");
            int z = 3;
            println(z);
        }

        int a = 0b11100;
        int b = 0b00011100;
        println(~a);
        println(b);

        int i = 10;
        int n = ++i % 5;
        println(i);
        println(n);


    }

    private static void println(Object arg){
        System.out.println("my println: " + arg);
    }
}
