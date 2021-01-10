package com.hrms.testcases;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEmployeeTest extends CommonMethods {

    @Test (groups = "smoke")
    public void addEmployee() {
        //login to the hrms
        LoginPage login = new LoginPage();
        login.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
        // navigate to add employee page
        DashboardPage dashboardPage = new DashboardPage();
        jsClick(dashboardPage.PIMBtn);
        jsClick(dashboardPage.addEmployeeBtn);
        // add employee
        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        sendText(addEmployeePage.firstName, "Katerina");
        sendText(addEmployeePage.lastName, "Smith");
        String employeeIDnumber = addEmployeePage.employeeID.getText();
        click(addEmployeePage.saveBtn);

        jsClick(dashboardPage.employeeList);
        EmployeeListPage empList = new EmployeeListPage(driver);
        empList.idEmployee.sendKeys(employeeIDnumber);
        empList.searchBtn.click();









    }

}
