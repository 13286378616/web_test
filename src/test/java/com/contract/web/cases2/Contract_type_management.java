package com.contract.web.cases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.contract.web.cases.Base4;
import com.contract.web.util.AssertionUtil;

public class Contract_type_management extends Base4{
	@Test
	public void test1(){
		
		click(getElement("主页", "企业服务"));
		click(getElement("主页", "合同类型管理"));
		click(getElement("合同类型管理页", "添加合同类型模板"));
		
		
	}
}
