package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindBug {

	// Violations 01 - Self assignment 
	int x = 0;
	public void test_01() {
		   x = x;
		  
	
	}
	
	// Violations 02 - Null pointer dereference
	String test_02(List<String> list){
//	if ((list == null) && (list.size() == 0)) {     
//
//		  return null;
//
//		}
	return "" ;
	}
	
	// Violations 03 - Dead store
	void method1(){
//		int x=0;
//		while (true)	// not recommended
//		      x++;
	}
	
	// Violations 04 - There is an apparent infinite loop
	public void foo() {
//		for (int i = 0; i < 10; i++) {			// only references 'i'
//			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
//				System.out.println("Hello");
//			}
//		}
		
		// Violations 05 - There is an apparent infinite loop
		Double newValue = null;
//		if ((newValue == Double.NaN) || (newValue < 0d)) {            
//
//			  // the code to execute
//
//			}
		
		String[] array = "abc,fds".split(",");
		System.out.println("Array "+array);
	
	}
	

public class Findbugs {

	// FinalParametersCheck
	@SuppressWarnings("null")
	public boolean A(String name) {
		boolean n = (Boolean) null;
		return n;
	}
	
	// getSecurePassword
	 String getSecurePassword() {
		
		return "my-sec" + "ret-password";
	}

	 void abc() {	
		int x = 2;
		int y = 5;
		double value1 =  x / y;

	}

}
	
}
