import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("email")).sendKeys("ashish.bhusal.16999@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test1234!");
		driver.findElement(By.id("login")).click();

	}

}
