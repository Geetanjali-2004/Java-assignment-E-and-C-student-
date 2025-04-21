package Pack1;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package Pack1;

import java.util.Scanner;

int option = 0;
		 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 System.out.println(a);
 Scanner sc1=new Scanner(System.in);
		 int b=sc1.nextInt();
 System.out.println(b);
		 System.out.println("1,Addition");
		 System.out.println("2,Substraction");
		 System.out.println("3 Multiplication");
		 System.out.println("4 Divison");
		 System.out.println("option");
		 switch(option)
		 {
		 case 1:
			 System.out.println(a+b);
			 break;
		 case 2:
			 System.out.println(a-b);
			 break;
		 }
			}
		}



	}

}
