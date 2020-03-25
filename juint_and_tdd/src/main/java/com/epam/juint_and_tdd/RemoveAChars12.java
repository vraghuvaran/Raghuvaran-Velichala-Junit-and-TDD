package com.epam.juint_and_tdd;

public class RemoveAChars12 {

	public  String removeA(String string) {
		
		int length=string.length();
		
		if(length==0)
			return string;
		
		if(length < 2) {
			if(string.charAt(0)=='A')
				string=string.substring(1);
		}
		else {
			if(string.charAt(0)=='A') {
				string=string.substring(1);
				if(string.charAt(0)=='A')
					string=string.substring(1);
			}
			else {
				if(string.charAt(1)=='A')
					string=string.charAt(0)+string.substring(2);
			}
		}
		return string;
	}

	
}
