import java.util.Scanner;

public class MinimumPathSum {

	public static int findMinPath(int a[][] ) {
	if(a == null || a.length==0){
        return 0;
	}
 
    int m = a.length;
    int n = a[0].length;
 
    int[][] b = new int[m][n];
    b[0][0] = a[0][0];    
 
 
    for(int i=1; i<n; i++){
        b[0][i] = b[0][i-1] + a[0][i];
    }
    for(int j=1; j<m; j++){
        b[j][0] = b[j-1][0] + a[j][0];
    }
    for(int i=1; i<m; i++){
        for(int j=1; j<n; j++){
            if(b[i-1][j] > b[i][j-1]){
                b[i][j] = b[i][j-1] + a[i][j];
            }else{
                b[i][j] = b[i-1][j] + a[i][j];
            }
        }
    }
 
    return b[m-1][n-1];
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int r = s.nextInt();
		System.out.print("Enter the no. of col: ");
		int c = s.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the values:");  
		for(int i = 0; i < r; i++ ) {
			for(int j = 0; j < c; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int min = findMinPath(a);
		System.out.print("Minimum sum of path: " + min);
		s.close();
	}


}