package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static utilities.SGridDrivers.remoteDriverChromeOptions;//static method olarak getirdik
import static utilities.SGridDrivers.remoteDriverFirefoxOptions;

public class SGridTest {

    //MacBook-Air ~ % java -jar selenium\ Grid/selenium-server-4.8.0.jar standalone    bunu yazsan yeter terminale
    //
    // komutu java  -jar ise flag denir sonrası jar dosya yolu=>selenium\ Grid/selenium-server-4.8.0.jar .

    //===========YApılAcaklar
    //  selenium\ Grid klasoru olustur içine  chromedriver*  geckodriver*  selenium-server-4.8.0.jar dosyalarını koy

    //1.  Air ~ % where java yaz    sonucu=/usr/bin/java
    //2. % ls -l /usr/bin/java
    //3.  /usr/bin/java -> /System/Library/Frameworks/JavaVM.framework/Versions/Current/Commands/java
    //  Air ~ % cd selenium\ Grid
    //4.Air selenium Grid % java -jar selenium-server-4.8.0.jar standalone
    // 5. Air selenium Grid % open /Library/Java/JavaVirtualMachines
    //Air selenium Grid % /Library/Java/JavaVirtualMachines/jdk-17.0.6.jdk/Contents/Home/bin/java -jar selenium-server-4.8.0.jar standalone

    //normalde     java -jar selenium-server-4.8.0.jar standalone      yazsan yeter

WebDriver dr=remoteDriverChromeOptions();
    @Test
    public void test01(){

        dr.get("https://www.amazon.com");//static method olarak getirdik

        System.out.println("Url = " + dr.getCurrentUrl());

        System.out.println("Title = " + dr.getTitle());//dr=>>> WebDriver dr=remoteDriverChromeOptions();

    }

    @Test
    public void test02(){

        remoteDriverFirefoxOptions().get("https://www.amazon.com");
    }
}
