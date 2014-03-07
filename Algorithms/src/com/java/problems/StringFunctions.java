package com.java.problems;

public class StringFunctions {
	
	public static String reverse ( String s ) {
        int length = s.length(), last = length - 1;
        char[] chars = s.toCharArray();
        for ( int i = 0; i < length/2; i++ ) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }
        return new String(chars);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Madam, I'm Adam";
		s= reverse(s);
		System.out.println(">>>"+s.toString());

	}

}
