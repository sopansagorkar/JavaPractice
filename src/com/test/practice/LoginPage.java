package com.test.practice;

public class LoginPage extends BasePage {
    public LoginPage() {
        System.out.println("Login Page Created.");
    }
    public LoginPage(String pageLink) {
        setPageLink(pageLink);
    }
}
