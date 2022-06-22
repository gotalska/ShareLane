package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

    @Test
    public void validzipCode() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        registerButton.isDisplayed();
            }

    @Test
    public void nonvalidzipCode() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("zxvvvb");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector("span.error_message"));
        errorMessage.isDisplayed();
    }

    @Test
    public void emptyzipCode() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector("span.error_message"));
        errorMessage.isDisplayed();
    }

    @Test
    public void moreThen5SymbolszipCode() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("123456789");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector("span.error_message"));
        errorMessage.isDisplayed();
    }

    @Test
    public void validAllRegisterField() {
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
    }

    @Test
    public void nonValidFirstNameField() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("#$%^&");
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("Dow");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test@testestest.test");
        WebElement password = driver.findElement(By.name("password1"));
        password.sendKeys("John123");
        WebElement confirmPassword = driver.findElement(By.name("password2"));
        confirmPassword.sendKeys("John123");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.cssSelector("span.error_message"));
        accountCreated.isDisplayed();
    }
    @Test
    public void nonValidEmailField() {
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
        email.sendKeys("testtestest");
        WebElement password = driver.findElement(By.name("password1"));
        password.sendKeys("John123");
        WebElement confirmPassword = driver.findElement(By.name("password2"));
        confirmPassword.sendKeys("John123");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.cssSelector("span.error_message"));
        accountCreated.isDisplayed();
    }
    @Test
    public void nonValidPasswordField() {
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
        email.sendKeys("test@testes.test");
        WebElement password = driver.findElement(By.name("password1"));
        password.sendKeys("1");
        WebElement confirmPassword = driver.findElement(By.name("password2"));
        confirmPassword.sendKeys("John123");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.cssSelector("span.error_message"));
        accountCreated.isDisplayed();
    }

    @Test
    public void nonValidConfirmPasswordField() {
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
        email.sendKeys("test@testes.test");
        WebElement password = driver.findElement(By.name("password1"));
        password.sendKeys("John123");
        WebElement confirmPassword = driver.findElement(By.name("password2"));
        confirmPassword.sendKeys("1");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.cssSelector("span.error_message"));
        accountCreated.isDisplayed();
    }

    @Test
    public void differentConfirmPasswordField() {
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
        email.sendKeys("test@testes.test");
        WebElement password = driver.findElement(By.name("password1"));
        password.sendKeys("John123");
        WebElement confirmPassword = driver.findElement(By.name("password2"));
        confirmPassword.sendKeys("John12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.cssSelector("span.error_message"));
        accountCreated.isDisplayed();
    }

}
