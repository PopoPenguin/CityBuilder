package main.city.reference.inheritance.infrastructure;

public class House extends Building {

    private int numOccupants;
    private boolean isWhereHeartIs;

    public House() {
        super.setType("House");
    }

    public int getNumOccupants() {
        return numOccupants;
    }

    public void setNumOccupants(int numOccupants) {
        this.numOccupants = numOccupants;
    }

    public boolean isWhereHeartIs() {
        return isWhereHeartIs;
    }

    public void setWhereHeartIs(boolean whereHeartIs) {
        isWhereHeartIs = whereHeartIs;
    }
}

