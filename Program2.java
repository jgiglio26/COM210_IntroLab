
import java.util.Scanner;
import javax.swing.JOptionPane;




public class Program2
{

    
    public static void main(String[] args)
    {
        double price1;
        double price2;
        double price3;
        double average;
        
        
        String item1 = JOptionPane.showInputDialog("What is item 1?");
        String item2 = JOptionPane.showInputDialog("What is item 2?");
        String item3 = JOptionPane.showInputDialog("What is item 3?");
        
        String sPrice1= JOptionPane.showInputDialog("What is the price for item 1?");
        String sPrice2= JOptionPane.showInputDialog("What is the price for item 2?");
        String sPrice3= JOptionPane.showInputDialog("What is the price for item 3?");
        
        price1 = Double.parseDouble(sPrice1);
        price2 = Double.parseDouble(sPrice2);
        price3 = Double.parseDouble(sPrice3);
        
        System.out.println(item1 + " " + sPrice1 + "\n" + item2 + " " + sPrice2 
                           + "\n" + item3 + " " + sPrice3);
        
        average = (price1 + price2 + price3) / 3;
        
        if(item1.equalsIgnoreCase("Peas") || item2.equalsIgnoreCase("Peas") 
                                         || item3.equalsIgnoreCase("Peas"))
        {
            System.out.println("The average is: " + average); 
        } else
        {
            System.out.println("no average output");
        }
       
        
      
        
        
        
        
        
    }
    
}


