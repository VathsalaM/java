import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.Before;
import java.util.Arrays;

public class MatrixTest {
	MyMatrix m ;

	@Before
	public void befor_execution(){
		this.m = new MyMatrix(2,3);
	}
	@Test
	public void create_matrix(){
		int[] a = {2,3};
		assertTrue(Arrays.equals(m.Mylength(),a));
		assertEquals(m.Mylength("rows"),2);
		assertEquals(m.Mylength("coloumns"),3);
	}

	@Test
	public void populate_with_int(){
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

	@Test
	public void populate_with_different_int(){
		int[][] a = {{0,0,0},{0,0,0}};
		int[][] b = {{0,5,2},{1,7,3}};
		for(int i=0;i<m.Mylength("rows");i++){
			assertTrue(Arrays.equals(m.matrix[i],a[i]));
		}
		m.MyFill(5,0,1);
		m.MyFill(2,0,2);
		m.MyFill(1,1,0);
		m.MyFill(7,1,1);
		m.MyFill(3,1,2);
		for(int i=0;i<m.Mylength("rows");i++){
			assertTrue(Arrays.equals(m.matrix[i],b[i]));
		}
	}
}