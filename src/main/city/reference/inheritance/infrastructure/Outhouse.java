package main.city.reference.inheritance.infrastructure;

import java.util.Date;

public class Outhouse extends Building {

    private Date lastServiceDate;
    private int smellFactor;

    public Outhouse() {
        super.setCapacity(1);
        super.setNumFloors(1);
        super.setType("Outhouse");

    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public int getSmellFactor() {
        return smellFactor;
    }

    public void setSmellFactor(int smellFactor) {
        this.smellFactor = smellFactor;
    }


}
