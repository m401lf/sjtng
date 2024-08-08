package testCases.Search;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.IndexPage;
import pages.SearchPage;


public class TC_005_AddToCartPageTest extends BaseTest {

    @Test
    public void test_addToCart() throws InterruptedException {
        //log.info(" Starting TC_005_AddToCartPageTest ");

        try {

            IndexPage hp = new IndexPage(driver);

            hp.enterProductName("iPhone");
            hp.clickSearch();

            SearchPage sp = new SearchPage(driver);

            if (sp.isProductExist("iPhone")) {
                sp.selectProduct("iPhone");
                sp.setQuantity("2");
                sp.addToCart();

            }
            Assert.assertTrue(sp.checkConfMsg());

        } catch (Exception e) {
            Assert.fail();
        }

        log.info(" Finished TC_004_SearchProductTest ");

    }
}
