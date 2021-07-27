package q2;

public class TimeTable {
	private int[][] matrix=new int[9][9];
	
	public TimeTable() {
		this.createMatrix();
	}
	
	private void createMatrix() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++)
				matrix[i][j]=(i+1)*(j+1);
		}
	}

	public int[][] getMatrix() {
		return this.matrix;
	}
}
