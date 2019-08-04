package GangOfFour.myexample.behavioral.interpreterpattern_1;


import java.util.Stack;

public class InterpreterPattern {
	public static void main(String args[]) {
		String tokenString = "4 3 2 - 1 + *";
		Stack stack = new Stack();

		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList) {
			if (isOperator(s)) {
				IExpression rightExpression = (IExpression) stack.pop();
				IExpression leftExpression = (IExpression) stack.pop();
				IExpression operator = getOperatorInstance(s, leftExpression,
						rightExpression);
				int result = operator.interpret();
				stack.push(new NumberExpression(result));
			} else {
				IExpression i = new NumberExpression(s);
				stack.push(i);
			}
		}
		System.out.println("Result: "+((IExpression) stack.pop()).interpret());
	}

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}

	public static IExpression getOperatorInstance(String s, IExpression left,
			IExpression right) {
		switch (s) {
		case "+":
			return new PlusExpression(left, right);
		case "-":
			return new MinusExpression(left, right);
		case "*":
			return new MultiplyExpression(left, right);
		}
		return null;
	}
}
