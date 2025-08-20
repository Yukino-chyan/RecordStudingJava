public class Book {
    public String author,title,borrowedBy;
    public boolean status;
    public static int numbers=0;
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public String toString(){
        return this.author + " " + this.title;
    }
    public boolean equal(Book book){
        return  this.author.equals(book.author) && this.title.equals(book.title);
    }
    public void borrow(String borrowedBy){
        this.borrowedBy = borrowedBy;
        status = true;
        numbers++;
    }
    public void returnBook(String returnedBy){
        status = false;
        numbers--;
    }
    public static int getNumbers(){
        return numbers;
    }
}
