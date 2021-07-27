package q5;

public class Pattern {
	
	private int upto;
	
	public Pattern(int upto) {
		this.upto=upto;
	}
	
	public int getUpto() {
		return upto;
	}

	public void setUpto(int upto) {
		this.upto = upto;
	}

	public void printPattern() {
		for(int i=1; i<=this.upto; i++) {
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println();
	}
}
