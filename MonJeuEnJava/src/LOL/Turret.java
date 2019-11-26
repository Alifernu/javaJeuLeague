package LOL;

public class Turret extends Vivant{
    public String name;
    public static double attackDamage;
    public static double armorResist;
    public static double attackSpeed;
    public static double healthPoint;
    public double range;

    public Turret(String name, double attackDamage, double armorResist, double attackSpeed, double healthPoint, double range) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.armorResist = armorResist;
        this.attackSpeed = attackSpeed;
        this.healthPoint = healthPoint;
        this.range = range;

    }



//    public void autoAttackToChampion(double attackDamage, Champion champion){
//        champion.healthPoint = champion.healthPoint - ((this.attackDamage * champion.armorResist) / 100);
//    }

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

    public double getArmorResist() {
        return armorResist;
    }

    public void setArmorResist(double armorResist) {
        this.armorResist = armorResist;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(float healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public void doDamage(double numberDMG, Vivant viv) {

        numberDMG = this.attackDamage;
        viv.healthPoint = viv.healthPoint - ((numberDMG * viv.armorResist) / 100);
    }
}
