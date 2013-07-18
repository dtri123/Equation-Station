package com.example.theequationstation;

public class Equations {
	
	public double convertToDouble(String txt){
		double number = 0;
		if( !(txt.equals(""))) number = Double.parseDouble(txt);
		return number;
	}
	
	public double add(double a, double b, double sum, boolean find_A, boolean find_B, boolean find_Sum ){
		if( find_Sum ) return a + b;
		else if( find_B ) return sum - a;
		else if( find_A ) return sum - b;
		else return 0;
	}
	
	public double subtract(double bigger, double lesser, double diff, boolean find_Bigger, boolean find_Lesser, boolean find_Diff){
		if( find_Diff ) return bigger - lesser;
		else if( find_Lesser ) return bigger - diff;
		else if( find_Bigger ) return diff + lesser;
		else return 0;
	}
	
	public double multiply(double a, double b, double product, boolean find_A, boolean find_B, boolean find_Product){
		if( find_Product ) return a*b;
		else if( find_B ) return product/a;
		else if( find_A ) return product/b;
		else return 0;
	}
	
	public double divide(double a, double b, double dividend, boolean find_A, boolean find_B, boolean find_Dividend){
		if( find_Dividend ) return a/b;
		else if( find_B ) return a/dividend;
		else if( find_A ) return b*dividend;
		else return 0;
	}
}
