package main.city.reference.inheritance.infrastructure;

public class Building implements BuildingInterface {

    private String address;
    private int capacity;
    private int numFloors;
    private String type;


    public Building(String address, int capacity, int numFloors) {
        this.address = address;
        this.capacity = capacity;
        this.numFloors = numFloors;

    }

    public Building(String address) {
        this.address = address;

    }

    public Building() {

    }

    @Override
    public void setAddress(String Address) {
        this.address=address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setNumFloors(int numFloors) {
        this.numFloors=numFloors;
    }

    @Override
    public int getNumFloors() {
        return numFloors;
    }

    @Override
    public void setType(String type) {
        this.type=type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", capacity=" + capacity +
                ", numFloors=" + numFloors +
                ", type='" + type + '\'' +
                '}';
    }
}
