package q2.invoice;

import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String partNum,partDescription;
		int quantity;
		double pricePerItem;
		System.out.println("Enter partNum");
		partNum=sc.nextLine();
		System.out.println("Enter partDescription");
		partDescription=sc.nextLine();
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
		System.out.println("Enter price per item");
		pricePerItem=sc.nextDouble();
		
		Invoice in=new Invoice(partNum,partDescription,quantity,pricePerItem);
		System.out.println(in.getPayment());
		
		sc.close();
	}

}
