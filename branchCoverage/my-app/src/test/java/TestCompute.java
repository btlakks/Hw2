import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

@Test
  public void example2() {
	//if mq's size is 0
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    int a = c.countNumberOfOccurrences("aa");
    assertEquals(-1,a);
  }

@Test
  public void example3() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.contains("aaa")).thenReturn(false);
    int a = c.countNumberOfOccurrences("aaa");
    assertEquals(0,a);
  }

 @Test
  public void example4() {
    //if mw does contain aaa in once, must return 1
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(3);
    when(mq.contains("aaa")).thenReturn(true);
    when(mq.contains("bbb")).thenReturn(true);
    when(mq.contains("ccc")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("aaa");
    when(mq.getAt(1)).thenReturn("bbb");
    when(mq.getAt(2)).thenReturn("ccc");
    int a = c.countNumberOfOccurrences("aaa");
    assertEquals(1,a);
  }


}