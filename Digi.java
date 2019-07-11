public class Digi extends Telecommunication
{
   protected double telcoPrice;
   
    public Digi(String tT,double tP)
    {
        super(tT,tP);
        telcoPrice = tP;
    }
    
    public void setData(String tT, double tP)
   {
       super.setData(tT,tP);
       telcoType = tT;
       telcoPrice = tP;
   }

    public double calcPrice()
    {
        double total=0;
        total=telcoPrice;
        return total;
    }
    
    public String displayInstruction()
    {
        return "Top Up Instruction " +
        "Key in *111*PIN# and " +
        "Press CALL " +
        "Careline : " +
        "03-2613 5000 "; 
    }

    public String displayReceipt()
    {
        return "Digi RM" + telcoPrice ;
    }
        
    
}
