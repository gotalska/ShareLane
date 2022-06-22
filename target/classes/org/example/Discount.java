package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Discount {

        @BeforeMethod
        public void logIn () {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=1234567890");
            driver.findElement(By.name("first_name")).sendKeys("Green");
            driver.findElement(By.name("last_name")).sendKeys("Maxim");
            driver.findElement(By.name("email")).sendKeys("maxim@tyu.ru");
            driver.findElement(By.name("password1")).sendKeys("12345");
            driver.findElement(By.name("password2")).sendKeys("12345");
            driver.findElement(By.cssSelector("input[value='Register']")).click();
            WebElement message = driver.findElement(By.cssSelector("span.confirmation_message"));
            Assert.assertTrue(message.isDisplayed(), "Account is created!");
            String Email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
            String Password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
            driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
            driver.findElement(By.name("email")).sendKeys(Email);
            driver.findElement(By.name("password")).sendKeys(Password);
            driver.findElement(By.cssSelector("input[value='Login']")).click();
        }

        @Test
        public void discountWithLessThen20Books () {
            // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            // WebDriver driver = new ChromeDriver();
            // logIn();
            driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=1");
            driver.findElement(By.cssSelector("img[src='images/add_to_cart.gif']"));
            driver.findElement(By.cssSelector("a[href='./shopping_cart.py']"));
            driver.findElement(By.name("q")).clear();
            driver.findElement(By.name("q")).sendKeys(19);
            WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='0']"));
            Assert.assertTrue(discount.isDisplayed(), "discount, % is wrong");

        }
    }

