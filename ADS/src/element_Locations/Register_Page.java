package element_Locations;

import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Register_Page 
{
/*
	public Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	*/
	    //Text Boxes
	
		@FindBy(xpath="//input[@placeholder='First Name']")
		public static WebElement txt_FName;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		public static WebElement txt_LName;
		
		@FindBy(xpath="//textarea[@ng-model=\"Adress\"]")
		public static WebElement txt_Address;
		 
		@FindBy(xpath="//input[@type='email']")
		public static WebElement txt_Email;
		
		@FindBy(xpath="//input[@type='tel']")
		public static WebElement txt_Phone;
		
		
		//Radio Buttons
		
		@FindBy(xpath="//input[@value='Male']")
		public static WebElement rdo_Male;
		
		@FindBy(xpath="//input[@value='FeMale']")
		public static WebElement rdo_Female;
		
		//Check Boxes
		
		@FindBy(xpath="//div[@class='form-group'][6]//input")
		public static List<WebElement> chkBox;
		
		//Custom Drop Down
		@FindBy(id="msdd")
		public static WebElement Drp_Languages;
		
		@FindBy(xpath="//a[@class='ui-corner-all']")
		public static List<WebElement> options;

}
