package com.bridgelabz.selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;

public class ExistingBrowser
{
/*sheetal@bridgelabz:~$ google-chrome -remote-debugging-port=9018 --user-data-dir"/home/Downloads/chromeabc_de"
close all the tabs open in chrome
*/
    @Test
    public void Test() throws InterruptedException, AWTException
    {
        System.setProperty("webdriver.chrome.driver","/home/sheetal/IdeaProjects/RunningScriptOnAlreadyOpenedBrowser/driver/chromedriver");
        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("debuggerAddress","localhost:9018");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.facebook.com");
    }
}
