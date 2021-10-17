package pageObjects;

import elementMapper.AddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;


public class AddressPage extends AddressPageElementMapper {
  public AddressPage(){
    PageFactory.initElements(Browser.getCurrentDriver(), this);
  }

  public static void clickBtnProceedToCheckout(){
    btnProceedToCheckout.click();
  }

  public static void clickCheckbox(){
    checkbox.click();
  }

  public static void clickProcessCarrier(){
    processCarrier.click();
  }

  public static void clickBankwire(){
    bankwire.click();
  }

  public static void clickconfirmOrder(){
    confirmOrderbtn.click();
  }
}
