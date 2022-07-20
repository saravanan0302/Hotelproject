package com.java;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Options;

public class BrokenImage {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		System.out.println(elements);
		int count = 0, notequal = 0;
		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			String attribute = element.getAttribute("src");

			if (attribute != null) {
				URL url = new URL(attribute);
				URLConnection connection = url.openConnection();
				HttpsURLConnection http = (HttpsURLConnection) connection;
				int code = http.getResponseCode();
				if (code == 200) {

					count++;
				}
				if (code != 200) {
					System.out.println(attribute);
					notequal++;
				}
			}

		}

		System.out.println("Good images count" + count);
		System.out.println("Broken images count" + notequal);
	}

}
