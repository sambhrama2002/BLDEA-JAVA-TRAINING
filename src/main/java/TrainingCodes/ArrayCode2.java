/**
 * 
 */
package TrainingCodes;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ArrayCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of class:");
		Scanner sc = new Scanner(System.in);
		int cls = sc.nextInt();
		System.out.println("Enter the count of students in each class:");
		int stu = sc.nextInt();
		int arr[][] = new int [cls][stu];
		
		for (int i=0;i<cls;i++) {
			System.out.println("Inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		
		

	}

}
