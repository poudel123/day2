package com.capgemini.day2;

public class SiCi {

	public static double[] siciOfAValue(int p, int t, double r) {
		double arr[]=new double[2];
		// TODO Auto-generated method stub
		double sim;
		double com;
		sim = (p* t * r)/100;
		com = p*Math.pow((1.0+r)/100, t)-p;
		arr[0]=sim;
		arr[1]=com;
		return arr;
	

	}
}
	