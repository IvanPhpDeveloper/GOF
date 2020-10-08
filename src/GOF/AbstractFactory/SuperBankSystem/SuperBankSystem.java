package GOF.AbstractFactory.SuperBankSystem;

import GOF.AbstractFactory.Banking.BankingTeamFactory;
import GOF.AbstractFactory.Developer;
import GOF.AbstractFactory.ProjectManager;
import GOF.AbstractFactory.ProjectTeamFactory;
import GOF.AbstractFactory.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new BankingTeamFactory();
        Developer developer=projectTeamFactory.getDeveloper();
        ProjectManager projectManager=projectTeamFactory.getProjectManager();
        Tester tester=projectTeamFactory.getTester();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
