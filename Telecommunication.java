public abstract class Telecommunication
{
   protected String telcoType;
   protected double telcoPrice;   
   
   public Telecommunication(String tT,double tP) 
   {
       telcoType = tT;
       telcoPrice = tP;
   }
   
   public void setData(String tT, double tP)
   {
       telcoType = tT;
       telcoPrice = tP;
    }
    
   public String gettelcoType()
   {
      return telcoType; 
   }
   public double gettelcoPrice()
   {
       return telcoPrice;
   }

   public abstract double calcPrice();
    
   public String toString()
   {
       return "Telecommunication Type :" +telcoType+
              "\nPrice :" +telcoPrice;  
   }
}
