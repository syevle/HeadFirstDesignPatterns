package GangOfFour.myexample.behavioral.interpreterpattern_1;

public class NumberExpression implements IExpression {
	int number;

	public NumberExpression(int i) {
		number = i;
	}

	public NumberExpression(String s) {
		number = Integer.parseInt(s);
	}

	@Override
	public int interpret() {
		return number;
	}

}
