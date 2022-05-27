package Practice;

import org.junit.Test;

public class P58_LC_1572_Matrix_diagonal_sum {
	
	@Test
	public void testdata() {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(matrixDiagonalSum(mat));
	}

	private int matrixDiagonalSum(int[][] mat) {
		// TODO Auto-generated method stub
		
		int size = mat.length, sum=0;
		
		for(int i=0;i<size;i++) {
			sum=sum+mat[i][i]+mat[i][size-i-1];
		}
		
		if(size%2==1) sum = sum - mat[size/2][size/2];
		
		return sum;
		
	}

}
