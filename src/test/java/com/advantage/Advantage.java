package com.advantage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class Advantage {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id='menuUser']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys("BRtest02");
            driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).sendKeys("Pass*02");
            driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys("Pass*02");
            driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).sendKeys("briam@gmail.com");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys("Briam");
            driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).sendKeys("Pulecio");
            driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).sendKeys("123456789");
            driver.findElement(By.xpath("//select[@name='countryListboxRegisterPage']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[contains(text(),'Bolivia')]")).click();
            driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).sendKeys("Medallo ome");
            driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).sendKeys("Medallo ome");
            driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).sendKeys("Medallo");
            driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).sendKeys("11111");
            driver.findElement(By.xpath("//input[@name='i_agree']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@id='register_btnundefined']")).click();
            Thread.sleep(5000);

            // Comprar prodcto
        driver.findElement(By.xpath("//*[@id='menuUser']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@Name='username']")).sendKeys("BRtest02");
        driver.findElement(By.xpath("//input[@Name='password']")).sendKeys("Pass*02");
        driver.findElement(By.xpath("//button[@Id='sign_in_btnundefined']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='tabletsImg']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@id='18']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@Id='checkOutPopUp']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@Id='next_btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@Name='safepay_username']")).sendKeys("BRtest01");
        driver.findElement(By.xpath("//input[@Name='safepay_password']")).sendKeys("Pass*01");
        driver.findElement(By.xpath("//button[@Id='pay_now_btn_SAFEPAY']")).click();
        Thread.sleep(5000);
    }

    @After
    public void close() {
        driver.close();
    }
}

