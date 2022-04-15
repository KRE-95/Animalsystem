package model;


public class Animal  {

    // state
    private String species;  // dyreart
    private String gender;
    private int lifeExp; // life expectancy
    private String habitat;
    private String food;
    private String sound;


    // constructer - other classes can use
    public Animal(String species, String gender, int lifeExp, String habitat, String food, String sound) {
        this.species = species;
        this.gender = gender;
        this.lifeExp = lifeExp;
        this.habitat = habitat;
        this.food = food;
        this.sound = sound;

    }


    // getter and setter


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLifeExp() {
        return lifeExp;
    }

    public void setLifeExp(int lifeExp) {
        this.lifeExp = lifeExp;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }



  /*  @Override
    public String toString() {
        return "Species: " + species + "." + "\n " +
                "Gender: " + gender + "." + "\n" +
                "Age: " + age + "." + "\n" +
                "Habitat: " + habitat + "." + " \n " +
                "Food: " + food + "." + "\n" +
                "Sound: " + sound + ".";


    }*/

}