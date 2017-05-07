package core;

// Two strings are called anagrams if they contain same set of characters but in different order.

public class Anagram {

	public static boolean validate(String s, String t) {
		if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {return false;}
		
		int value = 0;
		for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
			value -= (t.replaceAll("\\s", "").toLowerCase().charAt(i));
		}
		return value == 0;
	}

}