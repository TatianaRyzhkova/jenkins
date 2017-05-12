package core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class NewTest2 {

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
