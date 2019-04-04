package com.fdmgroup.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class TestArithmetic {

	@Mock
	Arithmetic mockArithmetic;
	
	@Before
	public void setUp() throws Exception {
		
		// creates mock objects for every mock reference above
		MockitoAnnotations.initMocks(this); 
		when(mockArithmetic.multiplyByTwo(2)).thenReturn(4);
		when(mockArithmetic.multiplyByTwo(3)).thenReturn(6);
		when(mockArithmetic.multiplyByTwo(4)).thenReturn(8);
		when(mockArithmetic.getX()).thenReturn(2.5);
		when(mockArithmetic.getY()).thenReturn("abc");
		
	}

	@Test
	public void test() {
		System.out.println(mockArithmetic.multiplyByTwo(2));
		System.out.println(mockArithmetic.multiplyByTwo(3));
		System.out.println(mockArithmetic.multiplyByTwo(4));
		System.out.println(mockArithmetic.getX());
		System.out.println(mockArithmetic.getY());
		//System.out.println(mockArithmetic.multiplyByTwo(4));
		
		fail("Not yet implemented");
	}

}
