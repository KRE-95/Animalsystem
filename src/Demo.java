import forum.Menu;
import model.*;

public class Demo {
    public static void main(String[] args) {
        new Menu();

        Cat cat = new Cat("Cat","F",17 , "Domestic pet", " Omnivores ", "Mewo mewo ", "Warmblooded", "has tail", "purrs", 13 );
        System.out.println( "\n"+ cat);
        System.out.println();
        Lion lion = new Lion("Lion","M", 16 ," Jungle ", "Meat", "ROAR" , "Warmblooded", "Tail","Purrs", 16 , "Dangerous");
        System.out.println(lion);
        System.out.println();
        Dolphin dolphin = new Dolphin("Dolphin","F",29,"Ocean","Carnivores","Whistles","Warmblooded",false,5);
        System.out.println(dolphin);
        System.out.println();
        Lizard lizard = new Lizard("Lizard","F",50,"On Ground","Omnivores","Gecko","Coldblooded","Dragon skin","Three chamber heart",20);
        System.out.println(lizard);

    }
}
