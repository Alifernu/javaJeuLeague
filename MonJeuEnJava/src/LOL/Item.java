package LOL;

import java.util.ArrayList;

public class Item {
    public String name;
    public double attackDamage;
    public double healthPoint;
    public int itemCost;

    public Item(String name, double attackDamage, double healthPoint, int itemCost) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.healthPoint = healthPoint;
        this.itemCost = itemCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", attackDamage=" + attackDamage +
                ", healthPoint=" + healthPoint +
                ", itemCost=" + itemCost +
                '}';
    }
}

