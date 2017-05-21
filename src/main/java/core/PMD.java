package core;

import java.math.BigDecimal;

public class PMD {

	// Violations 01 - ForLoopShouldBeWhileLoop
	void bar() {
		for (; true;)
			; // No Init or Update part, may as well be: while (true)
	}

	// Violations 02 - UnconditionalIfStatement
	public void close() {
		if (true) { // fixed conditional, not recommended
			// ...
		}
	}

	// Violations 03 - BooleanInstantiation
	Boolean bar = new Boolean("true"); // unnecessary creation, just reference
							// Boolean.TRUE;
	Boolean buz = Boolean.valueOf(false); // ...., just reference Boolean.FALSE;

	// Violations 04 - CollapsibleIfStatements
	boolean x = false;
	boolean y = false;

	void bar01() {
		if (x) { // original implementation
			if (y) {
				// do stuff
			}
		}
	}

	// Violations 05 - MisplacedNullCheck
	String a = "";
	String baz = "";

	void bar02() {
		if (a.equals(baz) && a != null) {
		}
	}

	// Violations 06 - BrokenNullCheck
	public String bar(String string) {
		  // should be &&
			if (string!=null || !string.equals(""))
				return string;
		  // should be ||
			if (string==null && string.equals(""))
				return string;
			
			if (true) {		// fixed conditional, not recommended
				// ...
			}
			
	return null;	
	}
	
	// Violations 07 - AvoidMultipleUnaryOperators
	// These are typo bugs, or at best needlessly complex and confusing:
//	int i = - -1;
//	int j = + - +1;
//	int z = ~~2;
//	boolean b = !!true;
//	boolean c = !!!true;
//
//	// These are better:
//	int ii = 1;
//	int jj = -1;
//	int zz = 2;
//	boolean bb = true;
//	boolean cc = false;
//
//	// And these just make your brain hurt:
//	int iii = ~-2;
//	int jjj = -~7;
	
	
	// Violations 08 - AvoidBranchingStatementAsLastInLoop
	 public void test2() {
	        final boolean value = true ? false : false; // can be as simple as value = !condition && something();
//	   	 for (int r = 0; r < 10; r++) {
//				if (r*r <= 25) {
//					continue;
//				}
//				break;
//			}

			  // this makes more sense...
			for (int r = 0; r < 10; r++) {
				if (r*r > 25) {
					break;
				}
			}
	    }
	 
	 // Violations 10 - ReturnFromFinallyBlock
	 public String foo() {
		 System.out.println("Охренеть and Не хрена себе is anagram?");
			try {
				throw new Exception( "My Exception" );
			} catch (Exception e) {
				throw e;
			} finally {
				return "A. O. K."; // return not recommended here
			}
		}
	 
	// BigDecimal bd = new BigDecimal(1.123);		// loss of precision, this would trigger the rule
	 BigDecimal bd = new BigDecimal("1.123");   	// preferred approach
	// BigDecimal bd = new BigDecimal(12);     	// preferred approach, ok for integer values
	 
	 public class Foo extends Object { 	// not required
	 }
	
	// Violations 09 - ShortMethodName
		@SuppressWarnings("null")
		public static boolean A(String name) {

			boolean n = (Boolean) null;
			return n;
		}
		
		void method1(){
			int x=0;
			while (true)	// not recommended
			      x++;
		}
}
