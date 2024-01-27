package homework1;

public class Gugudan {

	public static void main(String[] args) {

		int i, j;
		int arr[][] = new int[10][10];
		
		for(i=1; i<10; i++) {
			for(j=1; j<10; j++) {
				arr[i][j] = i*j;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
