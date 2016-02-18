
import java.util.Arrays;

public class MyMatrix {
	int[][] matrix;
	public MyMatrix(int rows,int columns){
		this.matrix = new int[rows][columns];
	}

	public int[] Mylength(){
		int[] result = new int[2];
		result[0] = this.matrix.length;
		result[1] = this.matrix[0].length;
		return result;
	}

	public int Mylength(String opt){
		int result =0;
		switch (opt) {
			case "rows" : result = this.matrix.length;
				break;
			case "coloumns" : result = this.matrix[0].length;
				break;
		}
		return result;
	}
}