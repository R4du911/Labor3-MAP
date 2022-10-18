

public class Product{
   private float price;
   private int days;

   public Product(float _price, int _days){
      if(_price % 0.05 != 0)
         _price -= _price % 0.05;
      this.price = _price;
      this.days = _days;
   }

   public void discounting(){
         if (this.days > 10 && this.days <= 20)
            this.price *= 0.9;
         else if(this.days > 20)
            this.price *= 0.8;
   }

   public float getPrice() {
      return price;
   }

   public void setPrice(float price) {
      this.price = price;
   }

   public int getDays() {
      return days;
   }

   public void setDays(int days) {
      this.days = days;
   }
}