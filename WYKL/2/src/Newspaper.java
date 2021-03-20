public class Newspaper extends Publish {
  int number; 

  public Newspaper(int number, String title, double price){
    super(title, price);
    this.number = number;
  }

  public int getNumber(){
    return this.number;
  }
}