package model;

import Interface.abiltyToSwim;




public class Dolphin extends Mammal implements abiltyToSwim {

    private boolean gills;  // false
    private  int fins ; // 5


    public Dolphin(String species, String gender, int age, String habitat, String food, String sound, String warmBlooded, boolean gills, int fins) {
        super(species, gender, age, habitat, food, sound, warmBlooded);
        this.gills = gills;
        this.fins = fins;

    }




    @Override
    public void Swim() {
        System.out.println(getSpecies()+"differentiate from other mammal, they can : " + "swim");
    }




    // getter og setter
    public boolean isGills() {
        return gills;
    }

    public void setGills(boolean gills) {
        this.gills = gills;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
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
                        "Gills: " + isGills() + "\n" +
                        "Fins: " + getFins() + "."


                ;



    }
}
