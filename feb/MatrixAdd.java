package MODULE_1;

import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s =new Scanner (System.in);
		System.out.print("enter number of rows in matrix A:");
		p = s.nextInt();
		System.out.print("enter number of columns in matrix A:");
		q=s.nextInt();
		System.out.print("enter number of rows in matrix B:");
		m=s.nextInt();
		System.out.print("enter number of columns in matrix B:");
		n=s.nextInt();
		if(p == m && q == n) {
			int a[][] = new int[p][q];
			int b[][]= new int[m][n];
			System.out.println("enter the elements of matrix A:");
			for(int i=0 ;i<p ;i++)
				for(int j=0 ;j<q ;j++)
					a[i][j]=s.nextInt();
			System.out.println("enter the elements of matrix B:");
			for(int i=0 ;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println(" matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+ " ");
			System.out.println();}
			System.out.println(" matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+ " ");
			System.out.println();}
			System.out.println(" The sum of Matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(a[i][j]+b[i][j]+ " ");
			System.out.println();}
		}
		else {
			System.out.println("these matrices cannot be added...");
		}
		
		
			
	}

}

output
enter number of rows in matrix A:3
enter number of columns in matrix A:3
enter number of rows in matrix B:3
enter number of columns in matrix B:3
enter the elements of matrix A:
1
4
5
7
3
5
7
2
6
enter the elements of matrix B:
8
2
5
7
9
4
2
6
8
 matrix A:
1 4 5 
7 3 5 
7 2 6 
 matrix B:
8 2 5 
7 9 4 
2 6 8 
 The sum of Matrix:
9 6 10 
14 12 9 
9 8 14 

  
