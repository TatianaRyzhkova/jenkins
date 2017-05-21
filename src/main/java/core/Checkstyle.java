//package core;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//
//import javax.swing.BorderFactory;
//import javax.swing.border.Border;
//
//public class Checkstyle {
//
//	// Violations 01 - ArrayTrailingComma
//	int[] a = new int[] { 1, 2, 3, };
//
//	// Violations 02 - AvoidInlineConditionals
//	String b = getParameter("a");
//	//String c = (a == null || a.length < 1) ? null : b.substring(1);
//
//	private String getParameter(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	// Violations 03 - CovariantEquals
//	class Test {
//		public boolean equals(Test i) { // violation
//			return false;
//		}
//	}
//
//	// Violations 03 - DeclarationOrder
//	public class A {
//		private double x = 1.0;
//		private double y = 2.0;
//		public double slope = x / y; // will be skipped from validation due to
//										// forward reference
//	}
//
//	// Violations 04 - DefaultComesLast
//	void test3(int i) {
//		switch (i) {
//		case 1:
//			break;
//		case 2:
//		default: // No violation with the new option is expected
//			break;
//		case 3:
//			break;
//		}
//		switch (i) {
//		case 1:
//			break;
//		default: // violation with the new option is expected
//		case 2:
//			break;
//		}
//	}
//
//	void test_04() {
//		// Violations 04 - EqualsAvoidNull
//		String nullString = null;
//		nullString.equals("My_Sweet_String");
//	}
//
//	// Violations 05 - FallThrough
//	void test_05(int i) {
//		switch (i) {
//		case 0:
//			i++; // fall through
//
//		case 1:
//			i++;
//			// falls through
//		case 2:
//		case 3:
//		case 4: {
//			i++;
//		}
//		// fallthrough
//		case 5:
//			i++;
//		//	/* fallthru */case 6:
//			i++;
//			break;
//		}
//	}
//
//	// Violations 06 - FinalLocalVariable
//	void test_07(int[] myNumbers) {
//		for (int number : myNumbers) { // violation
//			System.out.println(number);
//		}
//	}
//
//	// Violations 07 - InnerAssignment
//	void test_08(BufferedReader bufferedReader) throws IOException {
//		String line;
//		while ((line = bufferedReader.readLine()) != null) {
//			// process the line
//		}
//	}
//
//	// Violations 08 - MagicNumber
//	static final int SECONDS_PER_DAY = 24 * 60 * 60;
//	static final double SPECIAL_RATIO = 4.0 / 3.0;
//	static final double SPECIAL_SUM = 1 + Math.E;
//	static final double SPECIAL_DIFFERENCE = 4 - Math.PI;
//	static final Border STANDARD_BORDER = BorderFactory.createEmptyBorder(3, 3, 3, 3);
//	static final Integer ANSWER_TO_THE_ULTIMATE_QUESTION_OF_LIFE = new Integer(42);
//	
//	// Violations 09 - ModifiedControlVariable
//	void test_09(){
//	for (int i = 0; i < 1; i++) {
//         i++; //violation
//       }
//	}
//	
//	// Violations 10 - OneStatementPerLine
//	void test_10(){
//		//Each line causes violation:
//		int var1; int var2;
//		var1 = 1; var2 = 2;
//		int var11 = 1; int var22 = 2;
//		var1++; var2++;
//	//	Object obj1 = new Object(); Object obj2 = new Object();
//		//import java.io.EOFException; import java.io.BufferedReader;
//		//;; //two empty statements on the same line.
//
//		//Multi-line statements:
//		int var = 1
//		; var2 = 2; //violation here
//		//int o = 1, p = 2, r = 5; int t; //violation here
//	}
//}