/*
 * Author: Dahir Muhammad Dahir
 * Date: 06-June-2019 12:46 PM
 * About: I will tell you later
 */


public class RoughClass {

    public static void main(String... args){
        RoughClass rough1 = new RoughClass();
        rough1.showArray();
    }

    private static final int SIZE = 15;
    private static int[] array = new int[SIZE];

    private RoughClass(){
        for (int i = 0; i < SIZE; i++){
            array[i] = i + 1;
        }
    }

    private void showArray(){
        for (int item : array){
            System.out.println(item);
        }
    }

}
