package calc;
public class Calc{
	double result;
	public Calc(){
		this.result = 0;
	};
	public Calc add(double number){
		this.result+=number;
		return this;
	};
	public Calc minus(double number){
		this.result-=number;
		return this;
	};
	public Calc mul(double number){
		this.result*=number;
		return this;
	};
	public Calc divide(double number){
		this.result/=number;
		return this;
	};
	public double isEqualsTo(){
		return this.result;
	};
}