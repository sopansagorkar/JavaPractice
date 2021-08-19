package com.test.practice;

public class BasePage {
	  public String pageLink="";
	    public BasePage() {
	        System.out.println("Base Page Created.");
	        System.out.println(pageLink);
	    }
	    public void setPageLink(String pageLink) {
	        this.pageLink = pageLink;
	    }

}
