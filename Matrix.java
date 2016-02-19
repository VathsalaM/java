
import java.util.Arrays;

class Matrix {
	private int[][] matrix;
	private Boolean done = false;
	private int rows;
	private int columns;	

	public Matrix(int rows,int columns){
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int[rows][columns];
	}

	public void fill(int value){
		for (int i=0;i<this.rows;i++ ) {
			Arrays.fill(this.matrix[i],value);
		}
	}

	public void fill(int value,int row,int column){
		this.matrix[row][column] = value;
	}

	public Matrix add(Matrix otherMatrix){
		if(isDimensionSame(otherMatrix.rows,otherMatrix.columns)){
			Matrix result = new Matrix(rows,columns);
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					int sum = this.matrix[i][j] + otherMatrix.matrix[i][j];
					result.fill(sum,i,j);
				}
			}
			return result;
		}
		return new Matrix(0,0);
	}

	public Boolean isDimensionSame(int rows,int columns){
		return (this.rows==rows && this.columns==columns);
	}

	public Boolean isSameAs(Matrix otherMatrix){
		Boolean isEqual = false; 
		if(isDimensionSame(otherMatrix.rows,otherMatrix.columns)){
			for(int i=0;i<rows;i++)
				isEqual = Arrays.equals(otherMatrix.matrix[i],this.matrix[i]);
			return isEqual;
		}
		return isEqual;
	}


	public Matrix multiply(Matrix otherMatrix){
		if(isDimensionSame(otherMatrix.columns,otherMatrix.rows)){
			Matrix result = new Matrix(rows,columns);
			for(int i=0;i<rows;i++){
				for(int j=0;j<rows;j++){
					int sum = 0;
					for(int k=0;k<columns;k++){
						sum+=this.matrix[i][k]*otherMatrix.matrix[k][j];
					}
					result.fill(sum,i,j);
				}
			}
			return result;
		}
		return new Matrix(0,0);
	}

}