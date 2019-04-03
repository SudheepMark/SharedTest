package com.fdmgroup.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArithmetic {
	
	Arithmetic arithmetic; // class level reference 
	
	@Before //runs before each test and creates a new object for each test.
	public void setUp(){
		arithmetic = new Arithmetic (); //Arrange
	}

	@Test
	public void test_multiplyByTwoReturns10When5PassedIn(){
		
		int result = arithmetic.multiplyByTwo(5); //Act
		assertEquals(10,result); //Assert
	}
	
	@Test
	public void test_multiplyByTwoReturns26When13PassedIn(){
		
		int result = arithmetic.multiplyByTwo(13); //Act
		assertEquals(26,result); //Assert
	}
	
	@Test
	public void test_multiplyByTwoReturns16When8PassedIn(){
		
		int result = arithmetic.multiplyByTwo(8); //Act
		assertEquals(16,result); //Assert
	}
	
	@Test
	public void test_squareDoubleReturns4When2PassedIn(){
		
		double result = arithmetic.squareNumber(2); //Act
		assertEquals(4,result,0.000001); //Assert
	}
	
	@Test
	public void test_squareDoubleReturns121When11PassedIn(){
		
		double result = arithmetic.squareNumber(11); //Act
		assertEquals(121,result,0.000001); //Assert
	}
	
	@Test
	public void test_squareDoubleReturns100When10PassedIn(){
		
		double result = arithmetic.squareNumber(10); //Act
		assertEquals(100,result,0.000001); //Assert
	}
	
}
