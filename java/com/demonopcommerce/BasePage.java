package com.demonopcommerce;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;

    public WebDriver  openBrowser(){

        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get( driver.getCurrentUrl () );
        driver.manage ().window ().maximize ();
return driver;



    }
    public Properties initialiseProperties() {

        prop = new Properties();
        try {
            file = new FileInputStream ("C:\\Users\\sidgo\\IdeaProjects\\PomFreamWork\\src\\test\\resources\\TestData\\config.properties");
            prop.load(file);
        }catch (FileNotFoundException e){
            System.out.println("Config file is not found, please check.........");
        }catch (IOException e){
            System.out.println("Properties could not be loaded");
        }

        return prop;
    }

}





