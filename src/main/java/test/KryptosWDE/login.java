package test.KryptosWDE;


import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

import io.appium.java_client.windows.WindowsDriver;

public class login {
		private static final Capabilities Capabilities = null;
		private static WindowsDriver notepadSession = null;
		public static String getDate(){
		 LocalDate date = LocalDate.now();
		 return date.toString();
		}

@BeforeClass
 public static void setUp() {
 try {
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("app", "C:\\Program Files\\Kryptos\\WDE\\KryptosWDE.exe");
 capabilities.setCapability("platformName","Windows");
 capabilities.setCapability("deviceName", "WindowsPC");
 notepadSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
 notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 
} catch (Exception e) {
 e.printStackTrace();
  }
 }

@Test 

public void Login() throws InterruptedException, MalformedURLException {
notepadSession.findElementByAccessibilityId("loginButton").click();

System.out.println("App is opened1..");
Thread.sleep(10000);
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("app", "C:\\Program Files\\Kryptos\\WDE\\KryptosWDE.exe");
capabilities.setCapability("platformName","Windows");
capabilities.setCapability("deviceName", "WindowsPC");
notepadSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
System.out.println("App is opened2..");
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("app","C:\\Program Files\\Kryptos\\WDE\\KryptosWDE.exe");
WindowsDriver childdriver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
System.out.println("wait openning..");
Thread.sleep(5000);

 }
}