public class Book {
  Person author;
  String title;
  double price;

  public Book(Person author, String title, double price){
    this.author = author;
    this.title = title;
    this.price = price;
  }

  public Person getAuthor(){
    return this.author;
  }

  public String getTitle(){
    return this.title;
  }

  public double getPrice(){
    return this.price;
  }
}
