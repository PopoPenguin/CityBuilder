package main.city.reference.fundamentals;

public class StaticExamples {

    private int nonStaticVar;
    private static int numInstancesCreated;


    public int getNonStaticVar() {
        return nonStaticVar;
    }

    public void setNonStaticVar(int nonStaticVar) {
        this.nonStaticVar = nonStaticVar;
    }

    public StaticExamples() {
        numInstancesCreated++;
    }

    //Invoke this method from another class using the ClassName.MethodName notation - ie, StaticExamples.staticMethod
    //You do not need an object of this class to call this static method.
    public static void staticMethod(){

        System.out.println("I'm a static method");
        System.out.println("You do not need to create an object of StaticExamples.class to call me.");
        System.out.println("I live outside the realm of Objects. I should not try to access non static instance variables.");


    }

    //This method will return the total number of instances that have been created of this class -  the variable is static
    //all instances/objects that are created of this class will be able to access the SAME EXACT variable and it's value.
    //Each object does NOT get it's own copy of a static variable - they all share just the one.
    public int getNumInstancesCreated() {
        return numInstancesCreated;
    }

}
