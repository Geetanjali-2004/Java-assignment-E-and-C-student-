package Pack1;

import java.util.Scanner;

public class MuliplicationM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	
		int a[][]=new int[10][10];
		 Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) 
		 for(int j=0;j<2;j++)
		 {
			
			  a[i][j]=sc.nextInt();
					 }
		for(int i=0;i<2;i++) 
			 for(int j=0;j<2;j++) 
			 {
			 System.out.println(a[i][j]);
			 
		 }
         int b[][]=new int[10][10];
         Scanner sc1=new Scanner(System.in);
         for(int i=0;i<2;i++) 
    		 for(int j=0;j<2;j++)
    		 {
    			 b[i][j]=sc1.nextInt();
    		 }
     	for(int i=0;i<2;i++) 
			 for(int j=0;j<2;j++) 
			 {
			 System.out.println(b[i][j]);
			 
	
	
     	  int c[][]=new int[10][10];
     
	//int j = 0;
	//int i = 0;
	c[i][j]=a[i][j]*b[i][j];
     System.out.println(c[i][j]);
	
	}
		

}
}
