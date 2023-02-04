package nari7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class TC_Alerts {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.driver.gecko.driver","C:\\Users\\Millennium\\Desktop\\selenium\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(2000);
Alert a=driver.switchTo().alert();

System.out.println(a.getText());
a.accept();
Thread.sleep(1000);

driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(2000);
System.out.println("login completed");
driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
driver.close();

}
}

