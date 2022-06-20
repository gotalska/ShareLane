package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Discount {
    @Test
    public void logIn() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.sharelane.com/cgi-bin/register.py");
            WebElement zipCodeField = driver.findElement(By.name("zip_code"));
            zipCodeField.sendKeys("12345");
            driver.findElement(By.cssSelector("input[value='Continue']")).click();
            WebElement firstNameField = driver.findElement(By.name("first_name"));
            firstNameField.sendKeys("John");
            WebElement lastNameField = driver.findElement(By.name("last_name"));
            lastNameField.sendKeys("Dow");
            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("test@testestest.test");
            WebElement password = driver.findElement(By.name("password1"));
            password.sendKeys("John123");
            WebElement confirmPassword = driver.findElement(By.name("password2"));
            confirmPassword.sendKeys("John123");
            driver.findElement(By.cssSelector("input[value='Register']")).click();
            WebElement accountCreated = driver.findElement(By.cssSelector("span.confirmation_message"));
            accountCreated.isDisplayed();
            String Email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
            String Password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
            driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
            driver.findElement(By.name("email")).sendKeys(Email);
            driver.findElement(By.name("password")).sendKeys(Password);
            driver.findElement(By.cssSelector("input[value='Login']")).click();
        }
    }

