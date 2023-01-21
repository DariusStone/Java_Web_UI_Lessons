package org.example;



public class Main {
    public static void main(String[] args) {
        System.setProperty(
                "web-driver.chrome.driver", "src/main/resources/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}