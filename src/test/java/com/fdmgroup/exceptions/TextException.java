package com.fdmgroup.exceptions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextException {
Account account;

	@Before
	public void setUp() throws Exception {
		account = new Account();
		
	}

	@Test(expected=AccountException.class)
	public void test_exceptionTrownWhenNegativeAmountIsEntered() throws AccountException {
		account.addFund(-100);
	}

}
