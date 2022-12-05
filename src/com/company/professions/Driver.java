package com.company.professions;

public class Driver extends Person {

    private int driving_experience;


    public Driver(String surname, String name, String patronymic, int driving_experience) {
        super(surname, name, patronymic);
        this.driving_experience = driving_experience;
    }

    public int getDriving_experience() {
        return driving_experience;
    }

    public void setDriving_experience(int driving_experience) {
        this.driving_experience = driving_experience;
    }

    @Override
    public String toString () {
        return super.toString() +
                " driving_experience = " + driving_experience + "\n";
    }

}
