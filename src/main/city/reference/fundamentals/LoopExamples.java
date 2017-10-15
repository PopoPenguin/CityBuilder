package main.city.reference.fundamentals;


public class LoopExamples {

    public void whileLoop(long count){
        System.out.println("********************************");
        System.out.println("I'm in a while loop:");

        long i = 0;

        while(i < count){
            i++;
        }

    }

    public void forLoop(long count){
        System.out.println("********************************");
        System.out.println("I'm in a for loop:");


        for(int i = 0; i < count; i++){
        }

    }

    public void forEachLoop(long count){
        System.out.println("********************************");
        System.out.println("I'm in a for-each loop:");

        long[] array = new long [(int)count];

        // have to populate with traditional for loop
        // we need the index
        for(long i = 0; i < count; i++){
            array[(int)i]= i;
        }

        // for-each loop to iterate through array
        for(long i : array){
        }

    }

}
