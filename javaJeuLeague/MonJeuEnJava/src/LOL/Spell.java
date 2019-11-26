package LOL;

public class Spell {
    public String name;
    public float damage;

    public Spell(String name, float damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public float getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}

