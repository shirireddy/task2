		/**
 * 
 * @author Shiri Reddy
 *
 */
class CostEstimatorTest {

	@Test
	public void TestCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator('A', 400, false);
		assertEquals(48000.00, ce.findCost());
		ce = new CostEstimator('B', 489.123, false);
		assertEquals(7336840.50, ce.findCost());
		ce = new CostEstimator('C', 750, false);
		assertEquals(1350000.00, ce.findCost());
		ce = new CostEstimator('C', 600, true);
		assertEquals(1500000.00, ce.findCost());
		
	}

}
