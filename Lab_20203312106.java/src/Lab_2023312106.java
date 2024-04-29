import java.util.Scanner;
public class Lab_2023312106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int n1 = n;
		int n2 = n;
		int index = 0;
		int [] num = new int[100];
		int second_var = 1;
		for(; second_var <= n; second_var = second_var*2) {
			index++;
		}
		
		second_var = second_var / 2;
		for(int k = 0; k < index ; k++) {
			if(n >= second_var) {
				num[k] = 1;
				n = n-second_var;
			}
			else {
				num[k] = 0;
			}
			second_var = second_var/2;
		}
		System.out.print("b ");
		for(int k = 0; k < index; k++) {
			System.out.print(num[k]);
		}
		System.out.print("\n");
		index = 0;
		
		
		
		
		
		
		
		int [] num2 = new int[100];
		int octal_var = 1;
		for(; octal_var <= n1; octal_var = octal_var*8) {
			index++;
		}
		
		octal_var = octal_var / 8;
		for(int k = 0; k < index ; k++) {
			if(n1 >= octal_var) {
				num2[k] = n1 / octal_var;
				n1 = n1-octal_var*num2[k];
			}
			else {
				num2[k] = 0;
			}
			octal_var = octal_var/8;
				
		}
		System.out.print("o ");
		for(int k = 0; k < index; k++) {
			System.out.print(num2[k]);
		}		
		System.out.print("\n");
		
		
		
		
		
		
		
		int [] num3 = new int[100];
		index = 0;
		int hexa_var = 1;
		for(; hexa_var < n2; hexa_var = hexa_var*16) {
			index++;
		}
		hexa_var = hexa_var / 16;
		for(int k = 0; k < index ; k++) {
			if(n2 >= hexa_var) {
				num3[k] = n2 / hexa_var;
				n2 = n2-hexa_var*num3[k];
			}
			else {
				num3[k] = 0;
			}
			hexa_var = hexa_var/16;
				
		}
		System.out.print("h ");
		
		for(int k = 0; k < index; k++) {
			if(num3[k]>= 10) {
				switch(num3[k]) {
				case 10:
					System.out.print('a');
					break;
					
				case 11:
					System.out.print('b');
					break;
				case 12:
					System.out.print('c');
					break;
				case 13:
					System.out.print('d');
					break;
				case 14:
					System.out.print('e');
					break;
				case 15:
					System.out.print('f');
					break;
				
				}
			}
			else {
				System.out.print(num3[k]);
			}
		}		
		
		System.out.print("\n");		
		
		
		
		
		
		
		
		
		
	}

}
