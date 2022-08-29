package com.metlife.oops;

interface WebDriverDemo {
    public abstract void get(String url);

    String getTitle();

    void quit();
}
interface TakeScreenshot
{
    void getScreenshot();
}

interface JavascriptExecutor
{
    void executeScrip();
    void getScript();
}
class ChromeDriverDemo implements WebDriverDemo,TakeScreenshot,JavascriptExecutor {
    public ChromeDriverDemo() {
        System.out.println("chrome launch");
    }

    @Override
    public void get(String url) {
        System.out.println("chrome url");
    }

    @Override
    public String getTitle() {
        System.out.println("chrome title");
        return null;
    }

    @Override
    public void quit() {
        System.out.println("chrome quit");
    }

    @Override
    public void getScreenshot() {
        System.out.println("chrome screenshot");
    }

    @Override
    public void executeScrip() {

    }

    @Override
    public void getScript() {

    }
}

class EdgeDriverDemo implements WebDriverDemo,TakeScreenshot,JavascriptExecutor {
    public EdgeDriverDemo() {
        System.out.println("Edge launch");
    }
    @Override
    public void get(String url) {
        System.out.println("edge url");
    }

    @Override
    public String getTitle() {
        System.out.println("edge title");
        return null;
    }

    @Override
    public void quit() {
        System.out.println("edge quit");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Edge screenshot");
    }

    @Override
    public void executeScrip() {

    }

    @Override
    public void getScript() {

    }
}
class XDemo
{

}
public class BrowserTest {

    public static void main(String[] args) {
//        WebDriverDemo driver;
//        String browser="edge";

//        if(browser.equalsIgnoreCase("ch"))
//        {
//            driver = new ChromeDriverDemo();
//        }
//        else {
//            driver = new EdgeDriverDemo();
//        }

        WebDriverDemo driver=new ChromeDriverDemo();
        driver.get("http://google.com");
        driver.getTitle();
        driver.quit();


//        EdgeDriverDemo e= (EdgeDriverDemo) driver;
//        e.getScreenshot();
//        e.executeScrip();

        TakeScreenshot ts= (TakeScreenshot) driver;
        ts.getScreenshot();


        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScrip();
        js.getScript();

//        XDemo d= (XDemo) driver;

    }
}
