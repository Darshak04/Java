import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://google.com");		
		d.findElement(By.className("gLFyf")).sendKeys("Darshak");
	}

}
