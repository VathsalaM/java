class Hello{
	public void print(int a,int b,String operation,int result){
		System.out.println(" "+a+" "+operation+" "+b+" = "+result);
	}

	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a,int b){
		return a/b;
	}

	public void operate(int a,int b,String operation) {
		switch (operation) {
			case "add":print(a,b,"+",add(a,b));
				  break;
			case "sub":print(a,b,"-",sub(a,b));
						break;
			case "mul":print(a,b,"*",mul(a,b));
						break;
			case "div":print(a,b,"/",div(a,b));
						break;
		}
	}	

}