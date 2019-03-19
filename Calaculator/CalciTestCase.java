/*
* Test cases for Calcli
*/
class CalcliTestCase{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(25, c.Operation(13,12,"Addition"));
		assertEquals(10, c.Operation(12,2,"Subtraction"));
		assertEquals(16, c.Operation(8,2,"Multiplication"));
	}
}