package com.qa.pages;

public class SearchJobPage {
	
	public final static String frame = "//iframe[contains(@id,'elmo')] -- XPATH";
	public final static String SEARCH_FIELD = "//input[@placeholder='Search'] -- XPATH";
	public final static String JOB_TYPE_DROPDOWN = "//button[@title='Select Job Type'] -- XPATH";
	public final static String PERMANENT_JOB_TYPE = "//label[@class='checkbox']/span[contains(text(),'Permanent')] -- XPATH";
	public final static String SEARCH_BUTTON = "//button[@title='Search'] -- XPATH";
	public final static String BACK_END = "//a[text()[normalize-space()='Back End Software Engineer']]/parent::p/parent::div/parent::div/parent::li -- XPATH";
	public final static String FULL_STACK = "//a[text()[normalize-space()='Full Stack Software Engineer']]/parent::p/parent::div/parent::div/parent::li -- XPATH";
}
