package model;

public class Reptile extends Animal{ // coldBlooded
    private String coldBlooded;


    public Reptile(String species, String gender, int lifeExp, String habitat, String food, String sound, String coldBlooded) {
        super(species, gender, lifeExp, habitat, food, sound);
        this.coldBlooded = coldBlooded;
    }

    // getter og setter

    public String getColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(String coldBlooded) {
        this.coldBlooded = coldBlooded;
    }



}
