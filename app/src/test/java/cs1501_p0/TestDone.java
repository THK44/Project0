package cs1501_p0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDone {

	@Test
	public void testDoneMessage() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		// action
		Done.main(null);

		// assertion
		assertEquals("DONE", bos.toString().trim(), "Does not output DONE");

		// undo the binding in System
		System.setOut(originalOut);
	}
}
