
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

	public Matrix(int rows,int columns,int[][] values){
		this.rows = rows;
		this.columns = columns;
		this.done = true;
		this.matrix = new int[rows][columns];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				this.matrix[i][j] = values[i][j];

	}

	public void fill(int value){
		if(!done)
			for (int i=0;i<this.rows;i++ ) {
				Arrays.fill(this.matrix[i],value);
			}
	}

	public void fill(int value,int row,int column){
		if(!done)
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
}