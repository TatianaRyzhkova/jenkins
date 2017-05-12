package core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class NewTest2 {
	
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
	
	@SuppressWarnings("null")
	public static boolean A(String name) {
		boolean n = (Boolean) null;
		return n;
	}
	
	@Test
	public void test() {
		assertThat((2 + 2), equalTo(4));
	}

}
