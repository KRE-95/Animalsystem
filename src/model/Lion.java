package model;

public class Lion  extends Cat{

    private String dangerous;

    public Lion(String species, String gender, int age, String habitat, String food, String sound, String warmBlooded, String tail, String purr, int sleeps, String dangerous) {
        super(species, gender, age, habitat, food, sound, warmBlooded, tail, purr, sleeps);
        this.dangerous = dangerous;
    }

    public String getDangerous() {
        return dangerous;
    }

    public void setDangerous(String dangerous) {
        this.dangerous = dangerous;
    }
}
