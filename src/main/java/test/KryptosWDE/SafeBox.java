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
		 RemoteWebElement childdriver = null;
		childdriver.findElementByName("SafeBox").click();
		 System.out.println("SafeBox clicked..");
	}
}
