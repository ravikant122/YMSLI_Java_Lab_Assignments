package q3;

import java.io.Serializable;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int homeNumber;
	private String colony;
	private String area;
	private String district;
	private String state;
	
	public Address(int homeNumber, String colony, String area, String district, String state) {
		super();
		this.homeNumber = homeNumber;
		this.colony = colony;
		this.area = area;
		this.district = district;
		this.state = state;
	}

	public void display() {
		System.out.println("Home Number= "+homeNumber+", colony= "+colony+", area= "+area+", district= "+district+", state= "+state);
		
	}	
}
