package utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ReusableMethods {
    protected WebDriver driver;
    public static void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> stringListeCevir(List<WebElement> webElementList){

        List<String> stringList=new ArrayList<>();
        for (WebElement each:webElementList
             ) {
            stringList.add(each.getText());
        }
return stringList;
    }

    public static void titleIleWindowDegistir(String hedefTitle, WebDriver driver){

        Set<String> whdSeti = driver.getWindowHandles();

        for (String eachWhd : whdSeti
        ) {
            driver.switchTo().window(eachWhd);

            String oldugumuzSayfaTitle = driver.getTitle();

            if (oldugumuzSayfaTitle.equals(hedefTitle)){

                break;
            }
        }

    }

    public static void tumSayfaSreenshot(WebDriver driver)  {
        TakesScreenshot tss = (TakesScreenshot) driver;
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341


        File tumSayfaScreenshot = new File("target/tumSayfaScreenshot/tumSayfa"+timeStamp+".jpeg");
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaSreenshot(WebDriver driver,String resimAdi)  {
        TakesScreenshot tss = (TakesScreenshot) driver;
        File tumSayfaScreenshot = new File("target/tumSayfaScreenshot/"+resimAdi+".jpeg");
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webelementScreenshot(WebElement webElement){
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/webElement"+timeStamp+".jpg");
        File geciciScreenshot = webElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciScreenshot,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webelementScreenshot(WebElement webElement,String screenshotIsim){
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/"+screenshotIsim+timeStamp+".jpg");
        File geciciScreenshot = webElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciScreenshot,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }




}
