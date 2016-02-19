import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest {

	public void put(Matrix newMatrix,int[][] values){
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[0].length;j++)
				newMatrix.fill(values[i][j],i,j);
		}
	}

	@Test
	public void populate_with_int(){
		Matrix matrix = new Matrix(2,3);
		int[][] values_a = {{5,5,5},{5,5,5}};
		Matrix expectedMatrix = new Matrix(2,3);
		put(expectedMatrix,values_a);
		matrix.fill(5);
		assertTrue(matrix.isSameAs(expectedMatrix));
	}

	@Test
	public void populate_with_different_int(){
		Matrix matrix = new Matrix(2,3);
		int[][] values_a = {{0,5,2},{1,7,3}};
		Matrix expectedMatrix = new Matrix(2,3);
		put(expectedMatrix,values_a);
		matrix.fill(5,0,1);
		matrix.fill(2,0,2);
		matrix.fill(1,1,0);
		matrix.fill(7,1,1);
		matrix.fill(3,1,2);
		assertTrue(matrix.isSameAs(expectedMatrix));
	}

	@Test
	public void add_two_matrices(){
		Matrix matrix = new Matrix(2,3);
		int[][] values_a = {{0,5,2},{1,7,3}};
		int[][] values_b = {{1,1,1},{1,1,1}};
		int[][] values_c = {{1,6,3},{2,8,4}};
		Matrix matrixOne = new Matrix(2,3);
		Matrix matrixTwo = new Matrix(2,3);
		Matrix expectedMatrix = new Matrix(2,3);
		put(matrixOne,values_a);
		put(matrixTwo,values_b);
		put(expectedMatrix,values_c);
		Matrix actualMatrix = matrix.add(matrixOne).add(matrixTwo);
		assertTrue(actualMatrix.isSameAs(expectedMatrix));
	}

	@Test
	public void multiply_two_matrices(){
		int[][] values_a = {{0,5},{1,7}};
		int[][] values_b = {{1,3},{2,4}};
		int[][] values_c = {{10,20},{15,31}};
		Matrix matrixOne = new Matrix(2,2);
		Matrix matrixTwo = new Matrix(2,2);
		Matrix expectedMatrix = new Matrix(2,2);
		put(matrixOne,values_a);
		put(matrixTwo,values_b);
		put(expectedMatrix,values_c);
		Matrix actualMatrix = matrixOne.multiply(matrixTwo);
		assertTrue(actualMatrix.isSameAs(expectedMatrix));
	}

	@Test
	public void determinant_of_matrix(){
		int[][] values_a = {{0,5},{1,7}};
		Matrix matrixOne = new Matrix(2,2);
		put(matrixOne,values_a);
		int determinant = matrixOne.determinant();
		assertEquals(determinant,2);
	}
}