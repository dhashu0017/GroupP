package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionsPage;
import com.ds.testBase.TestBase;

public class TransactionsTest extends TestBase {
	
	@Test
	public void getTransDetails() throws InterruptedException
	{
		dash.clickOnTransactionsLink();
		Thread.sleep(4000);
		trans.getTransactionsDetails();
	}

}
