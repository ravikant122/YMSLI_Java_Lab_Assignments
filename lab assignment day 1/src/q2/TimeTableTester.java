package q2;

public class TimeTableTester {

	public static void main(String[] args) {
		TimeTable t=new TimeTable();
		TimeTableTester.printTimeTable(t.getMatrix());
	}

	private static void printTimeTable(int[][] matrix) {
			for(int[] i:matrix) {
				for(int j:i){
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}

}
