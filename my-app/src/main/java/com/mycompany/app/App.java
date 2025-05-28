package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        try {
            Task2.run(webDriver);
            Task3.run(webDriver);
        } finally {
            webDriver.quit();
        }
    }
}

