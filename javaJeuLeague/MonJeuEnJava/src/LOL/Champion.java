package LOL;

import java.util.ArrayList;
import java.util.Random;

public class Champion extends Vivant {
    public String name;
    public int gold;
    public Spell unique;
    public ArrayList<Item> inventory = new ArrayList<Item>();
    public double attackDamage;
    public double armorResist;
    public double attackSpeed;
    public double healthPoint;

    public Champion(String name, int gold, Spell unique, ArrayList<Item> inventory, double attackDamage, double armorResist, double attackSpeed, float healthPoint, float range) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.armorResist = armorResist;
        this.attackSpeed = attackSpeed;
        this.healthPoint = healthPoint;
        this.unique = unique;
        this.inventory = inventory;
        this.gold = gold;

    }


    public void buyItem(ArrayList<Item> shop){
        Item i;
        Random r = new Random();
        i = shop.get(r.nextInt(shop.lastIndexOf(shop)));
        if(i.itemCost <= this.gold & inventory.size() < 7){
            inventory.add(i);
            this.gold = this.gold - i.itemCost;
            this.updateStatsWithItems();
        }

    }
    public void updateStatsWithItems(){
        inventory.forEach((item) -> this.attackDamage = this.attackDamage + item.attackDamage);
        inventory.forEach((item) -> this.healthPoint = this.healthPoint + item.healthPoint);
    }

    public String attackType(){
        String res = "attackDamage";
        Random r = new Random();
        switch (r.nextInt(2)){
            case 0: res = "attackDamage";

            case 1: res = "unique";
        }
        return res;
    }

    public void autoAttackToTurret(double attackDamage, Turret turret){
        Turret.healthPoint = Turret.healthPoint - ((this.attackDamage * Turret.armorResist) / 100);
    }

    public String getName() {
        return name;
    }

    public Spell getUnique() {
        return unique;
    }

    public int getGold() {
        return gold;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", attackDamage=" + attackDamage +
                ", armorResist=" + armorResist +
                ", attackSpeed=" + attackSpeed +
                ", healthPoint=" + healthPoint +
                ", spell=" + unique +
                ", item=" + inventory +
                ", gold=" + gold +
                '}';
    }

    @Override
    public void doDamage(double numberDMG, Vivant viv) {

        numberDMG = this.attackDamage;
        viv.healthPoint = viv.healthPoint - ((numberDMG * viv.armorResist) / 100);
    }
}