package test_Cases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonfunctions.Common;
import element_Locations.Register_Page;

public class TC001_RegisterPage extends Common
{
	String chkBoxOptions, chkBoxOptionSelected;
	@Test
	public void fillRegisterForm()
	{
//	Register_Page rp = new Register_Page(driver);
		PageFactory.initElements(driver, Register_Page.class);
	
	//Text Boxes
	Register_Page.txt_FName.sendKeys("Ajith");
	Register_Page.txt_LName.sendKeys("Kumar");
	Register_Page.txt_Address.sendKeys("No:12, Kamarajar Street, Adyar, chennai.");
	Register_Page.txt_Email.sendKeys("ajithkumar@gmail.com");
	Register_Page.txt_Phone.sendKeys("0123456789");
	
	//Radio Buttons
	Assert.assertTrue(!Register_Page.rdo_Male.isSelected(),"Male Radio Button is Aleaady selected");
	Register_Page.rdo_Male.click();
	Assert.assertTrue(Register_Page.rdo_Male.isSelected(), "Male is not Selected");
	
	Assert.assertTrue(!Register_Page.rdo_Female.isSelected(),"Female Radio Button is Aleaady selected");
	Register_Page.rdo_Female.click();
	Assert.assertTrue(Register_Page.rdo_Female.isSelected(), "Female is not Selected");
	
	// Check Boxes
	for (WebElement x:Register_Page.chkBox)
	{
	 chkBoxOptions = x.getAttribute("value");
	}
	
	//Selecting CheckBoxes
	for (WebElement x:Register_Page.chkBox)
	{
		if(!x.isSelected())
			x.click();
		chkBoxOptionSelected = x.getAttribute("value");
	}
	Assert.assertEquals(chkBoxOptions, chkBoxOptionSelected,"Check Box Options Not Matched");
	
	
	//For Deselecting CheckBoxes
	for (WebElement x:Register_Page.chkBox)
	{
		if(x.isSelected())
			x.click();
			
	Assert.assertTrue(!x.isSelected(),"Check Boxes not Deselecting");
	}
	
	
	//Custom Drop Down
	
	//Validating Language DropDown is Displayed
	Assert.assertTrue(Register_Page.Drp_Languages.isDisplayed(),"Language DropDownis not Displayed");
	
	//Validating Language DropDown is Enabled
	Assert.assertTrue(Register_Page.Drp_Languages.isEnabled(),"Language DropDownis not Displayed");
	
	//Validating Default Option
	Assert.assertEquals(Register_Page.Drp_Languages.getText(),"","Defualt Language Drop Down options doesnot match");
	
	//Validating Options Count
	Register_Page.Drp_Languages.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfAllElements(Register_Page.options));
	
	Assert.assertEquals(Register_Page.options.size(), 41,"Language OPtions Mismatch");
	
		
	//Validating options values
	List<String> expectedoptions =  Arrays.asList("Arabic", "Bulgarian", "Catalan", "Croatian", "Czech", "Danish", "Dutch", "English", "Estonian", "Filipino", "Finnish", "French", "German", "Greek", "Hebrew", "Hindi", "Hungarian", "Icelandic", "Indonesian", "Italian", "Japanese", "Korean", "Latvian", "Lithuanian", "Malay", "Norwegian", "Persian", "Polish", "Portuguese", "Romanian", "Russian", "Serbian", "Slovak", "Slovenian", "Spanish", "Swedish", "Thai", "Turkish", "Ukrainian", "Urdu", "Vietnamese");
 
	List<String> actualoptions = new ArrayList<>();
	for(WebElement x: Register_Page.options)
	{
		actualoptions.add(x.getText().trim());
		
	}
	Assert.assertEquals(actualoptions,expectedoptions, "Language DropDown OPtion Values are not Matching");
	
	
	
	//validating multiple selections in Drop Down Language
	/*Register_Page.options.get(0).click();  
	Register_Page.options.get(1).click();  
	Register_Page.options.get(5).click();
	Register_Page.options.get(10).click();
	Register_Page.options.get(15).click();
	Register_Page.options.get(25).click();
	
	List<String> selectedoptions = new ArrayList<>();
	for(WebElement x:Register_Page.)
	
	Assert.assertEquals(Register_Page.Drp_Languages.getSize(),5,"Multiple Selections not Matching");
	
	*/
	}	
	
}
