/*
 * Author: Dahir Muhammad Dahir
 * Date: 03rd-June-2019 04:46 PM
 * About: variable in java
 *
 */

public class Arrays {
    public static void main(String[] args){

        int[] someArray = new int[10];

        someArray[0] = 100;
        someArray[2] = 200;

        System.out.println(someArray[0]);
        System.out.println(someArray[1]);
        System.out.println(someArray[2]);

        int[] anotherArray = {100, 200, 300, 400, 500, 600};
        System.out.println(anotherArray[5]);

        int[][] twoDimensionalArray = new int[5][4];
        twoDimensionalArray[0][0] = 4;
        twoDimensionalArray[0][1] = 5;
        twoDimensionalArray[1][0] = 9;

        char[] smallOne = {'a', 'b'};
        char[] smallTwo = {'a', 'b'};

        char[] emptyArray = new char[5];

        java.util.Arrays.fill(emptyArray, 0, 5, 'a');

        System.out.println(twoDimensionalArray[0][0]);
        System.out.println(twoDimensionalArray.length);

        char[] copySource = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyDestination = new char[7];

        char[] copyDest = java.util.Arrays.copyOfRange(copySource, 0, 10);

        System.arraycopy(copySource, 2, copyDestination, 0, 7);
        System.out.println(new String(copyDestination));
        System.out.println(copyDestination);
        System.out.println(copyDest);
        System.out.println(java.util.Arrays.binarySearch(copyDest, 'n'));
        System.out.println(emptyArray);

        System.out.println(java.util.Arrays.equals(smallOne, smallTwo));



    }
}
