package main.city.reference.util;

public class Timer {

    public long now() {
        return System.currentTimeMillis();
    }

    public long diff(long start, long end){
        return end - start;
    }

}
