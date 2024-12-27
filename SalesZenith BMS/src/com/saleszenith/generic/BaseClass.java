package com.saleszenith.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.saleszenith.pom.HomePage;
import com.saleszenith.pom.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static String url;
    public static String un;
    public static String pwd;

    /**
     * To load properties from the commondata.properties file
     */
    public void loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("./data/commondata.property");
        prop.load(input);

        url = prop.getProperty("url");
        un = prop.getProperty("username");
        pwd = prop.getProperty("password");
    }

    /**
     * To open the browser before each class is executed
     */
    @BeforeTest
    public void openBrowser() throws IOException {
        // Load properties
        loadProperties();

        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }

    /**
     * To close the browser after execution of each test script in a class
     */
    @AfterTest
    public void closeBrowser() {
        driver.manage().window().minimize();
        driver.quit();
    }

    /**
     * To login before executing each test script
     * @throws IOException
     * @throws InterruptedException
     */
    @BeforeMethod
    public void login() throws IOException, InterruptedException {
        LoginPage l = new LoginPage(driver);
        l.login(un, pwd);
    }

    /**
     * To logout after each test script is executed
     */
    @AfterMethod
    public void logout() {
        HomePage homePage = new HomePage(driver);
        homePage.getLogoutBtn().click();
    }
}
