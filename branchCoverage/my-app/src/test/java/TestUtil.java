import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

@Test
  public void example2() {
//if lenght==1 
	int[] intArray = new int[1];
	assertFalse(c.compute(intArray));
}

@Test
  public void example3() {
//if lenght%2==0
 	int[] intArray = new int[]{ 1,2}; 
	assertFalse(c.compute(intArray));
}

}