package main.city.reference.controllers;

import main.city.reference.fundamentals.StaticExamples;

public class StaticController {
    public static void runStaticExamples(){

        //call a static method directly in StaticExamples.class - no object required
        StaticExamples.staticMethod();

        //call demonstrateStaticVariables() below -
        demonstrateStaticVariables();

    }

    public static void demonstrateStaticVariables(){

        StaticExamples obj1 = new StaticExamples();
        obj1.setNonStaticVar(100);

        StaticExamples obj2 = new StaticExamples();
        obj2.setNonStaticVar(200);

        StaticExamples obj3 = new StaticExamples();
        obj3.setNonStaticVar(300);


        //3 will print (static variable -shared value)
        System.out.println(obj1.getNumInstancesCreated());
        //100 will print (non-static instance variable - each object gets its own copy)
        System.out.println(obj1.getNonStaticVar());
        System.out.println();

        //3 will print (static variable -shared value)
        System.out.println(obj2.getNumInstancesCreated());
        //200 will print (non-static instance variable - each object gets its own copy)
        System.out.println(obj2.getNonStaticVar());
        System.out.println();

        //3 will print (static variable -shared value)
        System.out.println(obj3.getNumInstancesCreated());
        //300 will print (non-static instance variable - each object gets its own copy)
        System.out.println(obj3.getNonStaticVar());
        System.out.println();

    }
}
