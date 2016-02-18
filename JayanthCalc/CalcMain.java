import calc.*;

class CalcMain{
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		System.out.println(myCalc.add(5).mul(2).divide(5).add(20).minus(2).isEqualsTo());
		Calc vathsalaCalc = new Calc();
		System.out.println(vathsalaCalc.add(1).mul(2).divide(2).add(2).minus(1).isEqualsTo());
	}
}