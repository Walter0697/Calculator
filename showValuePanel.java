import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class showValuePanel
{
   private static JPanel panel;
   private static JTextField numa, numb, signfield;
   private static float a, b;
   private static String sign;
   private static String temp;
   
   public static void buildPanel()
   {
      panel = new JPanel();
      
      numa = new JTextField(9);
      numb = new JTextField(9);
      signfield = new JTextField(1);
      
      numa.setEditable(false);
      numb.setEditable(false);
      signfield.setEditable(false);
      
      numa.setFont(new Font("Cooper Black", Font.PLAIN, 20)); 
      numb.setFont(new Font("Cooper Black", Font.PLAIN, 20)); 
      signfield.setFont(new Font("Cooper Black", Font.PLAIN, 20)); 
      
      numa.setPreferredSize(new Dimension(200, 30));
      numb.setPreferredSize(new Dimension(200, 30));
      signfield.setPreferredSize(new Dimension(100, 30));
      
      panel.add(numa);
      panel.add(signfield);
      panel.add(numb);
   }
   
   public static JPanel getPanel()
   {
      return panel;
   }
   
   public static void seta(float num)
   {
      temp = Float.toString(num);
      numa.setText(temp);
   }
   
   public static void setb(float num)
   {
      temp = Float.toString(num);
      numb.setText(temp);
   }
   
   public static void seta(String num)
   {
      numa.setText(num);
   }
   
   public static void setb(String num)
   {
      numb.setText(num);
   }
   
   public static void setSign(int num)
   {
      switch (num)
      {
         case 1:
            signfield.setText("+");
            break;
         case 2:
            signfield.setText("-");
            break;
         case 3:
            signfield.setText("*");
            break;
         case 4:
            signfield.setText("/");
            break;
         case 6:
            signfield.setText(" ");
            break;
         case 7:
            signfield.setText("^");
            break;
         case 8:
            signfield.setText("(");
            break;
      }
   }
}