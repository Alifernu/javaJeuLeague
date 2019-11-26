package LOL;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {

        Spell leeSin1 = new Spell("Sonic Wave",  7);

        ArrayList<Item> inventory = new ArrayList<Item>();
        ArrayList<Item> shop = new ArrayList<Item>();
        Item bladeOfTheRuinedKing = new Item("Blade Of The Ruined King",30,0, 850);


        Champion LeeSin = new Champion("LeeSin", 0, leeSin1, inventory, 0, 0 ,1.4, 800, 0);

        LeeSin.inventory.add(bladeOfTheRuinedKing);
        LeeSin.updateStatsWithItems();

        System.out.println(LeeSin.toString());


    }
}


