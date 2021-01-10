package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.apache.tools.ant.types.resources.First;
import org.apache.tools.ant.types.resources.Last;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeePage extends CommonMethods {

    @FindBy (id = "firstName")
    public WebElement firstName;

    @FindBy (id = "middleName")
    public WebElement middleName;

    @FindBy (id = "lastName")
    public WebElement lastName;

    @FindBy (id = "employeeId")
    public WebElement employeeID;

    @FindBy (id = "photofile")
    public WebElement photograph;

    @FindBy (id = "btnSave")
    public WebElement saveBtn;

    @FindBy (id = "chkLogin")
    public WebElement createLoginDetails;

    @FindBy (id = "user_name")
    public WebElement usernameCreate;

    @FindBy (id = "user_password")
    public WebElement userPassword;

    @FindBy (id = "re_password")
    public WebElement rePassword;

    @FindBy (id = "status")
    public WebElement status;

    public AddEmployeePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
