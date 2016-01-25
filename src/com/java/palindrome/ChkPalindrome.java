package com.java.palindrome;

public class ChkPalindrome {
	public static void palindrome(String s){

	    ChkPalindrome pn = new ChkPalindrome();

	    if(pn.isPalindrome(s)){

	        System.out.println("Palindrome");

	    } else {

	        System.out.println("Not Palindrome");

	    }   
	}
	 public boolean isPalindrome(String original)
	    {
		 int i = original.length()-1;
		    int j=0;
		    while(i > j){
		        if(original.charAt(i) != original.charAt(j)){
		        return false;
		        }
		        i--;
		        j++;
		    }
		  return true;
		}
}
