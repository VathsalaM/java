class one{
	public static void main(String[] args){
		float a = Float.parseFloat(args[0]) ;
		float b = Float.parseFloat(args[1]);
		// String operation = args[2];
		// Hello n = new Hello();
		// n.operate(a,b,operation);
		BmiCalci c = new BmiCalci();
		c.calculate(a,b);
	};

};