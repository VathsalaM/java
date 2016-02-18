import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayTesting{
	MyArray a = new MyArray(3);
	@Test
	public void evaluateArray(){
		assertEquals(a.length(),3);
	}
	@Test
	public void checkElements(){
		assertEquals(a.array[0],0);
		a.fill(23);
		assertEquals(a.array[0],23);
	}
}