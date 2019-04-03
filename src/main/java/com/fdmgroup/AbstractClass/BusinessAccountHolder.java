package com.fdmgroup.AbstractClass;

public class BusinessAccountHolder extends AccountHolder {
	private String businessType;
	private long vatNumber;

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public long getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(long vatNumber) {
		this.vatNumber = vatNumber;
	}

}
