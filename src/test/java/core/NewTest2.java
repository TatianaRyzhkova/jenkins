package core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void test() {
		assertThat((2 + 2), equalTo(4));
	}

}
