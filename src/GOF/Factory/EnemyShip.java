package GOF.Factory;

public abstract class EnemyShip {
    private String name;
    private double amtDouble;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDouble() {
        return amtDouble;
    }

    public void setAmtDouble(double amtDouble) {
        this.amtDouble = amtDouble;
    }
    public void followHeroShip(){
        System.out.println(getName()+" is follow the hero");

    }
    public void displayEnemyShip(){
        System.out.println(getName()+" is on a screen");

    }
    public void enemyShipShoot(){
        System.out.println(getName()+" attacks and does "+getAmtDouble());

    }
}
