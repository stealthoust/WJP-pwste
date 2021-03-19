public class Publish {
  String title;
  double price;

  public Publish(String title, double price){
    this.title = title;
    this.price = price;
  }

  public String getTitle(){
    return this.title;
  }

  public double getPrice(){
    return this.price;
  }
}