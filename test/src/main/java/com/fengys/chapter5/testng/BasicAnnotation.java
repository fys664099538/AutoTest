package com.fengys.chapter5.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
	
	@Test
	public void testCase1(){
		System.out.println("这是测试用例1");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod这是在测试方法前运行的");
	}
	
	@Test
	public void testCase2(){
		System.out.println("这是测试用例2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod这是在测试方法后运行的");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass这是在类运行前运行的");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass这是在类运行后运行的");
	}
	
}
