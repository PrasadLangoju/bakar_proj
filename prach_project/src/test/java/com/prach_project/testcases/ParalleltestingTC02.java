package com.prach_project.testcases;

import org.testng.annotations.Test;

import com.prach_project.pageobject.Blousepage;
import com.prach_project.pageobject.Indexpage;
import com.prach_project.pageobject.Loginpage;
import com.prach_project.pageobject.Signinpage;
import com.prach_project.pageobject.Topspage;
import com.prach_project.pageobject.Womenpage;

public class ParalleltestingTC02 extends Baseclass {
	
	
	@Test
	public void verifyWomenTopIsSelecting() {
		
		
		
		try {
			
			
			Indexpage ip = new Indexpage(driver);
			ip.clickSignIn();
			Loginpage lp = new Loginpage(driver);
			lp.loginPageVerifyLaunch();
			lp.signInEmail("qwer@gmail.com");
			lp.signInPassword("rambo");
			lp.signInSubmit();
			Signinpage sp = new Signinpage(driver);
			sp.signInPageVerifyLaunch();
			Womenpage wp = new Womenpage(driver);
			wp.topsLink();
//			wp.womenPageVerifyLaunch();  // we should not verify this, because we are not clicking it ..... we just hovering in this test case
			
			Topspage tp = new Topspage(driver);
			tp.topsPageVerifyLaunch();
			tp.scrollTopsPage();
			tp.sortTheTops();
			tp.selectingBlouse();
			
			Blousepage bp = new Blousepage(driver);
			bp.blouseconfirmPageVerifyLaunch();
//			bp.blouseDressAvalibilityAndSelect();
			
			
			
//			Printeddresspage pd = new Printeddresspage(driver);
//			pd.printedDressesPageVerifyLaunch();
//			pd.printedDressAvalibilityAndSelect();
//			pd.addToCart();
//			Addtocart atc = new Addtocart(driver);
////			atc.addToCartPopUp();
//			atc.proccedToCheckOut();    // this is working fine
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			System.out.println("used try catch finally in this method");
		}
		
		
		
		
		
		
	}
	

}
