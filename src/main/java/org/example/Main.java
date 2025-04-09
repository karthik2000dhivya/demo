package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   @Test
   public void mymethod(){
       WebDriver w = new ChromeDriver();
       w.get(" https://rahulshettyacademy.com/loginpagePractise/ ");
   }
}