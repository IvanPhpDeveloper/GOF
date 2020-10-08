package GOF.AbstractFactory.website;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;
import GOF.AbstractFactory.Developer;
import GOF.AbstractFactory.ProjectManager;
import GOF.AbstractFactory.ProjectTeamFactory;
import GOF.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDevelop();
    }

    @Override
    public Tester getTester() {
        return new ManualTest();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new websitePM();
    }
}
