package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
WebDriver driver;
 public RegisterPage(WebDriver driver){
     this.driver = driver;
 }

 By RegisterLink = By.xpath ( "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a" );
 By  Gender = By.id ( "gender-female" );
 By FirstName = By.id ( "FirstName" );
 By LastName =  By.id ( "LastName" );
 By  DayOfBirth = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]" );
By MonthOfBirth =  By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]" );
By YearOfBirth = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]" );
By  Email = By.id ( "Email" );
By CompanyName = By.id ( "Company" );
By NewsLetters = By.id ( "Newsletter" );
By Password =  By.id ( "Password" );
By ConfirmPassword = By.id ( "ConfirmPassword" );
 By Register = By.id ( "register-button" );





public  void  clickOnRegister(){
 driver.findElement ( RegisterLink ).click ();

}
public  void doRegister(String fname, String lname,String day,String month,String year,
                        String email,String company,String pass,String confirmpass){



 driver.findElement (  Gender ).click ();
 driver.findElement ( FirstName ).sendKeys (fname);
 driver.findElement ( LastName ).sendKeys ( lname );
 driver.findElement (  DayOfBirth ).sendKeys ( day );
 driver.findElement (  MonthOfBirth ).sendKeys ( month );
 driver.findElement ( YearOfBirth ).sendKeys ( year );
 driver.findElement (  Email  ).sendKeys (email  );
 driver.findElement ( CompanyName ).sendKeys (company  );
 driver.findElement ( NewsLetters  ).click ();
 driver.findElement (Password   ).sendKeys ( pass );
 driver.findElement ( ConfirmPassword  ).sendKeys ( confirmpass );
 driver.findElement ( Register  ).click ();

}



 }


