import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * @author mtimoshkevich
 */



public class BMICalculatorTest {

    public static final String URL = "https://healthunify.com/bmicalculator/";
    public static final String WEIGHT = "65";
    @Test
    public void testObese1(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("33");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Obese");
    }

    @Test
    public void testObese2(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("147");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Obese");
    }

    @Test
    public void testOverweight1(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("148");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Overweight");
    }

    @Test
    public void testOverweight2(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("161");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Overweight");
    }

    @Test
    public void testNormal1(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("162");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Normal");
    }

    @Test
    public void testNormal2(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("187");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Normal");
    }
    @Test
    public void testUnderweight1(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("188");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Underweight");
    }
    @Test
    public void testUnderweight2(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("208");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Underweight");
    }

    @Test
    public void testStarvation1(){
        open(URL);
        $(By.name("wg")).sendKeys(WEIGHT);
        $(By.name("ht")).sendKeys("209");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result,"Your category is Starvation");
    }

}