
public class Gogoogle {
	
	
	    public static void main(String[] args) 
	    {
	        WebDriver driver=new FirefoxDriver();
	        driver.navigate().to("http://www.google.com");
	        
	        driver.manage().window().maximize();
	        
	        WebElement oWE=driver.findElement(By.linkText("About Google"));
	        
	        Actions oAction=new Actions(driver);
	        oAction.moveToElement(oWE);
	        oAction.contextClick(oWE).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        
	    }

	}


