package model;

public class Lizard extends Reptile{
 private String scallySkin;
 private String threeChamberHeart;
 private int layEggs;


 // kombo av arv fra reptile og ekstra lagt til egenskaper
    public Lizard(String species, String gender, int lifeExp, String habitat, String food, String sound, String coldBlooded, String scallySkin, String threeChamberHeart, int layEggs) {
        super(species, gender, lifeExp, habitat, food, sound, coldBlooded);
        this.scallySkin = scallySkin;
        this.threeChamberHeart = threeChamberHeart;
        this.layEggs = layEggs;
    }


    // getter og setter
    public String getScallySkin() {
        return scallySkin;
    }

    public void setScallySkin(String scallySkin) {
        this.scallySkin = scallySkin;
    }

    public String getThreeChamberHeart() {
        return threeChamberHeart;
    }

    public void setThreeChamberHeart(String threeChamberHeart) {
        this.threeChamberHeart = threeChamberHeart;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return

                "Species: "+ getSpecies() + "." + "\n " +
                        "Gender: "+ getGender()+ "." + "\n" +
                        "Reptile: " + getColdBlooded() + "\n" +
                        "Life expectancy: "+ getLifeExp() + "." + "\n"+
                        "Habitat: "+ getHabitat()+ "." + " \n " +
                        "Food: "+ getFood()+ "." + "\n" +
                        "Sound: " + getSound() + "." + "\n" +
                        "Skin:  " + getScallySkin() + "." + "\n" +
                        "Heart: " + getThreeChamberHeart() + "." + "\n"+
                        "Lay eggs: " + getLayEggs() + " batch."






                ;



    }
}
