package smoke;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by yana on 21.04.15.
 */
public class tests {

    public WebDriver drv;

    @Test
    public void Case1(){
        String expRes = "MF5H1jbINbhVt@1a";
        Assert.assertEquals("Fail", expRes, expRes);
    }

    @Before
    public void start()
    {   System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        drv = new ChromeDriver();
        //drv.manage().window().maximize();
        //drv.get("http://angel.net/~nic/passwd.current.html");
        //drv.get("http://oxogamestudio.com/passwd.current2.htm");
        //drv.get("http://oxogamestudio.com/passwd.current3.htm");
        drv.get("http://newshubtest.org");

    }

    @After
    public void clean()
    {drv.quit();
    }

}
