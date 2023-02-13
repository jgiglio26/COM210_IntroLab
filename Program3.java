
 
import javax.swing.JOptionPane;



public class Program3 {

 
public static void main(String[] args)
    {
        String sItemAmt;
        int itemAmt;
        String s;
        String j;
        double d;
        double average = 0;
        double sum = 0;
        
        sItemAmt = JOptionPane.showInputDialog("How many items do you want?");
        itemAmt = Integer.parseInt(sItemAmt);
        String [] items = new String[itemAmt];
        double [] itemPrice = new double[itemAmt];
        
        
        for(int i = 0; i < itemAmt; i++)
        {
            s = JOptionPane.showInputDialog("What item do you want?");
            j = JOptionPane.showInputDialog("How much is that item?");
            d = Double.parseDouble(j); 
            items[i] = s;
            itemPrice[i] = d;        
        }
        
        for(int i = items.length - 1; i >= 0; i--)
        {
            System.out.println(items[i] + " " + itemPrice[i]);
        }
        
        for(int i = 0; i < itemAmt; i++)
        {
            sum += itemPrice[i];
        }
        
        average = sum / (itemPrice.length - 1);
        
       
        for(int i = 0; i < items.length; i++)
        {
            if(items[i].equalsIgnoreCase("Peas"))
            {
              System.out.println("The average price of the items is: " + average);
              break;
            }
        }
        
        
       
                
                
    }
    
}
