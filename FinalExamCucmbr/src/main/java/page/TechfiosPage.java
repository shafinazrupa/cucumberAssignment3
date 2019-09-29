package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosPage extends BasePage {
    WebDriver driver;
    public TechfiosPage(WebDriver driver) {
    	this.driver = driver;
    	}
 //Element Library
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
    WebElement SetSkyBlueBackgroundButton;
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
    WebElement SetWhiteBackgroundButton;
    @FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
    WebElement SkyBlueBackgroundColor;
    @FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
    WebElement WhiteBackgroundColor;
    
  //Method to interact with the Elements
  //Click on set SkyBlue Background Button
    public void clickSetSkyBlueBackgroundButton() {
    	SetSkyBlueBackgroundButton.click();
    }
 //Assertion for skyblue button is enabled
    public boolean isSetSkyBlueBackgroundButtonEnabled() {
    	return SetSkyBlueBackgroundButton.isEnabled();
    }
//Click on set White Background Button
    	 public void clickSetWhiteBackgroundButton() {
    		 SetWhiteBackgroundButton.click();
    		 }
 //Validating if the button is enabled
    	 public boolean isSetWhiteBackgroundButtonEnabled() {
    	    	return SetWhiteBackgroundButton.isEnabled();	 
    	 }
    	 //validate skyblue color
    	public String getSkyBluePageColor() {
    		return SkyBlueBackgroundColor.getAttribute("style");
    		
    	}
    	//validate white color
    	public String getWhitePageColor() {
    		return WhiteBackgroundColor.getAttribute("style");
    		
    	}
		public void closeAndQuit() {
			driver.close();
			driver.quit();
			
		}
		
		
			
		}
    

	//By userName = By.id("user_login");
	//WebElement username = driver.findElement(By.id("username"));
	//@FindBy(how = How.NAME, using = "log") WebElement Username;
	//@FindBy(how = How.NAME, using = "pwd") WebElement Password;
	//@FindBy(how = How.ID, using = "wp-submit") WebElement Login;
	
	//Methods to interact with the Elements
	//	//Username.sendKeys("opensourcecms");
		//Password.sendKeys("opensourcecms"); 
		//Login.click();
	

		
  
	

	
	

	
	
	
	
	

