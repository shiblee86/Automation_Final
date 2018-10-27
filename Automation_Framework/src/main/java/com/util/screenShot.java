package com.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {

	public static String captureScreenShot(WebDriver driver, String ScreenShotName) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
	File file = new File(currentDir+"\\ScreenShots");
		
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("Create folder");
		}
		else {
			file.delete();
			file.mkdirs();
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		Date date = new Date();
	  String dateTime = dateFormat.format(date.getTime());
	
		String destination=currentDir+"/ScreenShots/"+dateTime+"_" +ScreenShotName + ".png";
		
		
		
		try {
			FileHandler.copy(source, new File(destination));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		return destination;
	
	      }

	private static void FileHandler(File source, File file) {
		// TODO Auto-generated method stub
		
	}


	/*  public void failed(Throwable e, Description test,WebDriver driver){
	 
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String currentDir = System.getProperty("user.dir");
     String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
     try {
         FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + test.getMethodName() + timeStamp + ".png"));
     } catch (IOException e1) {
         e1.printStackTrace();
}*/
     

	  
}	











