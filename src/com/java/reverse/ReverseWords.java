package com.java.reverse;

import java.util.StringTokenizer;

public class  ReverseWords
{
	public static void stringtokinizer(String x){
	               
	                //specify delimiter as " " space
	                StringTokenizer st = new StringTokenizer(x, " ");
	               
	                String strReversedLine = "";
	               
	                while(st.hasMoreTokens())
	                {
	                        strReversedLine = st.nextToken() + " " + strReversedLine;
	                }
	               
	                System.out.println("Reversed string by word is : " + strReversedLine);
	        }
	 

}

