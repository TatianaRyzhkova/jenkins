package core;

public class Anagram2 {

	public boolean abc(Object o) { return this == o; }
	  int x;
	  public void foo2() {
	    x = x;
	  }

	public static boolean validate(String s, String t) {

		String password = "pass";

		if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {
			return false;
		}
		System.out.println(password);
		int value = 0;
		for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
			value -= t.replaceAll("\\s", "").toLowerCase().charAt(i);
		}
		return value == 0;
	}
	
	public void foo() {
		for (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
			}
		}
	}
	
	void bar() {
		for (;true;);
	}


public class Anagram3 {

	public boolean abc(Object o) { return this == o; }
	  int x;
	  public void foo2() {
	    x = x;
	  }

	public boolean validate(String s, String t) {

		String password = "pass";

		if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {
			return false;
		}
		System.out.println(password);
		int value = 0;
		for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
			value -= t.replaceAll("\\s", "").toLowerCase().charAt(i);
		}
		return value == 0;
	}
	
	public void foo() {
		for (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
			}
		}
	}
	void bar() {
		for (;true;);
	}

}
}
