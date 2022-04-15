package model;

public class Mammal extends Animal {

    // add somthing uniq
    private String warmBlooded;

    public Mammal(String species, String gender, int age, String habitat, String food, String sound , String warmBlooded) {
        super(species, gender, age, habitat, food, sound); // animal
        this.warmBlooded = warmBlooded;
        // ha en void for warmBloded

        // ny klasse : bird, dog ,  Lion, bear
            // gi dem egenskaper. osv.

    }
     // getter and setter:
    public String getWarmBlooded() {
        return warmBlooded;
    }

    public void setWarmBlooded(String warmBlooded) {
        this.warmBlooded = warmBlooded;
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
                         "Sound: " + getSound() + "."




        ;



    }
}
