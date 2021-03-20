public class Book extends Publish {
  String author;

  public Book(String author, String title, double price){
    super(title, price);
    this.author = author;
  }

  public String getAuthor(){
    return this.author;
  }
}