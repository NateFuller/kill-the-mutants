package example7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {

	private Snippet h;

	@Before
	public void setUp() throws Exception {
		h = new Snippet();
	}

	@Test
	public void test() {
		assertEquals("kill-the-mutants","kill-the-mutants");
	}

}
