import java.util.Scanner;
public class SimpleCalculator {
	public static void cal(int  op1, int op2, char operator) throws plusException, subException, outException{
		if(op1 == 0 || op2 == 0) {	
			if(operator == '+') {
				throw new plusException();
			}
			else {
				throw new subException();
			}
		}
		else if(op1 < 0 || op1 > 1000) {
			throw new outException();
		}
		else if(op2 < 0 || op2 > 1000) {
			throw new outException();
		}
		else {
			if(operator == '+') {
				if(op1+op2<0 || op1+op2 > 1000) {
					throw new outException();
				}
				
			}
			else if(operator == '-') {
				if(op1-op2<0 || op1-op2 > 1000) {
					throw new outException();
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		int is_operator = 0;
		int op1 = 0;
		int op2 = 0;
		char operator = 'p';
		expression.charAt(0);
		for(int i = 0; i < expression.length();i++) {
			if(expression.charAt(i)  == '+'|| expression.charAt(i)  == '-') {
				operator = expression.charAt(i);
				is_operator = 1;
				continue;
			}
			if(is_operator == 0) {
				op1 *= 10;
				op1 += expression.charAt(i) - 48;
			}
			else {
				op2 *= 10;
				op2 += expression.charAt(i) - 48;
			}
		}
		///System.out.println(op1);
		//System.out.println(op2);
		try {
			cal(op1, op2, operator);
			if(operator == '+') {
				System.out.println(op1+op2);
			}
			else {
				System.out.println(op1-op2);
			}
		}
		catch(plusException p){
			p.print();
		}
		catch(subException p){
			p.print();
		}	
		catch(outException p){
			p.print();
		}
		
		
	}
}

class plusException extends Exception{
	public void print() {
		System.out.println("AddZeroException");
	}
}
class subException extends Exception{
	public void print() {
		System.out.println("SubtractZeroException");
	}
}
class outException extends Exception{
	public void print() {
		System.out.println("OutOfRangeException");
	}
}
