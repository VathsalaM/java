import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest {
	MyMatrix m = new MyMatrix(2,3);

	@Test
	public void createMatrix(){
		int[] a = {2,3};
		assertTrue(Arrays.equals(m.Mylength(),a));
		assertEquals(m.Mylength("rows"),2);
		assertEquals(m.Mylength("coloumns"),3);
	}

	@Test
	public void populateWithInt(){
		int[][] a = {{0,0,0},{0,0,0}};
		int[][] b = {{5,5,5},{5,5,5}};
		for(int i=0;i<m.Mylength("rows");i++){
			assertTrue(Arrays.equals(m.matrix[i],a[i]));
		}
		m.MyFill(5);
		for(int i=0;i<m.Mylength("rows");i++){
			assertTrue(Arrays.equals(m.matrix[i],b[i]));
		}
	}
}