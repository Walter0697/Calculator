import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.lang.Math;

public class showPanel
{
   private static JTextField output;
   private static JPanel showPanel;
   private static int textsize = 9;
   private static int sit = 0;
   private static float a, b, ans;
   private static float temp;
   private static String s1, s2, s3, s4, s5;
   private static String temps = "";
   
   public static void buildPanel()
   {
      showPanel = new JPanel();
      showPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
      showPanel.setLayout(new BorderLayout());
      showPanel.setPreferredSize(new Dimension(400, 100));
      
      showValuePanel.buildPanel();
      
      output = new JTextField(textsize);
      output.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      output.setText("0");
      output.setHorizontalAlignment(JTextField.RIGHT);
      output.setEditable(false);
      
      showPanel.add(output, BorderLayout.CENTER);
      showPanel.add(showValuePanel.getPanel(), BorderLayout.NORTH);
   }
   
   public static JPanel getPanel()
   {
      return showPanel;
   }
   
   public static void changeNumberLine(String Num)
   {
      temp = Float.parseFloat(Num);
      Num = Float.toString(temp);
      output.setText(Num);
   
   }
   
   public static String Calculate(int f, String NumberLine)
   {  
      temp = 0;
      showValuePanel.setb(temp);
      if (f != 6)
      {
         if (sit == 0)
         {
            switch (f)
            {
               case 1:
                  sit = 1;
                  break;
               case 2:
                  sit = 2;
                  break;
               case 3:
                  sit = 3;
                  break;
               case 4:
                  sit = 4;
                  break;
            }
            a = Float.parseFloat(NumberLine);
            NumberLine = "0";
            showValuePanel.seta(a);
            showValuePanel.setSign(f);
         }
         else if (sit == 1)
         {
            b = a;
            a = Float.parseFloat(NumberLine);
            ans = a + b;
            showValuePanel.seta(b);
            showValuePanel.setb(a);
            showValuePanel.setSign(f);
            NumberLine = InCal(f, NumberLine);
         }
         else if (sit == 2)
         {
            b = a;
            a = Float.parseFloat(NumberLine);
            ans = b - a;
            showValuePanel.seta(b);
            showValuePanel.setb(a);
            showValuePanel.setSign(f);
            NumberLine = InCal(f, NumberLine);
         }
         else if (sit == 3)
         {
            b = a;
            a = Float.parseFloat(NumberLine);
            ans = a * b;
            showValuePanel.seta(b);
            showValuePanel.setb(a);
            showValuePanel.setSign(f);
            NumberLine = InCal(f, NumberLine);
         }
         else if (sit == 4)
         {
            b = a;
            a = Float.parseFloat(NumberLine);
            ans = b / a;
            showValuePanel.seta(b);
            showValuePanel.setb(a);
            showValuePanel.setSign(f);
            NumberLine = InCal(f, NumberLine);
         }
         else if (sit == 5)
         {
            if (f == 5)
            {
               b = Float.parseFloat(NumberLine);
               ans = (float)Math.pow(a, b);
               sit = 0;
               NumberLine = Float.toString(ans);
               showValuePanel.setb(b);
            }
            else if (f == 6)
            {
               a = 0;
               b = 0;
               ans = 0;
               showValuePanel.seta(a);
               showValuePanel.setb(b);
               showValuePanel.setSign(f);
               NumberLine = "0";
            }
         }
      }
      else if (f == 6)
      {
         a = 0;
         b = 0;
         ans = 0;
         showValuePanel.seta(a);
         showValuePanel.setb(b);
         showValuePanel.setSign(f);
         NumberLine = "0";
      }
      
      return NumberLine;
   }
   
   public static String InCal(int f, String NumberLine)
   {
      switch (f)
      {
         case 1:
            a = ans;
            NumberLine = "0";
            sit = 1;
         case 2: 
            a = ans;
            NumberLine = "0";
            sit = 2;
         case 3:
            a = ans;
            NumberLine = "0";
            sit = 3;
         case 4:
            a = ans;
            NumberLine = "0";
            sit = 4;
         case 5:
            a = ans;
            sit = 0;  
            NumberLine = Float.toString(ans);                   
      }
      
      return NumberLine;
   }
   
   //For sqrt
   public static void changeNumExpo(String NumberLine, String numans, int i)
   {
      switch (i)
      {
      case 1:
         showValuePanel.seta("¡Ì");
         break;
      case 2:
         showValuePanel.seta("log");
         break;
      }
      
      showValuePanel.setSign(8);
      temp = Float.parseFloat(NumberLine);
      temps = Float.toString(temp);
      showValuePanel.setb(temps + ")");
      
      ans = Float.parseFloat(numans);
      changeNumberLine(Float.toString(ans));
   }
   //For 2
   public static void changeNumExpo(String NumberLine, String numans)
   {
   
      a = Float.parseFloat(NumberLine);
      b = (float)2;
      ans = Float.parseFloat(numans);
      
      showValuePanel.seta(a);
      showValuePanel.setb(b);
      showValuePanel.setSign(7);
      changeNumberLine(numans);
   }  
   
   //For any other number
   public static void changeNumExpo(String NumberLine)
   {
      sit = 5;
      a = Float.parseFloat(NumberLine);
      b = (float)0;
      ans = (float)0;
      
      showValuePanel.seta(a);
      showValuePanel.setb(b);
      showValuePanel.setSign(7);
      changeNumberLine(Float.toString(ans));
   }
}