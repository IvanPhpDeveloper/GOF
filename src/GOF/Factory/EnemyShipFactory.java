package GOF.Factory;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newEnemyShip) {
   EnemyShip newShip=null;
        if (newEnemyShip.equals("U")) {
            return new UFOEnemyShip();
        }if (newEnemyShip.equals("R")) {
                return new RocketEnemyShip();
            }
    if (newEnemyShip.equals("B")) {
        return new BigUFOEnemyShip();
    }else {
return null;
            }
        }

}

