package bookApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
			List<Book> books = new ArrayList<Book>();
			List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
												  new Author("ekta", "gupta", "in"));

			List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

			List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
												  new Author("keshav", "gupta", "us"));

			books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
			books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
			books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));
			
			
			// 1. Find books with more than 400 pages
			List<Book> booksWithMoreThan400pages = books.stream()
				.filter(book -> book.getPages()>400)
				.collect(Collectors.toList());
			
			booksWithMoreThan400pages.forEach(System.out::println);
			System.out.println();
			
			
			// 2. Find all books that are java books and more then 400 pages
			List<Book> javaBooksWithMoreThan400pages = books.stream()
					.filter(book -> book.getPages()>400 && book.getTitle().equals("java"))
					.collect(Collectors.toList());
				
			javaBooksWithMoreThan400pages.forEach(System.out::println);
			System.out.println();			
			
			// 3. We need the top three longest books
			List<Book> topThreeLongestBooks = books.stream()
					.sorted(Comparator.comparing(Book::getPages))
					.limit(3)
					.collect(Collectors.toList());
				
			topThreeLongestBooks.forEach(System.out::println);
			System.out.println();
			
			
			// 4. We need from the fourth to the last longest books
			List<Book> booksFrom4thlongestBook = books.stream()
					.sorted(Comparator.comparing(Book::getPages))
					.skip(3)
					.collect(Collectors.toList());
				
			booksFrom4thlongestBook.forEach(System.out::println);
			System.out.println();
			
			
			// 5. We need to get all the publishing year
			List<Integer> years= books.stream()
					.map(book -> book.getYear())
					.distinct()
					.collect(Collectors.toList());
				
			years.forEach(System.out::println);
			System.out.println();
			
			
			// 6. We need all the authors names who have written a book
			List<String> authors= books.stream()
					.flatMap(book -> book.getAuthors().stream())
					.map(author -> author.getName())
					.distinct()
					.collect(Collectors.toList());
				
			authors.forEach(System.out::println);
			System.out.println();
			
			
			// 7. We need all the origin countries of the authors
			List<String> authorCountry= books.stream()
					.flatMap(book -> book.getAuthors().stream())
					.map(author -> author.getCountry())
					.distinct()
					.collect(Collectors.toList());
				
			authorCountry.forEach(System.out::println);
			System.out.println();
			
			
			// 8. We want the most recent published book
			Optional<Book> newBook=books.stream()
					.min(Comparator.comparing(Book::getYear));
			System.out.println(newBook.orElse(null));
			System.out.println();
			
			// 9. We want to know if all the books are written by more than one author
			boolean noOfAuthorsOfBook= books.stream()
						.allMatch(book -> book.getAuthors().size()>1);
				
			System.out.println(noOfAuthorsOfBook);
			System.out.println();
			
			
			// 10. We want the total number of pages published
			Integer totalPages=books.stream()
						.map(book -> book.getPages())
						.reduce(0,Integer::sum);
			System.out.println(totalPages);
			System.out.println();
			
			
			// 10. We want to know how many pages the longest book has
			Optional<Integer> pages=books.stream()
						.map(Book::getPages)
						.reduce(Integer::max);
			System.out.println(pages.orElse(-1));
			System.out.println();
			
			// 10. We want the average number of pages of the books
			Double avgPages=books.stream()
						.collect(Collectors.averagingDouble(Book::getPages));
			System.out.println(avgPages);
			System.out.println();
			
			
			// 11. We want all the titles of the books
			String titles=books.stream()
					.map(book -> book.getTitle())
					.collect(Collectors.joining(" "));
			System.out.println(titles);
			System.out.println();

			
			// 12. book with highest no of authors
			Optional<Book> highestAuthorBook=books.stream()
					.max(Comparator.comparing(book -> book.getAuthors().size()));
			System.out.println(highestAuthorBook.orElse(null));
			System.out.println();
			
			
			// 13. We want a Map of book per year
			Map<Integer, List<Book>> yearBooks = books.stream().collect(
					Collectors.groupingBy(Book::getYear));

			System.out.println(yearBooks.size());

			// 14. We want to count how many books are published per year
			Map<Integer, Long> yearBooks1 = books.stream().collect(
					Collectors.groupingBy(Book::getYear, Collectors.counting()));
			
			System.out.println(yearBooks1.size());


	}

}
