package com.course.testng.paramter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTest {

	@Test(dataProvider="data")
	public void testProvider(String name,int age){
		System.out.println("name =" + name + " ;age =" + age);
	}
	
	@DataProvider(name="data")
	public Object[][] providerData(){
			Object[][] o = new Object[][]{
				{"zhangsan",1},
				{"nihao",2}
			};
		return o;
	}
	
	@Test(dataProvider="methodData")
	public void test1(String name,int age){
		System.out.println("test111的 name="+name+";age="+age);
	}
	@Test(dataProvider="methodData")
	public void test2(String name,int age){
		System.out.println("test222的 name="+name+";age="+age);
	}
	@DataProvider(name="methodData")
	public Object[][] providerMethod(Method method){
		Object[][] result = null;
		if (method.getName().equals("test1")){
				result = new Object[][]{
					{"lanxing",24},
					{"wangqi",28}
				};
		}
		else if(method.getName().equals("test2")){
				result = new Object[][]{
					{"xiguan",57},
					{"xiaoqing",45}
				};
		}
		return result;
	}
}
