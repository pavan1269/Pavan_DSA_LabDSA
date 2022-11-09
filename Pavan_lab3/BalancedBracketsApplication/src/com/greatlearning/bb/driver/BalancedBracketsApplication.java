package com.greatlearning.bb.driver;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		String str=scanner.next();
		boolean b = checkBracket(str);
		if(b)
		{
			System.out.println("Entered String is balanced");
		}
		else
		{
			System.out.println("Entered String is not balanced");	
		}
		
	}
	
	private static boolean checkBracket(String input)
	{
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			Character k=input.charAt(i);
			if(k=='[' || k =='{' || k=='(')
			{
				stack.push(k);
				continue;
			}
			if(stack.isEmpty())
				return false;
			
		char h;
		switch(k)
		{
			case ']':
				h=stack.pop();
				if(h!='[')
				{
					return false;
				}
				break;
			case '}':
				h=stack.pop();
				if(h!='{')
				{
					return false;
				}
				break;
			case ')':
				h=stack.pop();
				if(h!='(')
				{
					return false;
				}
				break;
		}
	
		}
	return stack.isEmpty();
}	
}

