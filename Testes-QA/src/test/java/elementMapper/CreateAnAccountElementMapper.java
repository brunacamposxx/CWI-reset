package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountElementMapper {

  @FindBy(className = "login")
  public WebElement login;

  @FindBy(css = "#email_create")
  public WebElement email_create;

  @FindBy(id = "SubmitCreate")
  public WebElement submitCreate;

  @FindBy(id = "customer_firstname")
  public WebElement customer_firstname;

  @FindBy(id = "customer_lastname")
  public WebElement customer_lastname;

  @FindBy(id = "passwd")
  public WebElement passwd;

  @FindBy(id = "days")
  public WebElement days;

  @FindBy(id = "months")
  public WebElement months;

  @FindBy(id = "years")
  public WebElement years;

  @FindBy(id = "firstname")
  public WebElement firstname;

  @FindBy(id = "lastname")
  public WebElement lastname;

  @FindBy(id = "address1")
  public WebElement address1;

  @FindBy(id = "city")
  public WebElement city;

  @FindBy(id = "id_state")
  public WebElement id_state;

  @FindBy(id = "postcode")
  public WebElement postcode;

  @FindBy(id = "phone_mobile")
  public WebElement phone_mobile;

  @FindBy(id = "submitAccount")
  public WebElement submitAccount;

}
