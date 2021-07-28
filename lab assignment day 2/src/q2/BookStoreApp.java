package q2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookStore bs=new BookStore();
		while(true) {
			int input=sc.nextInt();
			sc.nextLine();
			if(input==0)
				break;
			else if(input==1) {
				bs.display();
			}else if(input==2) {
				System.out.println("enter the number of books you want to order");
				int cnt=sc.nextInt();
				sc.nextLine();
				while(cnt>=0) {
					System.out.println("Enter the ISBN and number of copies(space separated");
					String[] str=sc.nextLine().split(" " );
					bs.order(str[0], Integer.parseInt(str[1]));
					cnt--;
				}
			}else if(input==3) {
				System.out.println("enter the number of books you want to sell");
				int cnt=sc.nextInt();
				sc.nextLine();
				while(cnt>=0) {
					System.out.println("Enter the title of the book and number of copies(space separated");
					String[] str=sc.nextLine().split(" " );
					bs.sell(str[0], Integer.parseInt(str[1]));
					cnt--;
				}
			}else {
				System.out.println("Wrong input, please try again");
			}
		}
		sc.close();
	}

}
