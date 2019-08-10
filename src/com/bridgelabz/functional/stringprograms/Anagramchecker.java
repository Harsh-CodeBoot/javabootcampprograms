package com.bridgelabz.functional.stringprograms;

import com.bridgelabz.utility.Utility;

public class Anagramchecker {

	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		Utility utility   =  new Utility();
		
		utility.anagramchecker( str1,str2);
		
        System.out.println("Both string are anagram "+utility.anagramchecker(str1, str2));

	}

}
