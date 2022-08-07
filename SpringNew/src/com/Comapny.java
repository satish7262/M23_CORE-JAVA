package com;

public class Comapny {
	Private int cmpId;
	private String cmpName;
	public Company(int cmpId, String cmpName) {
		super();
		this.cmpId = cmpId;
		this.cmpName = cmpName;
		
	}
	@Override
	public String toString() {
		return "Company [cmpId=" + cmpId + ", cmpName=" + cmpName + "]";
	}

}
