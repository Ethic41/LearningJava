/*
 * Author: Dahir Muhammad Dahir
 * Date: 03rd-June-2019 04:46 PM
 * About: variable in java
 *
 */
public class Variables {
    public static void main(String[] args){

        int cadence = 0;
        int speed = 0;
        int gear = 1;

        boolean state = true;

        byte memByte = 127; // byte range from -128 to 127

        int limit = 2147483647;
        Integer myLimit = 2147483647;
        char port = 65535;
        char capitalC = 'C';

        String username = "Dahir";

        int decimalValue = 26;
        // in hex
        int hexadecimalValue = 0x1a;

        // in binary
        int binaryValue = 0b11010;

        double number1 = 123.4;

        double number2 = 1.234e2;
        float number3 = 123.4f;

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;

        float pi = 3.14_15F;

        long hexBytes = 0xFF_EC_DE_5E;

        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;

        byte nybble = 0b0010_0101;



        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: \n" + gear);
    }
}
