package pageObjects;

import elementMapper.CreateAnAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAnAccountPage extends CreateAnAccountElementMapper {
  public CreateAnAccountPage() {
    PageFactory.initElements(Browser.getCurrentDriver(), this);
  }

  public void clickBtnLogin(){
    login.click();
  }
  // String emailRandom = "bruna" + Random().nextInt() + "@gmail.com";
  public void createEmail() {
    email_create.sendKeys("xablau@hotmail.com");
  }

  public void btnSubmitCreate(){
    submitCreate.click();
  }

  public void fillCustomer_firstname(){
    customer_firstname.sendKeys("Bruna");
  }

  public void fillCustomer_lastname(){
    customer_lastname.sendKeys("Campos");
  }

  public void passwd(){
    passwd.sendKeys("123456");
  }

  public void fillAddress(){
    address1.sendKeys("Avai");
  }

  public void fillCity(){
    city.sendKeys("Novo Hamburgo");
  }

  public void fillState(){
    id_state.sendKeys("Delaware");
  }

  public void fillPostCode(){
    postcode.sendKeys("93315");
  }

  public void fillPhone(){
    phone_mobile.sendKeys("21979530020");
  }

  public void btnSubmitAccount(){
    submitAccount.click();
  }




}
