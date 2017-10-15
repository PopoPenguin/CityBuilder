package main.city.reference.controllers;

import main.city.reference.fundamentals.LoopExamples;
import main.city.reference.fundamentals.StaticExamples;
import main.city.reference.inheritance.architect.CityPlanner;
import main.city.reference.util.Timer;

public class ReferenceController {


    public static void main(String[] args) {

        if (args.length>0) {
            if (args[0].equalsIgnoreCase("0")) {
                //Loop Examples with Timers
                LoopController loopReview = new LoopController();
                boolean loops = loopReview.runLoops(17);
            } else if (args[0].equalsIgnoreCase("1")) {
                //Static Examples
                StaticController.runStaticExamples();
            } else if (args[0].equalsIgnoreCase("city")){
                CityPlanner cp = new CityPlanner();
                cp.buildCity();
            } else {
                System.out.println("Unrecognized command");
            }

        } else {
            System.out.println("Please enter an appropriate command = try again");
        }
    }
}
