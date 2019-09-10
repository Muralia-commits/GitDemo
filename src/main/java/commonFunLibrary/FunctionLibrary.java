package commonFunLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import constants.PBConstant;

public class FunctionLibrary extends PBConstant {
/*Project Name:Primus Bank
 * Module Name:Admin LOgin
 * Author:Balu
 * Created Date:
 */
public static boolean verifyLogin(String username,String password)
{
driver.findElement(By.xpath(p.getProperty("objusername"))).sendKeys(username);		
driver.findElement(By.xpath(p.getProperty("objpassword"))).sendKeys(password);
driver.findElement(By.xpath(p.getProperty("objloginbtn"))).click();
String Actval="adminflow";
String Expval=driver.getCurrentUrl();
if(Expval.toLowerCase().contains(Actval.toLowerCase()))
{
Reporter.log("Login Success",true);
return true;
}
else{
Reporter.log("Login Fail",true);
return false;
}
}
/*Project Name:Primus Bank
 * Module Name:Admin LOgin
 * Author:Balu
 * Created Date:
 */
public static boolean branchCreation(String bname,String address1,
String address2,String zcode,int country,int state,int city)
 throws Throwable{
driver.findElement(By.xpath(p.getProperty("objnewbranch"))).click();
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("objbname"))).sendKeys(bname);
driver.findElement(By.xpath(p.getProperty("objadd1"))).sendKeys(address1);
driver.findElement(By.xpath(p.getProperty("objadd2"))).sendKeys(address2);
driver.findElement(By.xpath(p.getProperty("objzcode"))).sendKeys(zcode);
new Select(driver.findElement(By.xpath(p.getProperty("objcountry")))).selectByIndex(country);
Thread.sleep(2000);
new Select(driver.findElement(By.xpath(p.getProperty("objstate")))).selectByIndex(state);
Thread.sleep(2000);
new Select(driver.findElement(By.xpath(p.getProperty("objcity")))).selectByIndex(city);
Thread.sleep(2000);
driver.findElement(By.xpath(p.getProperty("objsubmit"))).click();
//get alert text
String alertmessage=driver.switchTo().alert().getText();
Thread.sleep(5000);
driver.switchTo().alert().accept();
if(alertmessage.toLowerCase().contains("new branch"))
{
Reporter.log(alertmessage,true);
return true;
}
else{
Reporter.log("Branch Not Created",true);
return false;
}
}
/*Project Name:Primus Bank
 * Module Name:Admin LOgin
 * Author:Balu
 * Created Date:
 */
public static boolean branchUpdation(String bname,String address1)
 throws Throwable{
driver.findElement(By.xpath(p.getProperty("Obj_Click_Edit"))).click();
Thread.sleep(3000);
driver.findElement(By.xpath(p.getProperty("Obj_Update_Bname"))).clear();
driver.findElement(By.xpath(p.getProperty("Obj_Update_Bname"))).sendKeys(bname);
driver.findElement(By.xpath(p.getProperty("Obj_Update_Add1"))).clear();
driver.findElement(By.xpath(p.getProperty("Obj_Update_Add1"))).sendKeys(address1);
driver.findElement(By.xpath(p.getProperty("Obj_Click_Update"))).click();
//get alert text
String alertmessage=driver.switchTo().alert().getText();
Thread.sleep(5000);
driver.switchTo().alert().accept();
if(alertmessage.toLowerCase().contains("branch updated"))
{
Reporter.log(alertmessage,true);
return true;
}
else{
Reporter.log("Branch Not Updated",true);
return false;
}
}
/*Project Name:Primus Bank
 * Module Name:Admin Logout
 * Author:Balu
 * Created Date:
 */
public static boolean verifyLogout()throws Throwable
{
driver.findElement(By.xpath(p.getProperty("objlogout"))).click();
Thread.sleep(3000);
if(driver.findElement(By.xpath(p.getProperty("objloginbtn"))).isDisplayed())
{
	Reporter.log("Logout Success",true);
	return true;
}
else{
	Reporter.log("Logout Fail",true);
	return false;
}
}
/*Project Name:Primus Bank
 * Module Name:Navigate logout
 * Author:Balu
 * Created Date:
 */
public static void navigatebranches()
{
driver.findElement(By.xpath(p.getProperty("objBranches"))).click();
}
}














