package br.com.stefanini.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class Page {

	public WebDriver driver;

	public void startService() throws IOException {

		String path = new File("..").getCanonicalPath()
		.concat("\\cucumber-project\\src\\test\\resources\\phantomjs.exe");
		//boolean v = new File(path).isFile();
		System.setProperty("phantomjs.binary.path", path);
		//System.setProperty("webdriver.chrome.driver","C:/usr/drivers/chromedriver.exe");	
		driver = new PhantomJSDriver();	
	}

	public void stopService() {
		driver.quit();
	}

	public void getPage(String page) {
		driver.get(page);
	}
}
