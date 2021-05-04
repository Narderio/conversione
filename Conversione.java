import java.util.Scanner;
public class Conversione
{
    public static int stringtoint(String a)
    {int x;
     
     x=Integer.parseInt(a);  
        
        
     return x;   
    }
    
    public static String decimale(String num)
    {
        int decimal=0;
        for(int i=0;i<num.length();i++){
        decimal = 2*decimal + Integer.parseInt("" + num.charAt(i));
        }
        String a=String.valueOf(decimal);
        return a;
    }
    
    
    public static String binario(String a)
    {int conversione;
      String binar;
      
        conversione=stringtoint(a);
        String obrnuti = "";
        while (conversione > 0) {
        int x = conversione % 2;
        obrnuti += x;
        conversione /= 2;
        }
        binar=reverse(obrnuti);

     return binar;  
    }
    
    public static String reverse(String a) 
    {
        String novi = "";
        for (int i = a.length() - 1; i >= 0; i--) {
        char c = a.charAt(i);
        novi += c;
        }
        return novi;
    }
}
