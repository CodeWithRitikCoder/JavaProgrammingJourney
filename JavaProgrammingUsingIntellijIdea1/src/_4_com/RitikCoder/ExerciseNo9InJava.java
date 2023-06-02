package _4_com.RitikCoder;
class Library{
    String [] books;
    int noOfBooks;
    public Library() {
        this.books= new String[100];
        this.noOfBooks= 0;
    }
    void addBook(String book){
        this.books[noOfBooks]= book;
        noOfBooks++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book: this.books){
            if(book== null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }
    void issueBook(String book){
            for(int i= 0; i< this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println(book+" : book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class ExerciseNo9InJava {
    public static void main(String[] args) {
        System.out.println("Exercise No-9 In Java");
        Library library= new Library();
        System.out.println();
        library.addBook("C Programming");
        library.addBook("C++ Programming");
        library.addBook("Java Programming");
        library.addBook("Python Programming");
        System.out.println();
        library.showAvailableBooks();
        System.out.println();
        library.issueBook("C++ Programming");
        System.out.println();
        library.showAvailableBooks();
        System.out.println();
        library.returnBook("C++ Programming");
        System.out.println();
        library.showAvailableBooks();

    }
}
