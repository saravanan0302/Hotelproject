package com.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	System.out.println(elements);
	int count=0,notequal=0;
	for (int i = 0; i < elements.size(); i++) {
		WebElement element = elements.get(i);
	String attribute = element.getAttribute("href");
	
	if (attribute!=null) {
		URL url = new URL(attribute);
		URLConnection connection = url.openConnection();
	HttpsURLConnection http=(HttpsURLConnection)connection;
	int code = http.getResponseCode();
	if (code==200) {
		
		count++;
	}
	if (code!=200) {
		System.out.println(attribute);
		notequal++;
	}
	}
	
	}

	System.out.println("good links count"+count);
	System.out.println("Broken links count"+notequal);
	}
	
	
}
