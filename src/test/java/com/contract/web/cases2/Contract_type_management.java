package com.contract.web.cases2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.contract.web.cases.Base4;
import com.contract.web.util.AssertionUtil;

public class Contract_type_management extends Base4{
	private Logger logger = Logger.getLogger(Contract_type_management.class);
	@Test
	public void test1(){
		
		click(getElement("主页", "企业服务"));
		click(getElement("主页", "合同类型管理"));
		click(getElement("合同类型管理页", "添加合同类型模板"));
		String actualhetong = getElement(By.xpath("//span[text()='添加合同类型']")).getText();
		logger.info("-------------断言是否进入合同类型页面----------------");
		AssertionUtil.assertTextEquals(actualhetong, "添加合同类型");
		click(getElement("主页", "企业签章"));
	}
}
