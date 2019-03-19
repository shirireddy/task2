/**
 * 
 * @author Shiri Reddy
 *
 */
 
 public class SimpleCompoundInterestTestCase
 {
	 
	@Test
	public void TestCaseSimpleInterest() {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(50500, 3.8f, 2);
		assertEquals(3838, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(50500, 2.7f, 5);
		assertEquals(6817.5, simpleInterest.SimpleInterest());
	}
	@Test
	void TestCaseCompoundIntrest() {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(10000, 1.5f, 5);
		assertEquals(1077.28, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(25000, 2.5f, 5);
		assertEquals(2828.52, compoundInterest.CompoundInterest());
	}
 }