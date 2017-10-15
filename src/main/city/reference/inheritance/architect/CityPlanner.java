package main.city.reference.inheritance.architect;

import main.city.reference.inheritance.infrastructure.Building;
import main.city.reference.inheritance.infrastructure.House;
import main.city.reference.inheritance.infrastructure.Outhouse;
import main.city.reference.inheritance.infrastructure.Restaurant;

import java.util.Scanner;

public class CityPlanner {

    Scanner scanner = new Scanner(System.in);

    public void buildCity(){
        City city= new City();

        System.out.println("Welcome to the City Planner!");
        System.out.println("Would you like to build a new City (y/n)");

        String continueBuilding = scanner.next();

        if (continueBuilding.equalsIgnoreCase("y")){
            city = designCity();
            analyzeCity(city);
        } else if(continueBuilding.equalsIgnoreCase("n")) {

            System.out.println("No problem!  Come back anytime.");
        } else {
            System.out.println("Unrecognized command. Please try again.");
        }

    }

    private void analyzeCity(City city){
        System.out.println("Your city has a population of " + city.getPopulation());
        System.out.println("You named your city " + city.getName());
        System.out.println("Your city has a total of " + city.getBuildings().size() + " buildings");
        System.out.println();

        int houses = 0;
        int restaurants = 0;
        int outhouses = 0;
        int numHoused = 0;





        for(Building building : city.getBuildings()){
            if(building.getClass().isInstance(House.class)){
                houses++;
                House test = (House) building;
                numHoused = test.getNumOccupants();
            } else if(building.getClass().isInstance(Restaurant.class)){
                restaurants++;
            } else if (building.getClass().isInstance(Outhouse.class)) {
                outhouses++;
            }
        }

        System.out.println(houses + " of which are residential houses.");
        System.out.println(restaurants + " of which are restaurants.");
        System.out.println(outhouses + " of which are outhouses.");

        System.out.println(city.getPopulation() - numHoused + " of your residents are homeless.");

        System.out.println("Here's a breakdown of your city:");

        for (Building building : city.getBuildings()) {
            if (building.getClass().isInstance(House.class)) {
                houses++;
                House test = (House) building;
                System.out.println("House at address: " + test.getAddress());
            } else if (building.getClass().isInstance(Restaurant.class)) {
                Restaurant res = (Restaurant) building;
                System.out.println("Restaurant named " + res.getName() + " serving " + res.getCuisineType());
            } else if (building.getClass().isInstance(Outhouse.class)) {
                Outhouse out = (Outhouse) building;
                System.out.println("Outhouse that is " + out.getSmellFactor() + "/10 stinky");
            }
        }


    }



    private City designCity(){
        City city = new City();
        int totalBuildings =0;
        int numHouses=0;
        int numOuthouses = 0;

        System.out.println("Sweet!! Let's build a city!!");
        System.out.println("What is the name of the city?");
        city.setName(scanner.next());

        System.out.println("What population would you like your city to be?");
        city.setPopulation(scanner.nextInt());

        System.out.println("How many buildings does your city have?");
        totalBuildings = scanner.nextInt();

        System.out.println("How many of your " + totalBuildings + " buildings are residential houses?");
        numHouses = scanner.nextInt();

        for (int i = 0; i<numHouses; i++){
            System.out.println("Building house # " + (i + 1) + " of " + numHouses);

            House house = new House();
            System.out.println("How many people live at this house");
            house.setNumOccupants(scanner.nextInt());

            System.out.println("Is this house where the heart is? (true/false)");
            house.setWhereHeartIs(scanner.nextBoolean());

            System.out.println("What is the address of this house?");
            house.setAddress(scanner.next());

            city.getBuildings().add(house);

        }

        System.out.println("How many restaurant does your city have?");
        int numRestaurants = scanner.nextInt();

        for (int i = 0; i<numRestaurants; i++){
            Restaurant restaurant = new Restaurant();
            System.out.println("Building restaurant # " + (i + 1) + " of " + numRestaurants);
            System.out.println("What is the name of this restaurant?");
            restaurant.setName(scanner.next());

            System.out.println("What type of food does this restaurant serve?");
            restaurant.setCuisineType(scanner.next());

            System.out.println("What is the capacity of this restaurant?");
            restaurant.setCapacity(scanner.nextInt());

            city.getBuildings().add(restaurant);

        }

        System.out.println("Almost done! How many outhouses does your city have?");
        numOuthouses = scanner.nextInt();

        for (int i = 0; i<numOuthouses; i++){
            Outhouse outhouse = new Outhouse();
            System.out.println("What is the stink factor (0-10) of outhouse # " + (i+1) + " ?");
            outhouse.setSmellFactor(scanner.nextInt());
            city.getBuildings().add(outhouse);

        }


        System.out.println("Awesome. The city is built.  Let's take a look.");



        return city;
    }

}
