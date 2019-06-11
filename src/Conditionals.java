/*
 * Author: Dahir Muhammad Dahir
 * Date: 04-June-2019 9:01 PM
 * About: I will tell you later
 */
import java.util.Objects;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String number;

        do{
            number = input.nextLine();

            if (Objects.equals(number, "-1")){
                break;
            }

            System.out.println(number);


        } while (true);

        String newNumber;

        while (true){
            newNumber = input.nextLine();

            if (Objects.equals(newNumber, "-1")){
                break;
            }

            System.out.println(newNumber);
        }

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int[] numArray = new int[10];

        for (int i = 0; i < 10; i++){
            numArray[i] = i + 1;
        }

        for (int item : numArray){
            System.out.println(item);
        }

        mainOuter:
        for (int i = 0; i < 10; i++){
            for (int item : numArray){
                if (item == 5){

                    break mainOuter;
                } else {

                    System.out.println(item);
                }
            }
        }

    }

}
