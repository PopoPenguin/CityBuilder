package main.city.reference.controllers;

import main.city.reference.fundamentals.LoopExamples;
import main.city.reference.util.Timer;

public class LoopController {

    Timer timer = new Timer();

    public boolean runLoops (long count) {
        System.out.println("runLoops() starting ...");
        LoopExamples loops = new LoopExamples();

        //WHILE LOOP
        //start the timer
        long startTime = timer.now();
        //run the loop
        loops.whileLoop(count);
        //end the timer
        long endTime = timer.now();
        //print the difference between startTime and endTime
        System.out.println("Time = " + timer.diff(startTime,endTime));

        // FOR LOOP
        //start the timer
        long forStartTime = timer.now();
        // run the loop
        loops.forLoop(count);
        // get the end time
        long forEndTime = timer.now();
        // print get the difference between startTime and endTime
        System.out.println("Time = " + timer.diff(forStartTime,forEndTime));

        // FOR_EACH LOOP
        //start the timer
        long forEachStartTime = timer.now();
        // run the loop
        loops.forEachLoop(count);
        // get the end time
        long forEachEndTime = timer.now();
        // print get the difference between startTime and endTime
        System.out.println("Time = " + timer.diff(forEachStartTime,forEachEndTime));


        return true;
    }
}
