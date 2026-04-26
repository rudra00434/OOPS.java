package MyPackage;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		System.out.println("pattern one : ");
	    pattern1(n);
	    System.out.println();
	    System.out.println("pattern two : ");
		pattern2(n);
		System.out.println();
		System.out.println("pattern three : ");
		pattern3(n);
		System.out.println();
		System.out.println("pattern four : ");
		pattern4(n);
		System.out.println();
		System.out.println("pattern five : ");
		pattern5(n);
		System.out.println("pattern six : ");
		pattern6(n);
      
      
	}
	
	static void pattern1(int n) {
		for(int row = 1; row<= n ; row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern2(int m) {
		for(int row1 =1;row1<=m;row1++) {
			for(int col1=1;col1<=m;col1++) {
				System.out.print("*");		
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n1) {
		for(int row2=0;row2<n1;row2++) {
			for(int col2=1;col2<n1-row2;col2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4(int m1) {
		for(int row3=1;row3<=m1;row3++) {
			for(int col3=1;col3<=row3;col3++) {
				System.out.print(col3);
			}
			System.out.println();
		}
	}
	static void pattern5(int n2) {
		for(int row4 = 0 ; row4<2*n2;row4++) {
			int TotalColsInRow = row4 > n2 ? 2*n2-row4-1:row4;
		for(int col4=0;col4<TotalColsInRow;col4++) {
			System.out.print("*");
		}
		System.out.println();	
		}
	}
	static void pattern6(int m2) {
		for (int row5=1;row5<= m2;row5++) {
			for(int col4 = 1;col4<= row5;col4++) {
				if((row5+col4)%2==0)
				{
					System.out.print("1");			
					
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
