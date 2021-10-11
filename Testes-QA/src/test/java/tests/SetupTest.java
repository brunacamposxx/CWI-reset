package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{
    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }
    @Test
    public void testLogin() {
        // Iniciar as páginas
        HomePage home = new HomePage();

        // Iniciar página de Login
        LoginPage login = new LoginPage();


        home.clickBtnLogin();
        System.out.println("Clicou em Sign In e direcionou para a página de Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));


        login.fillEmail();
        System.out.println("Preencheu o campo do e-mail");

        login.fillPasswd();
        System.out.println("Preencheu o campo de senha");

        login.clickBtnSubmitLogin();
        System.out.println("Clicou no Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no site");



        // Browser.getCurrentDriver().findElement(By.className("login")).click();
        //         System.out.println("Clicou em Sign In e direcionou para a página de Login");
        // assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                // .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        // Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("rrsetcwi+autopractice@gmail.com");
        // System.out.println("Preencheu o campo do e-mail");
        // Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("teste123");
        // System.out.println("Preencheu o campo de senha");
        // Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        // System.out.println("Clicou no Sign In");
        // assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        // System.out.println("Validou a url da minha conta");
        // assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        // System.out.println("Validou Minha Conta no site");
    }

    @Test
    public void testSearch(){

        String quest = "DRESS";
        String questResultQtd = "7";

        // Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        // fazer a pesquisa
        home.doSearch(quest);
        System.out.println("Pesquisa pelo termo DRESS");

        // validar pesquisa
        Assert.assertTrue(search.isSearchPage());
        Assert.assertEquals(search.getTextLighter().replace("\"", ""), quest);
        System.out.println("Passei aqui");
        Assert.assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
        System.out.println("E aqui também");
    }



}