package com.example.theequationstation;


public class Equations {
	
	public double convertToDouble(String txt){
		double number = 0;
		if( !(txt.equals(""))) number = Double.parseDouble(txt);
		return number;
	}
	
	public double add(double a, double b, double sum){
		if( a != 0 && b != 0 ) return a+b;
		else if( a != 0 && sum != 0 ) return sum-a;
		else if( b != 0 && sum != 0 ) return sum-b;
		else return 0;
	}
	
	public double subtract(double bigger, double lesser, double diff){
		if( bigger != 0 && lesser != 0 ) return bigger-lesser;
		else if( bigger != 0 && diff != 0 ) return bigger-diff;
		else if( lesser != 0 && diff != 0 ) return diff+lesser;
		else return 0;
	}
	
	public double multiply(double a, double b, double product){
		if( a != 0 && b != 0 ) return a*b;
		else if( a != 0 && product != 0 ) return product/a;
		else if( b != 0 && product != 0 ) return product/b;
		else return 0;
	}
	
	public double divide(double a, double b, double dividend){
		if( a != 0 && b != 0 ) return a/b;
		else if( a != 0 && dividend != 0 ) return a*dividend;
		else if( b != 0 && dividend != 0 ) return b*dividend;
		else return 0;
	}
}
