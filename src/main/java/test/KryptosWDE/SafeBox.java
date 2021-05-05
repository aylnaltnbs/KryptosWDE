package test.KryptosWDE;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.windows.WindowsDriver;

public class SafeBox {
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		 //RemoteWebElement childdriver = null;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("app","C:\\Program Files\\Kryptos\\WDE\\KryptosWDE.exe");
		 WindowsDriver childdriver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
		 System.out.println("wait openning..");
		 childdriver.findElementByName("Paylaşım").click();
		 System.out.println("Paylaşım clicked..");
		 childdriver.findElementByName("Gruplar").click();
		 System.out.println("1..");
		 
		 for(int i=10; i<=500; i++) {
				
		 childdriver.findElementByName("Yeni Grup").click();
		 Thread.sleep(3000);
		 childdriver.findElementByName("İsim").sendKeys("deneme"+i);
		 childdriver.findElementByName("Kaydet").click();
		 System.out.println("Grup Sayısı:"+i);
		 Thread.sleep(3000);

		 }
		 Thread.sleep(7000);
	}
}
