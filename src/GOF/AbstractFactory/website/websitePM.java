package GOF.AbstractFactory.website;

import AbstractFactory.ProjectManager;
import GOF.AbstractFactory.ProjectManager;

public class websitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project....");
    }
}
