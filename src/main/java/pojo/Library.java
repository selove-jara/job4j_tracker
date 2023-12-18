package pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 257);
        Book goneWithTheWind = new Book("Gone with the Wind", 200);
        Book theGreenMile = new Book("The Green Mile", 500);
        Book twelveChairs = new Book("Twelve chairs", 400);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = goneWithTheWind;
        books[2] = theGreenMile;
        books[3] = twelveChairs;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("The top books have changed!");
        Book temp = cleanCode;
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Найти книгу - Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
