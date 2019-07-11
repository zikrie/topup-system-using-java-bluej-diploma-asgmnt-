public class Celcom extends Telecommunication
{
   protected double telcoPrice;
    public Celcom(String tT,double tP)
    {
        super(tT,tP);
        telcoPrice = tP;
    }
    
    public double gettelcoPrice()
    {
        return telcoPrice;
    }
    
    public void setData(String tT, double tP)
   {
       super.setData(tT,tP);
       telcoType = tT;
       telcoPrice = tP;
       
   }

    public double calcPrice()
    {
        return telcoPrice;
    }
    
    public String displayInstruction()
    {
        return "Top Up Instruction " +
        "Key in *122*PIN# and " +
        "Press CALL " +
        "Careline : " +
        "03-2613 8000 "; 
    }
    
    public String displayReceipt()
    {
        return "Celcom RM" + telcoPrice ;
    }
        
    
}
