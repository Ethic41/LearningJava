/*
 * Author: Dahir Muhammad Dahir
 * Date: 06-June-2019 12:37 PM
 * About: I will tell you later
 */


public class DataStructure {

    public static void main(String... args){
        DataStructure dataStructure1 = new DataStructure(100);
        dataStructure1.printEven();
    }

    private static int SIZE;
    private int[] arrayOfInts;

    private DataStructure(int size){
        SIZE = size;
        arrayOfInts = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    private void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EvenIterator implements DataStructureIterator {

        private int nextIndex = 0;

        public boolean hasNext(){
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            Integer returnValue = arrayOfInts[nextIndex];
            nextIndex += 2;
            return returnValue;
        }
    }
}
