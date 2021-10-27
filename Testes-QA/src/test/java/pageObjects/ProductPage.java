package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {
  // constructor
  public ProductPage(){
    PageFactory.initElements(Browser.getCurrentDriver(), this);
  }

  public String getProductNamePDP(){
    return productNamePDP.getText();
  }

  @Step("Clica em Adicionar produto ao carrinho")
  public void clickButtonAddToCart(){
    buttonAddToCart.click();
  }

  public void clickButtonModalProceedToCheckout(){
    buttonModalProceedToCheckout.click();
  }


}
