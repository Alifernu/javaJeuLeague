package LOL;

public abstract class Vivant {

    public double attackDamage = 0;
    public double armorResist = 0;
    public double attackSpeed = 0;
    public double healthPoint = 0;

    abstract void doDamage(double numberDMG, Vivant viv);

}
