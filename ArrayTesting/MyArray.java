// package ArrayTesting;
import java.util.Arrays; 

public class MyArray {
	int[] array;
	public MyArray(int size){
		this.array = new int[size];
	}

	public int length(){
		return this.array.length;
	}

	public MyArray fill(int value){
		Arrays.fill(this.array,value);
		return this;
	}
}