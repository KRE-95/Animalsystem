package model;
public class Cat extends Mammal {


    private String tail;
    private String purr;
    private int sleeps; // 13-14H


    public Cat (String species, String gender, int age, String habitat, String food, String sound, String warmBlooded,
               String tail, String purr, int sleeps) {
        super(species, gender, age, habitat, food, sound, warmBlooded);
        this.tail = tail;
        this.purr = purr;
        this.sleeps = sleeps;

    }

    @Override
    public String toString() {
        return

                        "Species: "+ getSpecies() + "." + "\n " +
                        "Gender: "+ getGender()+ "." + "\n" +
                                "Mammal: " + getWarmBlooded() + "\n" +
                        "Life expectancy: "+ getLifeExp() + "." + "\n"+
                        "Habitat: "+ getHabitat()+ "." + " \n " +
                        "Food: "+ getFood()+ "." + "\n" +
                        "Sound: " + getSound() + "." + "\n" +
                                " When relaxed : " + getPurr() + "\n" +
                                "With/out: " + getTail() + "\n" +
                                "Sleeps in hour : " + getSleeps() + "Hours in a day."






                ;



    }


    // get and set

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getPurr() {
        return purr;
    }

    public void setPurr(String purr) {
        this.purr = purr;
    }

    public int getSleeps() {
        return sleeps;
    }

    public void setSleeps(int sleeps) {
        this.sleeps = sleeps;
    }
}
