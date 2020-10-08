package GOF.AbstractFactory.AuctionSiteProject;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;
import AbstractFactory.website.WebsiteTeamFactory;
import GOF.AbstractFactory.Developer;
import GOF.AbstractFactory.ProjectManager;
import GOF.AbstractFactory.ProjectTeamFactory;
import GOF.AbstractFactory.Tester;
import GOF.AbstractFactory.website.WebsiteTeamFactory;

public class AuctionProject  {
    public static void main(String[] args) {
        ProjectTeamFactory pt=new WebsiteTeamFactory();
        Developer developer=pt.getDeveloper();
        Tester tester=pt.getTester();
        ProjectManager projectManager=pt.getProjectManager();


        System.out.println("Creating Option Website....");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
