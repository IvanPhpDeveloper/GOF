package GOF.AbstractFactory.Banking;

import GOF.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes javacode");
    }
}
