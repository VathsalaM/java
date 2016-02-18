import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest {
	@Test
	public void create_matrix_with_values(){
		int[][] values = {{1,2,3},{4,5,6}};
		Matrix matrix = new Matrix(2,3,values);
		int[][] values_a = {{1,2,3},{4,5,6}};
		Matrix expectedMatrix = new Matrix(2,3,values_a);
		assertTrue(matrix.isSameAs(expectedMatrix));
	}

	@Test
	public void populate_with_int(){
		Matrix matrix = new Matrix(2,3);
		int[][] values_a = {{5,5,5},{5,5,5}};
		Matrix expectedMatrix = new Matrix(2,3,values_a);
		matrix.fill(5);
		assertTrue(matrix.isSameAs(expectedMatrix));
	}

	@Test
	public void populate_with_different_int(){
		Matrix matrix = new Matrix(2,3);
		int[][] values_a = {{0,5,2},{1,7,3}};
		Matrix expectedMatrix = new Matrix(2,3,values_a);
		matrix.fill(5,0,1);
		matrix.fill(2,0,2);
		matrix.fill(1,1,0);
		matrix.fill(7,1,1);
		matrix.fill(3,1,2);
		assertTrue(matrix.isSameAs(expectedMatrix));
	}

	
}