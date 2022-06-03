package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public WebDriver Driver;

    @Test
    public void MetodaLogin(){

        //Setam driver-ul de chrome
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //Deschidem un browser de Chrome
        Driver=new ChromeDriver();
        //Accesam un url
        Driver.get("http://demo.automationtesting.in/Index.html");


        //Identificam butonul sign in
        WebElement SignInElement=Driver.findElement(By.id("btn1"));
        SignInElement.click();

        //Identificam butonul de email
        WebElement EmailElement=Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String EmailValue="abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        WebElement PasswordElement=Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String PasswordValue="parola";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterElement=Driver.findElement(By.id("enterbtn"));
        EnterElement.click();




    }
}
