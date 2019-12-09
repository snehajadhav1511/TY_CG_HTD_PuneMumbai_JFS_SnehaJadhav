package com.capgemini.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {
	
	static Pattern pattern;
	static Matcher matcher;
	
	public static void main(String[] args) {
		pattern =Pattern.compile("\\d");    //for single digit pattern
		matcher = pattern.matcher("1");
		System.out.println("pattern \\d:"+matcher.matches());
		
		pattern =Pattern.compile("\\d+");   //for multiple digit pattern
		matcher = pattern.matcher("81234567");
		System.out.println("pattern \\d+:"+matcher.matches());

		pattern =Pattern.compile("\\D");   
		matcher = pattern.matcher("8");
		System.out.println("pattern \\D:"+matcher.matches());
		
		pattern =Pattern.compile("\\D+");   //for multiple digit pattern
		matcher = pattern.matcher("81234567");
		System.out.println("pattern \\D+:"+matcher.matches());
		
		pattern = Pattern.compile("\\w");
		matcher = pattern.matcher("S");
		System.out.println("pattern \\w:"+matcher.matches());
		
		pattern = Pattern.compile("\\w");    //it is for single digit if we gave more than 1 character it will give us false
		matcher = pattern.matcher("SS");
		System.out.println("pattern for single char\\w:"+matcher.matches());
		
		pattern = Pattern.compile("\\w");    //1 is consider as 1 character here
		matcher = pattern.matcher("1");
		System.out.println("pattern  \\w:"+matcher.matches());
		
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher("SNEHA");
		System.out.println("pattern for multiple char\\w:"+matcher.matches());
		
		pattern = Pattern.compile("\\W");
		matcher = pattern.matcher("S");
		System.out.println("pattern for \\W:"+matcher.matches());
		
		
		
	}
	

}
