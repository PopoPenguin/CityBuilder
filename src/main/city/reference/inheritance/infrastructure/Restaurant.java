package main.city.reference.inheritance.infrastructure;

public class Restaurant extends Building {


    private String cuisineType;
    private String name;

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant (){
        super.setType("Restaurant");
    }
}
