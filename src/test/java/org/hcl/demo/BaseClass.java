package org.hcl.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	WebDriver driver;

	public WebDriver lanchBrowser() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		return driver;
		
	}
	
	
	public WebElement findElementById(String text) {
		
		WebElement e = driver.findElement(By.id(text));
		
		return e;
		
	}
	
	public WebElement findElementByName(String text) {
		
		WebElement e = driver.findElement(By.name(text));
		return e;
		
		
	}
	
	public WebElement findElementByClassName(String Text) {
		
		WebElement e = driver.findElement(By.className(Text));
		return e;
		
	}
	
	public WebElement findElementByXpath(String Xpath) {
		
		
		WebElement e = driver.findElement(By.xpath(Xpath));
		return e;
			
	}
	
	 public void loadUrl(String url) {
		
		 driver.get(url);
	}
	
	 public void type(WebElement element,String data) {
		 
		 element.sendKeys(data);
		
	}
	
	public void btnClick(WebElement element) {
		
		element.click();
		
	}
	
	public void browserClose() {
		
		driver.quit();	
	
	}
	
	public String getCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
			
	}
	
	public String getTitle() {
		
		String title = driver.getTitle();
		
		return title;
		
	}
	
	public String getAttribute(WebElement e,String attributename) {
		
		
		String attribute = e.getAttribute(attributename);
		
		return attribute;	
		
	}
	
	public String getAttributeValue(WebElement e,String attributevalue) {
		
		String attribute = e.getAttribute(attributevalue);
		return attribute;
		
	}
	
	
	public String getText(WebElement e) {
		
	String text = e.getText();
	
	return text;
		
	}
	
	
	public void movetoElement(WebElement e) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e).perform();
		
		
	}
	
	public void dragAnddrop(WebElement e,WebElement e1) {
		
		
		Actions a = new Actions(driver);
		
         a.dragAndDrop(e, e1);
	
	}
	
 public void dobuleClick(WebElement e) {
	 
	 Actions a = new Actions(driver);
	 
	 a.doubleClick(e).perform();
	 
}	
	
 public void contextClick(WebElement e) {
	 Actions a = new Actions(driver);
	 
	 a.contextClick(e).perform();	 
	
}
 public void robotClass(WebElement e) throws AWTException {
	 
	 Robot r = new Robot();
	 
	 r.keyRelease(KeyEvent.VK_ENTER);

}

public void robot (WebElement e) throws AWTException {
	 
	 Robot r = new Robot();
	 
	 r.keyPress(KeyEvent.VK_WINDOWS);

}
	
public boolean isSlected(WebElement e) {
	
	boolean b = e.isSelected();
	return b;
	
}
	
public boolean isDisplayed(WebElement e) {

	boolean b = e.isDisplayed();
	return b;
		
}

public boolean isEnabled(WebElement e) {
	
	boolean b = e.isEnabled();
	return b;		
}

public void javaScriptExcute(String data,WebElement e) {
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
	
}


public void javaScriptEx(String data ,WebElement e) {
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click()", data);

}

public void javaScExcute(String data,WebElement e) {
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("return arguments[0].getAttribute('value')", e);
	
}

public void jScriptEx(String text,WebElement e) {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(ture)", e);
	
}

public void jScriptExcu(String text,WebElement e) {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(false)", e);
	

}

public void alertSendkeys(String text) {
	
	Alert al = driver.switchTo().alert();
	
	
}

public void navigate(String text) {
	
	driver.navigate().to(text);
}

public void navigateFor() {
	
	driver.navigate().forward();
	
}
public void navigateBack() {
	
	driver.navigate().back();
	
}

public void navigateRefresh() {
	
	driver.navigate().refresh();
	
}
 
public void windowHandle(String txt) {
	
	driver.switchTo().window(txt);
	
}

public String windowHandle1(String txt) {
	
String windowHandle = driver.getWindowHandle();

return windowHandle;
	

}

public Set<String> windowHandles(String txt) {
	
	Set<String> handles = driver.getWindowHandles();
	
	return handles;
	
}

public void Screenshot(String loc) {
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	File  dest = new File(loc);
	
}

 



























	
}
	
