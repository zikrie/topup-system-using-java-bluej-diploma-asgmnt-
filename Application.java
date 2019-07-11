import java.io.*;
import java.util.*;
public class Application
{
   
    public static void main(String args[])throws IOException
    {
        String tT,x;
        double tP;
        int n;
        String fileName = "Receipt.txt"; 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
                      FileWriter file = new FileWriter(fileName);
                      BufferedWriter out = new BufferedWriter( file );
                      PrintWriter writer = new PrintWriter( out );

        System.out.print("How many recharge : ");
        x=in.readLine();
        n=Integer.parseInt(x);
         
        Telecommunication tc[]=new Telecommunication[n];
        Random t = new Random();
        
       try
       {
           for(int i=0;i<tc.length;i++)
        {
            System.out.print("Telecomunnication type (C)elcom, (D)igi, (M)axis : ");
            tT=in.readLine();

            if(tT.equalsIgnoreCase("C"))
            {
                System.out.println("----CELCOM----");
                System.out.print("Reload RM5, RM10 , RM30, RM50, RM100 : ");
                x=in.readLine();
                tP=Double.parseDouble(x);  
                tc[i]=new Celcom(tT,tP);
            }
            
            else if(tT.equalsIgnoreCase("D"))
            {
                System.out.println("----DIGI----");
                System.out.print("Reload RM5, RM10 , RM30, RM50, RM100 : ");
                x=in.readLine();
                tP=Double.parseDouble(x);
                tc[i]=new Digi(tT,tP);
            }
            
            else if(tT.equalsIgnoreCase("M"))
            {
                System.out.println("----MAXIS----");
                System.out.print("Reload RM5, RM10 , RM30, RM50, RM100 : ");
                x=in.readLine();
                tP=Double.parseDouble(x);  
                tc[i]=new Maxis(tT,tP);
            }
        }
        
        int countC=0,countD=0,countM=0;
        for(int i=0;i<tc.length;i++)
        {
            if(tc[i] instanceof Celcom){
                countC++;
            }
            else if(tc[i] instanceof Digi){
                countD++;
            }
            else if(tc[i] instanceof Maxis){
                countM++;
            }
        }
        writer.println("Celcom Buyer :"+countC);
        writer.println("Digi Buyer :"+countD);
        writer.println("Maxis Buyer :"+countM + "\n");
        writer.println();
        
        double total=0; 
        for(int i=0;i<tc.length;i++)
        {
            if(tc[i] instanceof Celcom)
            {
                Celcom a=(Celcom) tc[i];
                writer.println("\n-----CELCOM-----");
                writer.println(a.displayInstruction());
                writer.println("CELCOM RM "+ a.calcPrice());
                
            }
            else if(tc[i] instanceof Digi){
                Digi b=(Digi) tc[i];
                writer.println("\n-----DIGI-----");
                writer.println(b.displayInstruction());
                writer.println("DIGI RM "+ b.calcPrice());
                writer.println("---------------");
            }
            else if(tc[i] instanceof Maxis){
                Maxis c=(Maxis) tc[i];
                writer.println("\n-----MAXIS-----");
                writer.println(c.displayInstruction());
                writer.println("MAXIS RM "+ c.calcPrice());
                writer.println("---------------");
            }
            writer.println();
            total=total+tc[i].calcPrice();
        }
        writer.println("\nTotal Price : RM" + total);
        writer.println();
        int c;
        writer.println("----------PIN NUMBER-----------");
        for(int i=0;i<tc.length;i++)
        {
             writer.print("\n");
            for (c = 1; c <= 4; c++) 
            {
                writer.print(t.nextInt(9));
            }
            writer.print(" ");
            for (c = 1; c <= 4; c++) 
            {
                writer.print(t.nextInt(9));
            }
            writer.print(" ");
            for (c = 1; c <= 4; c++) 
            {
                writer.print(t.nextInt(9));
            }
            writer.print(" ");
            for (c = 1; c <= 4; c++) 
            {
                writer.print(t.nextInt(9));
            }
            writer.println();
            writer.println();
        }
        writer.println("----------------------------");
        writer.close();

        }
        
    
        catch (FileNotFoundException e)
            { System.out.println("Problem :"+e.getMessage());  }
                catch (IOException ioe)
                   {  System.out.println("Problem :"+ioe.getMessage());  }
                
        }
 
}
