package tests;

import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{
    @Test
    @DisplayName("Abre o navegador e carrega a URL")
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
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

    @Test
    public void testAcessarCategoryTShirts(){
        // Inicia as páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();
        // Clicar na categoria T-Shirt
        // home.clickCategoryTShirts();
        Browser.getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();


        //validar se ao clicar em CATEGORIA TSHIRTS ocorre o direcionamento correto
        assertTrue(category.isPageTShirts());
    }

    @Test
    @Story("Acessa a página do produto")
    public void testAddProductToProductPage(){
        // Acessar a categoria T-Shirts
        testAcessarCategoryTShirts();

        // Iniciar as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva nome do produto na página de categoria
        String nameProductCategory = category.getProductNameCategory();

        // Clicar em MORE e direcionar para a página do produto
        category.clickProductAddToProductPage();

        // Verificar se o produto está na pagina de detalhes do produto correto
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));
    }

    @Test
    public void testAddProductToCartPage(){
         testLogin();
        // Iniciar página de Login
         LoginPage login = new LoginPage();
        // Acessa a página de produto
        testAddProductToProductPage();
        // Inicia as páginas
        ProductPage pdp = new ProductPage();

        CartPage cart = new CartPage();

        //Salvar o nome do produto na pagina de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Click no botão que adiciona ao carrinho
        pdp.clickButtonAddToCart();

        //Clicar no botão Proceed to Checkout da modal
        pdp.clickButtonModalProceedToCheckout();

        //Validação do nome do produto no carrinho
        assertTrue(cart.getNameProductCart().equals(nameProductPDP));
        Browser.getCurrentDriver().findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click();

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("ADDRESS"));
        System.out.println("find address");
    }

    @Test
    @DisplayName("Testa página de confirmação de endereço")
    public void testDeliveryAddressPage(){
        // Acessa a página de carrinho
        testAddProductToCartPage();
        // Iniciar as páginas
        AddressPage delivery = new AddressPage();
        // String
        // assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("ADDRESS"));
        AddressPage.clickBtnProceedToCheckout();
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("SHIPPING"));
        AddressPage.clickCheckbox();
        System.out.println("selecionou checkbox");
        AddressPage.clickProcessCarrier();
        System.out.println("Clicou em Proceed To Checkout");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("PLEASE CHOOSE YOUR PAYMENT METHOD"));
        assertTrue(Browser.getCurrentDriver().findElement(By.cssSelector("#product_price_1_1_513467 > span")).getText().contains("$16.51"));
        AddressPage.clickBankwire();
        AddressPage.clickconfirmOrder();
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("ORDER CONFIRMATION"));
        System.out.println("CONFIRMAÇÃO DE COMPRA! FIM!!!");
    };

}
