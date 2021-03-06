package paramTest.JunitParamterTest1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class OddNumberCheckerTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	private int number;
	private boolean expectedResult;
	OddNumber oddNumber;
	
	@Before
	public void initialize () {
		oddNumber = new OddNumber();
	}

	public OddNumberCheckerTest(Integer number, Boolean expectedResult) {
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
				{ 1, true },
				{ 4, false },
				{ 19, true },
				{ 22, false },
				{ 23, true }
		});
	}

	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is : " + number);
		assertEquals(expectedResult, oddNumber.isOddNumber(number));
	}
}
