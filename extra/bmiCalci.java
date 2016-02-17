class BmiCalci{

	private float weight_p = 0;
	private float height_p = 0;
	private float bmi_p = 0;

	private float square(float num){
		return num * num;
	};

	public void calculate(float weight, float height){
		weight_p = weight;
		height_p = height;
		bmi_p = weight/(square(height));
		print();
	};

	public void print(){
		System.out.println("weight :"+weight_p+"\t height :"+height_p+"\tBMI :"+bmi_p);
	}

	// public void ans(float b){
	// 	switch (b) {
	// 		case (b>19 && b<24) : print();		
	// 	}
	// }
}