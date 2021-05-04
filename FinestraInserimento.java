import java.awt.*;
import javax.swing.*;
public class FinestraInserimento extends JFrame
{
    private Container container;
    private JPanel panel;
    private JLabel etichettaconversione,etichettanumero;
    private JButton converti;
    private JTextField convertito;
    String conver[]= {"bin/dec","dec/bin"};
    public FinestraInserimento() 
    {
        super("Conversione");
        setSize(1000,1000);
        setLocation(500,500);
        setResizable(true);
        container=getContentPane();
        panel=new JPanel();
        
        //panel.setBackground(Color.black);
        panel.setLayout(null);
        
        
        etichettaconversione=new JLabel("Conversione");
        convertito=new JTextField();
        etichettanumero=new JLabel("Inserisci numero da convertire");
        JTextField numero=new JTextField();
        JButton converti=new JButton("Converti");
       
        
        JComboBox cb=new JComboBox(conver);
        
        
        
        
        
        
        
       converti.addActionListener(new ascoltatore(numero,cb,convertito));
       

        
        
        panel.add(etichettanumero);
        panel.add(etichettaconversione);
        panel.add(cb);
        panel.add(numero);
        panel.add(convertito);
        panel.add(converti);
        
        
        
       etichettanumero.setBounds(100,100,100,20);
       numero.setBounds(100,130,100,20);
       cb.setBounds(220,130,100,20);
       etichettaconversione.setBounds(330,100,100,20);
       convertito.setBounds(330,130,100,20);
       converti.setBounds(220,100,100,20);
       
        
        
        
        
        
        
        
        
       
        convertito.setEditable(false);
        container.add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    public static void main(String [] args) 
    {
        FinestraInserimento o = new FinestraInserimento(); 
    }
}