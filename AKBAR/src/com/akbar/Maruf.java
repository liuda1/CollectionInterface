package com.akbar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Maruf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Users/liuda/Documents/Libraries/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	driver.get("http://the-internet.herokuapp.com/challenging_dom");
//	int rows=driver.findElements(By.xpath("//tbody/tr")).size();
//	int cols=driver.findElements(By.xpath("//tbody/tr[1]/td")).size();
//	for (int i = 1; i < rows+1; i++) {
//		
//	   for (int j = 1; j < cols+1; j++) {
//
//		if (driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText().equals("Definiebas2")){
//			System.out.println(i+","+j);
//		}
//	}
//	}
//	driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");
//	
//	List <WebElement> color=driver.findElements(By.xpath("//input[@name='color']"));
//	for (WebElement webElement : color) {
//		System.out.println(webElement.getText());
//	}
//	String a="abcde";
//	for (int i = a.length()-1; i >=0; i--) {
//	    System.out.print(a.charAt(i));	
//	}
//	System.out.println();
//	Object[] x = new Object[]{1,2,3,"srk"};
//	for(Object o: x){
//		   System.out.println(o);
//		}
//	String b="1234";
//	int i=Integer.valueOf(b);
//	System.out.println(i/2);
//	
//	String c="3ty412jji88332mj1";
//	for (int j = 0; j < c.length(); j++) {
//		if (Character.isDigit(c.charAt(j))){
//			System.out.print(c.charAt(j));
//		}
//		}
//
//	driver.get("http://the-internet.herokuapp.com/iframe");
//	WebElement frame=driver.findElement(By.xpath("//iframe"));
//	driver.switchTo().frame(frame);
//	System.out.println(driver.findElement(By.id  ("tinymce")).getText());
//	driver.switchTo().defaultContent();
//	System.out.println(driver.findElement(By.xpath("//div[@style='text-align: center;']")).getText());

	
	driver.get("http://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");
	driver.switchTo().frame("iframeResult");
	Actions act=new Actions(driver);
	act.doubleClick(driver.findElement(By.tagName("p"))).perform();
	try{
	Alert alert=driver.switchTo().alert();
	alert.accept();
	System.out.println("alert was accepted");
	}catch(Exception e){
		System.out.println("No alert pop up");
	}
	
}
}
