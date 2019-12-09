package com.capgemini.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConceptsA {
	public static void main(String[] args) {		
		
		Pattern pat = Pattern.compile("\\d");      //pattern for single digit
													//represents any number between (0-9)
		Matcher mat = pat.matcher("1");
		System.out.println("For pattern \\d: "+mat.matches());
		
		pat = Pattern.compile("\\d+");      //pattern for multi digit //represents any number
		mat = pat.matcher("13247658");
		System.out.println("For pattern \\d+: "+mat.matches());
		
		pat = Pattern.compile("\\d{10}");      //pattern for only 10 digit 
		mat = pat.matcher("1234567890");
		System.out.println("For pattern \\d{10}: "+mat.matches());
		
		pat = Pattern.compile("\\d{1,10}");      //pattern for only 10 digit 
		mat = pat.matcher("1234567890");
		System.out.println("For pattern \\d{1,10}: "+mat.matches());
		
		pat = Pattern.compile("\\d{0}");     
		mat = pat.matcher("");
		System.out.println("For pattern \\d{0}: "+mat.matches());
		
		
		pat = Pattern.compile("\\d{1,9}");       
		mat = pat.matcher("123456789");
		System.out.println("For pattern \\d{1,9}: "+mat.matches());
		
		pat = Pattern.compile("\\D");      //pattern for not having digits it can match anything but not digit
		mat = pat.matcher("@");            //eg. "A"," ","a","$"  //represents anything but numbers (Single char)
		System.out.println("For pattern \\D: "+mat.matches());
		
		pat = Pattern.compile("\\D+");     //represents anything but numbers  
		mat = pat.matcher("AAA");
		System.out.println("For pattern D+: "+mat.matches());
		
		pat = Pattern.compile("\\s");       //represent single space
		mat = pat.matcher(" ");
		System.out.println("For pattern \\s: "+mat.matches());
		
		pat = Pattern.compile("\\s+");       //represent multiple spaces
		mat = pat.matcher("  ");
		System.out.println("For pattern \\s+: "+mat.matches());
		
		pat = Pattern.compile("\\S");        //represent anything other than space(single char)
		mat = pat.matcher("k");
		System.out.println("For pattern \\S: "+mat.matches());
		
		pat = Pattern.compile("\\S+");        //represent anything but spaces " "
		mat = pat.matcher("kk");
		System.out.println("For pattern \\S+: "+mat.matches());
		
		pat = Pattern.compile("\\w");        //represent single char
		mat = pat.matcher("k");
		System.out.println("For pattern \\w: "+mat.matches());
		
		pat = Pattern.compile("\\w+");        //represent multiple char
		mat = pat.matcher("k");
		System.out.println("For pattern \\w+: "+mat.matches());
		
		pat = Pattern.compile("\\W");        //represent anything but char (Special char)
		mat = pat.matcher("$");
		System.out.println("For pattern \\W: "+mat.matches());
		
		pat = Pattern.compile("\\W+");        //represent anything but chars (Special chars)
		mat = pat.matcher("*&%");
		System.out.println("For pattern \\W+: "+mat.matches());
	}

}
