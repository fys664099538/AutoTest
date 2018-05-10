package com.fengys.chapter5.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
	@Test()
	public void test1(){
		System.out.printf("Thread Id  %s%n:",Thread.currentThread().getId());
	}
}
