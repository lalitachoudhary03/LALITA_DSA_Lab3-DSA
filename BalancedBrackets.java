package lAB_3_DSA_Que1;

import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[]args) {
		String bracketExpression ="[{((a+b)*(c+d)}--{(a=b)*(c+d)}]";
		boolean result;
		result = checkingBalancingbracket(bracketExpression);
		if (result)
			System.out.println("The entered strings has blanced bracket....");
		else
			System.out.println("The entered string has not contained balanced bracket...");
	
	}
	private static boolean checkingBalancingbracket(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		for (int  i = 0; i < bracketExpression.length(); i++) {
			char Character = bracketExpression.charAt(i);
			if(Character == '(' || Character == '{' || Character == '[') {
				stack.push(Character);
			}else if (Character == ')' || Character == '}' || Character ==']') {
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		// TODO Auto-generated method stub
		return stack.isEmpty()? true : false;
	}
}
	
	 