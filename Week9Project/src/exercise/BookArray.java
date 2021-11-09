package exercise;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book books[] = new Book[10];
		
		books[0] = new Fiction("Fiction 1");
		books[1] = new NonFiction("NON Fiction 1");
		books[2] = new Fiction("Fiction 2");
		books[3] = new Fiction("Fiction 3");
		books[4] = new Fiction("Fiction 4");
		books[5] = new NonFiction("NON Fiction 2");
		books[6] = new Fiction("Fiction 5");
		books[7] = new Fiction("Fiction 6");
		books[8] = new Fiction("Fiction 7");
		books[9] = new NonFiction("NON Fiction 3");
		
		for (Book book : books) {
			System.out.println(book);
		}
		
	}

}
