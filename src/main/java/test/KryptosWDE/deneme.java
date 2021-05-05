package test.KryptosWDE;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

public class deneme {
		private static final Capabilities Capabilities = null;
		private static WindowsDriver restoreSession = null;
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
 restoreSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
 
} catch (Exception e) {
 e.printStackTrace();
  }
 }

@Test 
public void Restore() throws InterruptedException, MalformedURLException, FileNotFoundException {
String Name = null;
String Email = null;
String MasterPassword = null;
String AccountKey = null;
String OnlineAccountId = null;
String UnlockPassword = null;
restoreSession.findElementByAccessibilityId("RestoreTokenButton").click();
System.out.println("Restore is started..");
Thread.sleep(5000);

DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("app","C:\\Program Files\\Kryptos\\WDE\\KryptosWDE.exe");
WindowsDriver childdriver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
Thread.sleep(1000);

childdriver.findElementByAccessibilityId("nextButton").click();
System.out.println("Backup file - restore");
Scanner sc = null;
	try {
	  sc = new Scanner( new File("C:\\Users\\Aylin\\Desktop\\KRYPTOS_Yedek_aylin_altinbas_hotmail_com.txt"));
	  String[] result = new String[14];
	  for(int j =0;j<10;j++) { 
		  String s = sc.nextLine();
		  String[] arrOfStr1 = s.split("= ");
		  for (int i = 0; i < arrOfStr1.length; i++) {
			  if (i == 1 && j == 2) {
				  System.out.println(arrOfStr1[1]);
				   Name = arrOfStr1[1];
				   }
			  else if (i == 1 && j == 3) {
				  System.out.println(arrOfStr1[1]);
				  Email = arrOfStr1[1];
				  }
			  else if (i == 1 && j == 4) {
				  System.out.println(arrOfStr1[1]);
				  MasterPassword = arrOfStr1[1];
				   }
			  else if (i == 1 && j == 5) {
				  System.out.println(arrOfStr1[1]);
				  AccountKey = arrOfStr1[1];
			  		}
			  else if (i == 1 && j == 6 ) {
				  System.out.println(arrOfStr1[1]);
				  OnlineAccountId = arrOfStr1[1];
				  }
			  else if (i == 1 && j == 9 ) {
				  System.out.println(arrOfStr1[1]);
				  UnlockPassword = arrOfStr1[1];
				  }
			  }  
		  }
	  }
	catch (IOException  exp) {
	  // TODO Auto-generated catch block
	  exp.printStackTrace();
	}finally{
	  if(sc != null)
	    sc.close();
	}

	Actions switchKeyboardLayoutActions = new Actions(childdriver);
	switchKeyboardLayoutActions.sendKeys(Keys.CONTROL + "0" + Keys.CONTROL);
	switchKeyboardLayoutActions.build();
	switchKeyboardLayoutActions.perform();
	
	childdriver.findElementByAccessibilityId("rawRestore_Name").sendKeys(Name);
	childdriver.findElementByAccessibilityId("rawRestore_EmailAddress").sendKeys(Email);
	childdriver.findElementByAccessibilityId("rawRestore_MasterPassword").sendKeys(MasterPassword);
	childdriver.findElementByAccessibilityId("rawRestore_RestoreUserPart").sendKeys(AccountKey);
	childdriver.findElementByAccessibilityId("rawRestore_AccountGUID").sendKeys(OnlineAccountId);
	childdriver.findElementByAccessibilityId("rawRestore_UnlockUserPart").sendKeys(UnlockPassword);
	childdriver.findElementByAccessibilityId("nextButton").click();


/*winiu
WebElement scroll = childdriver.findElementByAccessibilityId("cawLicense_licenseBox");
for(int i=8; i>0; i--){
scroll.sendKeys(Keys.PAGE_DOWN);
}

System.out.println("Restore is started..2");
childdriver.findElementByAccessibilityId("DownButton").click();
childdriver.findElementByAccessibilityId("cawLicense_LicenseAccepted").click();
System.out.println("Restore is started..3");
childdriver.findElementByAccessibilityId("nextButton").click();
*/
//childdriver.findElementByAccessibilityId("rawTokenLogin_TokenPin").sendKeys("A!1q2w3e4r//");

/*
Actions switchKeyboardLayoutActions = new Actions(childdriver);
switchKeyboardLayoutActions.sendKeys(Keys.CONTROL + "0" + Keys.CONTROL);
switchKeyboardLayoutActions.build();
switchKeyboardLayoutActions.perform();








/*
childdriver.findElementByAccessibilityId("rawRestore_Name").sendKeys(Name);
childdriver.findElementByAccessibilityId("rawRestore_EmailAddress").sendKeys(Email);
childdriver.findElementByAccessibilityId("rawRestore_MasterPassword").sendKeys(MasterPassword);
childdriver.findElementByAccessibilityId("rawRestore_RestoreUserPart").sendKeys(AccountKey);
childdriver.findElementByAccessibilityId("rawRestore_AccountGUID").sendKeys(OnlineAccountId);
childdriver.findElementByAccessibilityId("rawRestore_UnlockUserPart").sendKeys(UnlockPassword);


childdriver.findElementByAccessibilityId("nextButton").click();

*/


}

}