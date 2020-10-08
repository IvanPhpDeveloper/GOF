package GOF.Builder;

public class VisitCardWebsiteBuilder  extends WebSiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card website");
    }

    @Override
    void buildCms() {
       website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
         website.setPrice(5000);
    }
}
