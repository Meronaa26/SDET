package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {

        Book book= new Book();
        book.author="Meron";
        book.title="Faith and women";
        book.price=250;


        System.out.println(book.title + " " + book.author +" " + book.price);

        AudioBook audioBook= new AudioBook();
            audioBook.narrator="Hirute";
            audioBook.title="Tiktok";
            audioBook.author="Tsion";
            audioBook.price=23.0;
            audioBook.length=20;
           audioBook.listen();

        EBook ebook= new EBook();
        ebook.author="Tesfay";
        ebook.title="Faith and women";
        ebook.price=45.78;
        ebook.size=2;
        ebook.readBook();




    }
}
