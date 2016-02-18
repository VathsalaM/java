import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest {
	MyMatrix m = new MyMatrix(2,3);

	@Test
	public void createMatrix(){
		int[] a = {2,3};
		assertEquals(Arrays.toString(m.Mylength()),Arrays.toString(a));
		assertEquals(m.Mylength("rows"),2);
		assertEquals(m.Mylength("coloumns"),3);
	}
}