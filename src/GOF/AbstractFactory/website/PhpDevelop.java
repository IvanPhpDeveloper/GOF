package GOF.AbstractFactory.website;

import GOF.AbstractFactory.Developer;

public class PhpDevelop implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes PHP code");
    }
}
