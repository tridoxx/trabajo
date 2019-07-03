/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.col.traffic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NeVeRLaMMeR
 */
public class melo {

    private static FirefoxDriver driver;
    private static FirefoxProfile profile;

    private static WebElement elements = null;
    // private static String driverPath =
    // "C:\\Users\\NeVeRLaMMeR\\Documents\\NetBeansProjects\\Aoe3Accs\\74/chromedriver.exe";
    // private static String driverPath =
    //private static String driverPath = "C:\\Users\\julia\\Downloads\\Aoe3Accs/geckodriver.exe";
    private static String driverPath = "/usr/bin/geckodriver";

    public static void main(String[] args) throws InterruptedException {
        int count = 0;
         while (count <= 50) {
        trafficGet();

         count++;
         }
    }

    public static void trafficGet() throws InterruptedException  {
        //System.setProperty("webdriver.chrome.driver", driverPath);
         System.setProperty("webdriver.gecko.driver", driverPath);
         //FirefoxBinary firefoxBinary =  new FirefoxBinary();
        //firefoxBinary.addCommandLineOptions("--headless");
         FirefoxOptions  options = new FirefoxOptions();
         options.addArguments("--headless");
         
        //driver = new ChromeDriver();
         driver = new FirefoxDriver(options);
        // driver = webdriver.Firefox();
         driver.manage().window().maximize();
         profile = new FirefoxProfile();
         options.addPreference("permissions.default.image", 2);
         options.addPreference("permissions.default.stylesheet",2);
         profile.setPreference("general.useragent.override", "Mozilla/5.0 (Linux; Android 6.0; HTC One M9 Build/MRA58K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36");
         
        driver.get("https://www.camsoda.com/lyndacarter");
        Thread.sleep(30);


    }
}