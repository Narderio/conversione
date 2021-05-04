import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ascoltatore implements ActionListener
{
   JTextField numero;
   JComboBox cb;
   JTextField convertito;
    ascoltatore(JTextField numero,JComboBox cb,JTextField convertito)
    {
        this.numero=numero;
        this.cb=cb;
        this.convertito=convertito;
    }
    
    
    
            
           
            
        
    
   
    
    public void actionPerformed(ActionEvent e)
    {String a;
        
        
       if(cb.getItemAt(cb.getSelectedIndex())=="bin/dec")
          {
              a=numero.getText();  
             convertito.setText(Conversione.decimale(a));
            
          }
          else
           {
               a=numero.getText();
               convertito.setText(Conversione.binario(a));
           }
           
     }
}
