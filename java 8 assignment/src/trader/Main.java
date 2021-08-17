package trader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Trader ram= new Trader("ram", "delhi");
		Trader kapil= new Trader("kapil","noida");
		Trader raj= new Trader("raj","banglore");
		Trader ekta= new Trader("ekta","banglore");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(ram, 2011, 300),
				new Transaction(ram, 2012, 1000),
				new Transaction(kapil, 2011, 400),
				new Transaction(raj, 2012, 710),
				new Transaction(ekta, 2012, 700),
				new Transaction(ekta, 2012, 950)
		);
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high)
		transactions.stream()
			.filter(transaction -> transaction.getYear()==2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(System.out::println);
		
		// 2. What are all the unique cities where the traders work?
		transactions.stream()
			.map(t -> t.getTrader().getCity())
			.distinct()
			.forEach(System.out::println);
		
		// 3. Find all traders from delhi and sort them by name.
		transactions.stream()
			.filter(t -> t.getTrader().getCity().equals("delhi"))
			.map(t -> t.getTrader())
			.sorted(Comparator.comparing(Trader::getName))
			.forEach(System.out::println);
		
				// or
		
		transactions.stream()
			.map(t -> t.getTrader())
			.filter(t -> t.getCity().equals("delhi"))
			.sorted(Comparator.comparing(Trader::getName))
			.forEach(System.out::println);
		
		// 4. Return a string of all traders names sorted alphabetically.
		String names=transactions.stream()
				.map(t -> t.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.joining(" "));	// bcoz we've to return a string of all names
		System.out.println(names);
		
		// 5. Are any traders based in Jaipur?
		System.out.println(transactions.stream()
									.anyMatch(t -> t.getTrader().getCity().equals("jaipur")));
		
		// 6. Print all transactions values from the traders living in delhi
		transactions.stream()
			.filter(t -> t.getTrader().getCity().equals("delhi"))
			.map(t -> t.getValue())
			.forEach(System.out::println);
		
		// 7. Whats the highest value of all the transactions?
		Optional<Integer> highest_val = transactions.stream()
													.map(t -> t.getValue())
													.reduce(Integer::max);
		System.out.println(highest_val.orElse(-1));
		
		// 8. Find the transaction with the smallest value
		Optional<Integer> smallest_val = transactions.stream()
				.map(t -> t.getValue())
				.reduce(Integer::min);
		System.out.println(smallest_val.orElse(-1));

	}

}
