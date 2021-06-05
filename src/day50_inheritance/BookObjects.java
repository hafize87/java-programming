package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 75.00;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();

        audioBook.length = 45;
        audioBook.author = "unknown";
        audioBook.price = 67.00;
        audioBook.title = "Selenium";
        audioBook.narrator = "Ayse";
        audioBook.listen();

     //    book.pages = 40;  ERROR





        EBook eBook = new EBook();

        eBook.author = "unknown";
        eBook.price = 67.00;
        eBook.title = "Selenium";
        eBook.pages = 45;
        eBook.size = 5;
        eBook.readBook();
    }
}
