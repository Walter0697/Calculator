import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.lang.Math;

public class functionmenu
{
   private static JPanel bigp;
   private static JButton bsin, bcos, btan, bsquare, bexpo;
   private static JButton bpi, bsqrt, blog, be;
   private static float temp;
   private static String temps;
   
   public static void buildPanel()
   {
      bigp = new JPanel();
      bigp.setPreferredSize(new Dimension(300, 500));
      bigp.setLayout(new GridLayout(3,3));
      bigp.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
   
      bsin = new JButton("sin");
      bsin.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bsin.addActionListener(new tricoListener());
      
      bcos = new JButton("cos");
      bcos.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bcos.addActionListener(new tricoListener());
      
      btan = new JButton("tan");
      btan.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      btan.addActionListener(new tricoListener());
      
      bsquare = new JButton("^2");
      bsquare.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bsquare.addActionListener(new squareListener());
      
      bexpo = new JButton("^");
      bexpo.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bexpo.addActionListener(new squareListener());
      
      bpi = new JButton("pi");
      bpi.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bpi.addActionListener(new piListener());
      
      bsqrt = new JButton("¡Ì");
      bsqrt.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      bsqrt.addActionListener(new squareListener());
      
      blog = new JButton("log");
      blog.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      blog.addActionListener(new squareListener());
      
      be = new JButton("e");
      be.setFont(new Font("Cooper Black", Font.PLAIN, 30));
      be.addActionListener(new piListener());
      
      bigp.add(bsqrt);
      bigp.add(bsquare);
      bigp.add(bexpo);
      
      bigp.add(bsin);
      bigp.add(bcos);
      bigp.add(btan);
      
      bigp.add(bpi);
      bigp.add(blog);
      bigp.add(be);
      
   }
   
   public static class piListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == bpi)
         {
            temp = (float)Math.PI;
            temps = Float.toString(temp);
            
            cmenu.setNumberLine(temps, 1);
         }
         else if (e.getSource() == be)
         {
            temp = (float)Math.E;
            temps = Float.toString(temp);
            
            cmenu.setNumberLine(temps, 1);
         }
      }
   }
   public static class squareListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == bsquare)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.pow(temp, 2);
            temps = Float.toString(temp);
            cmenu.setNumberLine(temps, 2);
         }
         else if (e.getSource() == bexpo)
         {
            temps = cmenu.getNumberLine();
            cmenu.setNumberLine(temps, 3);
         }
         else if (e.getSource() == bsqrt)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.sqrt(temp);
            temps = Float.toString(temp);
            cmenu.setNumberLine(temps, 4);
         }
         else if (e.getSource() == blog)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.log(temp);
            temps = Float.toString(temp);
            cmenu.setNumberLine(temps, 5);
         }
      }
   }
   
   public static class tricoListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == bsin)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.sin(temp);
            temps = Float.toString(temp);

            cmenu.setNumberLine(temps, 1, 1);
         }
         else if (e.getSource() == bcos)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.cos(temp);
            temps = Float.toString(temp);

            cmenu.setNumberLine(temps, 1, 2);
         }
         else if (e.getSource() == btan)
         {
            temp = Float.parseFloat(cmenu.getNumberLine());
            temp = (float)Math.tan(temp);
            temps = Float.toString(temp);

            cmenu.setNumberLine(temps, 1, 3);
         }
      }
   }

   public static JPanel getPanel()
   {
      return bigp;
   }
}