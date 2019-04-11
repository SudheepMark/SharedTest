package com.fdmgroup.logging;

import org.apache.log4j.Logger;

public class Arithmetic {
	
	private final Logger logger = Logger.getLogger(Arithmetic.class);
			
	public double divide(int x, int y) {
		logger.trace("Starting devide method");
		
		logger.trace("initialising result variable");
		double result = 0;
		logger.debug("x = "+x+", y = "+y);
		try {
			logger.trace("entering try block");
			result = x / y;
			logger.info("result calculated sucessfully as "+result);
		} catch (ArithmeticException e) {
			logger.error(e.getMessage());
		}
		logger.trace("returning result");
		return result;
	}
}
