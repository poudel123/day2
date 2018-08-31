package com.capgemini.day2;

public class IncomeTax {

	public static Object PercentageOfTax(int a) {
		// TODO Auto-generated method stub
		if(a>=0 && a<=180000)
		return(0);
		else if(a>=180001 && a<=300000)
			return(20000);
		else if(a>=300001 && a<=500000)
			return(80000);
		else if(a>=500001 && a<=1000000)
			return(180000);
		return a;
		
	}

}
