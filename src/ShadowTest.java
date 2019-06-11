/*
 * Author: Dahir Muhammad Dahir
 * Date: 06-June-2019 11:37 AM
 * About: I will tell you later
 */


public class ShadowTest {

    public static void main(String... args){

        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);

    }

    private int x = 0;

    class FirstLevel {

        int x = 1;

        void methodInFirstLevel (int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);

        }
    }
}
