package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageElementMapper {
  @FindBy(className = "page-heading")
  public WebElement pageHeading;

  @FindBy(css = "#center_column > form > p > button")
  public static WebElement btnProceedToCheckout;

  @FindBy(id = "uniform-cgv")
  public static WebElement checkbox;

  @FindBy(name = "processCarrier")
  public static WebElement processCarrier;

  @FindBy(className = "bankwire")
  public static WebElement bankwire;

  @FindBy(css = "#cart_navigation > button")
  public static WebElement confirmOrderbtn;

}
