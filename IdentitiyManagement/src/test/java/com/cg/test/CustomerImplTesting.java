package com.cg.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cg.ibs.bean.ApplicantBean.ApplicantStatus;
import com.cg.ibs.im.exception.IBSCustomException;
import com.cg.ibs.im.service.CustomerService;
import com.cg.ibs.im.service.CustomerServiceImpl;

class CustomerImplTesting {
	CustomerService customerService = new CustomerServiceImpl();


	@Test
	void verifyNamePositiveTest() {
		assertEquals(true, customerService.verifyName("Deep"));
	}

	@Test
	void verifyNameNegativeTest() {
		assertEquals(false, customerService.verifyName("12345@1!@#"));
		assertEquals(false, customerService.verifyName("Sandeep!!!@@*-"));
	}

//	@Test
//	void verifyDobTest() {
//		Object date = null;
//		//(message, expected, );
//		assertEquals(true, date, ("24/09/2015"));
//	}


	@Test
	void verifyMobileNumberPositiveTest() {
		assertEquals(true, customerService.verifyMobileNumber("9553528684"));
		assertEquals(true, customerService.verifyMobileNumber("8556869601"));
		assertEquals(true, customerService.verifyMobileNumber("7233528656"));
		assertEquals(true, customerService.verifyMobileNumber("6253500133"));

	}

	@Test
	void verifyMobileNumberNegativeTest() {
		assertEquals(false, customerService.verifyMobileNumber("Sahghshfaf12713@@##@$"));
		assertEquals(false, customerService.verifyMobileNumber("0123456789"));
		assertEquals(false, customerService.verifyMobileNumber("955352868"));
	}

	@Test
	void verifyPincodePositiveTest() {
		assertEquals(true, customerService.verifyPincode("123236"));
	}

	@Test
	void verifyPincodeNegativeTest() {
		assertEquals(false, customerService.verifyPincode("jdgkfgjk!@#!@#$@#$%$"));
		assertEquals(false, customerService.verifyPincode("1234567"));
		assertEquals(false, customerService.verifyPincode("023456"));

	}

	@Test
	void verifyAadharNumberPositiveTest() {
		assertEquals(true, customerService.verifyAadharNumber("564564564595"));
	}

	@Test
	void verifyAadharNumberNegativeTest() {
		assertEquals(false, customerService.verifyAadharNumber("fkjhkngJGUIUI!#$@$#$"));
		assertEquals(false, customerService.verifyAadharNumber("012345678945613"));
	}

	@Test
	void verifyPanNumberPositiveTest() {
		assertEquals(true, customerService.verifyPanNumber("ASEPY1234F"));
	}

	@Test
	void verifyPanNumberNegtiveTest() {
		assertEquals(false, customerService.verifyPanNumber("ASEPY1234f"));
		assertEquals(false, customerService.verifyPanNumber("ASEPY123F"));
		assertEquals(false, customerService.verifyPanNumber("ASEpy1234f"));
		assertEquals(false, customerService.verifyPanNumber("ASE1234f"));
		assertEquals(false, customerService.verifyPanNumber("AS#$@#$#"));
	}

	@Test
	void verifyEmailIdTest() {
		assertEquals(true, customerService.verifyEmailId("y@dsll"));
	}

	@Test
	void verifyEmailIdNegativeTest() {
		assertEquals(false, customerService.verifyEmailId("uyawuyyaw.com"));
	}

	@Test
	void verifyMobileNumbersPositiveTest() {
		assertEquals(true, customerService.verifyMobileNumbers("9553528684", "9948443778"));
	}

	@Test
	void verifyMobileNumbersNegativeTest() {
		assertEquals(false, customerService.verifyMobileNumbers("955352868", "1234568"));
	}

	@Test
	void verifyApplicantIdTest() {
		Assertions.assertThrows(IBSCustomException.class, () -> {
			customerService.verifyApplicantId(10050);
		});
	}

	// @Test
	// void verifyApplicantIdTest() throws IBSCustomException{
	// assertEquals(false, customerService.verifyApplicantId(12953));
	// }
	@Test
	void verifyCheckCustomerDetailsTest() {
		assertEquals(true, customerService.checkCustomerDetails("user/password", "user/password"));
	}

	 @Test
	 void firstLoginTest() throws IBSCustomException {
		 assertEquals(true, customerService.firstLogin("5555111151511001"));
		
	 }
	 
	 @Test
	 ApplicantStatus verifyCheckStatus() {
		return null;
		 
	 }
	@Test
	void verifyUpdateUserId() {
		
	}
	@Test
	void verifyUpdatePassword() {
		
	}
	

}
