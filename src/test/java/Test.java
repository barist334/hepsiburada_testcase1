import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    private AndroidDriver driver;
    public WebDriverWait wait;


    //private final TouchAction continuePremium = action.tap(PointOption.point(933,1410)).perform();
    //private final TouchAction continuePremium_2 = action.tap(PointOption.point(918, 624)).perform();
    //private final By popUpAllow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    private final By location = By.id("com.pozitron.hepsiburada:id/locationView");
    private final By citySelector = By.xpath("//android.widget.ImageView[@content-desc='İl seçin']");
    private final By cityName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By townSelector = By.xpath("//android.widget.ImageView[@content-desc='İlçe seçin']");
    private final By townName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By districtSelector = By.xpath("//android.widget.ImageView[@content-desc='Mahalle seçin']");
    private final By districtName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
    private final By locationSaveButton = By.id("com.pozitron.hepsiburada:id/button");
    private final By categoriesSelect = By.id("com.pozitron.hepsiburada:id/nav_graph_category");
    private final By phoneCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.TextView");
    private final By iOSPhoneCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appium:deviceName", "sdk gphone64_x86_64");
        desiredCapabilities.setCapability("appium:app","C:\\Users\\baris\\Downloads\\Hepsiburada_ Online Alışveriş_5.4.0_apkcombo.com.apk");
        desiredCapabilities.setCapability("appium:language", "tr");
        desiredCapabilities.setCapability("appium:locale","tr");
        desiredCapabilities.setCapability("appium:noReset", false);
        desiredCapabilities.setCapability("appium:fullReset", true);
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);
        //desiredCapabilities.setCapability("appium:appPackage","com.pozitron.hepsiburada");
        //desiredCapabilities.setCapability("appium:appActivity",".com.hepsiburada.ui.startup.SplashActivity");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl,desiredCapabilities);
        wait = new WebDriverWait(driver,15);

    }

    @org.testng.annotations.Test
    public void sampleTest() throws InterruptedException {
        Thread.sleep(15000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(location)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locationSaveButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoriesSelect)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneCategory)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(iOSPhoneCategory)).click();
        Thread.sleep(10000);
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
