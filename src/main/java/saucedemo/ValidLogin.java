package saucedemo;
import base.SetUp;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ValidLogin extends SetUp {

    @Test
    public void test1() {
        // Find the username and password
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter a valid username and password
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        loginButton.click();

        //Check if the login is successful
        String expectedHeader = "Products";
        String actualHeader =  driver.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }
}
