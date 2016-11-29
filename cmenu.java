import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class cmenu extends JFrame
{

   private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, bp;
   private JButton plus, sub, mutli, divde, equal;
   private JPanel numPanel, signPanel, savePanel;
   private JPanel BigPanel;
   private JButton s1, s2, s3, s4, s5;
   private JButton n1, n2, n3, n4, n5;
   private String sn1, sn2, sn3, sn4, sn5;
   private int f = 0;
   private static float temp;
   private static String NumberLine = "";
   
   public cmenu()
   {  
      setTitle("Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800, 500);
      setLayout(new BorderLayout());
      
      BigPanel = new JPanel();
      BigPanel.setPreferredSize(new Dimension(500, 500));
      BigPanel.setLayout(new BorderLayout());
      
      buildNum();
      buildSign();
      buildSave();
      showPanel.buildPanel();
      
      functionmenu.buildPanel();
      
      BigPanel.add(numPanel, BorderLayout.WEST);
      BigPanel.add(showPanel.getPanel(), BorderLayout.NORTH);
      BigPanel.add(signPanel, BorderLayout.CENTER);
      BigPanel.add(savePanel, BorderLayout.SOUTH);
      
      add(BigPanel, BorderLayout.CENTER);
      add(functionmenu.getPanel(), BorderLayout.EAST);
     
      setVisible(true);
   }
   
      
   public void buildNum()
   {
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
      b0 = new JButton("0");
      bc = new JButton("C");
      bp = new JButton(".");
      
      b1.setFont(new Font("Cooper Black", Font.PLAIN, 50));  
      b2.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b3.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b4.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b5.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b6.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b7.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b8.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      b9.setFont(new Font("Cooper Black", Font.PLAIN, 50)); 
      b0.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      bc.setFont(new Font("Cooper Black", Font.PLAIN, 50));  
      bp.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      
      b0.addActionListener(new NumListener());
      b1.addActionListener(new NumListener()); 
      b2.addActionListener(new NumListener());
      b3.addActionListener(new NumListener());
      b4.addActionListener(new NumListener());
      b5.addActionListener(new NumListener());
      b6.addActionListener(new NumListener());
      b7.addActionListener(new NumListener());
      b8.addActionListener(new NumListener());
      b9.addActionListener(new NumListener());
      bc.addActionListener(new NumListener());
      bp.addActionListener(new NumListener());
      
      bc.addActionListener(new SignListener());
            
      numPanel = new JPanel();
      numPanel.setLayout(new GridLayout(4,3));
      numPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
      numPanel.setPreferredSize(new Dimension(300, 300));
      
      numPanel.add(b7);
      numPanel.add(b8);
      numPanel.add(b9);
      numPanel.add(b4);
      numPanel.add(b5);
      numPanel.add(b6);
      numPanel.add(b1);
      numPanel.add(b2);
      numPanel.add(b3);
      numPanel.add(b0);
      numPanel.add(bc);
      numPanel.add(bp);
   }
   
   public void buildSign()
   {
      signPanel = new JPanel();
      signPanel.setLayout(new GridLayout(5,1));
      signPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
      signPanel.setPreferredSize(new Dimension(100, 300));
      
      plus = new JButton("+");
      sub = new JButton("-");
      mutli = new JButton("*");
      divde = new JButton("/");
      equal = new JButton("=");
      
      plus.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      sub.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      mutli.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      divde.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      equal.setFont(new Font("Cooper Black", Font.PLAIN, 50));
      
      plus.addActionListener(new SignListener());
      sub.addActionListener(new SignListener());
      mutli.addActionListener(new SignListener());
      divde.addActionListener(new SignListener());
      equal.addActionListener(new SignListener());
      
      signPanel.add(plus);
      signPanel.add(sub);
      signPanel.add(mutli);
      signPanel.add(divde);
      signPanel.add(equal);
   }
   
   public void buildSave()
   {
      savePanel = new JPanel();
      savePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
      savePanel.setLayout(new BorderLayout());
      savePanel.setPreferredSize(new Dimension(500, 100));
      
      JPanel upper = new JPanel();
      JPanel lower = new JPanel();
      upper.setLayout(new GridLayout(1, 5));
      lower.setLayout(new GridLayout(1, 5));
      
      s1 = new JButton("save");
      s2 = new JButton("save");
      s3 = new JButton("save");
      s4 = new JButton("save");
      s5 = new JButton("save");
      
      n1 = new JButton("--");
      n2 = new JButton("--");
      n3 = new JButton("--");
      n4 = new JButton("--");
      n5 = new JButton("--");
   
      n1.setPreferredSize(new Dimension(100, 60));
      n2.setPreferredSize(new Dimension(100, 60));
      n3.setPreferredSize(new Dimension(100, 60));
      n4.setPreferredSize(new Dimension(100, 60));
      n5.setPreferredSize(new Dimension(100, 60));
      s1.setPreferredSize(new Dimension(100, 40));
      s2.setPreferredSize(new Dimension(100, 40));
      s3.setPreferredSize(new Dimension(100, 40));
      s4.setPreferredSize(new Dimension(100, 40));
      s5.setPreferredSize(new Dimension(100, 40));
      
      s1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      s2.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      s3.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      s4.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      s5.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      n1.setFont(new Font("Cooper Black", Font.PLAIN, 15));
      n2.setFont(new Font("Cooper Black", Font.PLAIN, 15));
      n3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
      n4.setFont(new Font("Cooper Black", Font.PLAIN, 15));
      n5.setFont(new Font("Cooper Black", Font.PLAIN, 15));
      
      s1.addActionListener(new SaveListener());
      s2.addActionListener(new SaveListener());
      s3.addActionListener(new SaveListener());
      s4.addActionListener(new SaveListener());
      s5.addActionListener(new SaveListener());
      
      n1.addActionListener(new NumListener());
      n2.addActionListener(new NumListener());
      n3.addActionListener(new NumListener());
      n4.addActionListener(new NumListener());
      n5.addActionListener(new NumListener());
     
      upper.add(n1);
      upper.add(n2);
      upper.add(n3);
      upper.add(n4);
      upper.add(n5);
      lower.add(s1);
      lower.add(s2);
      lower.add(s3);
      lower.add(s4);
      lower.add(s5);
      
      savePanel.add(upper, BorderLayout.CENTER);
      savePanel.add(lower, BorderLayout.SOUTH);
   
   }
   
   
   //Listener below
   public class SaveListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == s1)
         {
            n1.setText(NumberLine);
            sn1 = NumberLine;
         }
         else if (e.getSource() == s2)
         {
            n2.setText(NumberLine);
            sn2 = NumberLine;
         }
         else if (e.getSource() == s3)
         {
            n3.setText(NumberLine);
            sn3 = NumberLine;
         }
         else if (e.getSource() == s4)
         {
            n4.setText(NumberLine);
            sn4 = NumberLine;
         }
         else if (e.getSource() == s5)
         {
            n5.setText(NumberLine);
            sn5 = NumberLine;
         }
      }
   }
   
   public class SignListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == plus)
         {
            f = 1;
         }
         else if (e.getSource() == sub)
         {
            f = 2;        
         }
         else if (e.getSource() == mutli)
         {
            f = 3;
         }
         else if (e.getSource() == divde)
         {
            f = 4;
         }
         else if (e.getSource() == equal)
         {
            f = 5;
         }
         else if (e.getSource() == bc)
         {
            f = 6;
         }
      
         NumberLine = showPanel.Calculate(f, NumberLine);
         showPanel.changeNumberLine(NumberLine);
      }
   }
  
   public class NumListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == b0)
         {
            NumberLine = NumberLine + "0";           
         }
         else if (e.getSource() == b1)
         {
            NumberLine = NumberLine + "1";
         }
         else if (e.getSource() == b2)
         {
            NumberLine = NumberLine + "2";
         }
         else if (e.getSource() == b3)
         {
            NumberLine = NumberLine + "3";
         }
         else if (e.getSource() == b4)
         {
            NumberLine = NumberLine + "4";
         }
         else if (e.getSource() == b5)
         {
            NumberLine = NumberLine + "5";
         }
         else if (e.getSource() == b6)
         {
            NumberLine = NumberLine + "6";
         }
         else if (e.getSource() == b7)
         {
            NumberLine = NumberLine + "7";
         }
         else if (e.getSource() == b8)
         {
            NumberLine = NumberLine + "8";
         }
         else if (e.getSource() == b9)
         {
            NumberLine = NumberLine + "9";
         }
         else if (e.getSource() == b0)
         {
            NumberLine = NumberLine + "0";
         }
         else if (e.getSource() == bc)
         {
            NumberLine = "0";
         }
         else if (e.getSource() == bp)
         {
            NumberLine = NumberLine + ".";
         }
         else if (e.getSource() == n1)
         {
            NumberLine = sn1;
         }
         else if (e.getSource() == n2)
         {
            NumberLine = sn2;
         }
         else if (e.getSource() == n3)
         {
            NumberLine = sn3;
         }
         else if (e.getSource() == n4)
         {
            NumberLine = sn4;
         }
         else if (e.getSource() == n5)
         {
            NumberLine = sn5;
         }
      
         showPanel.changeNumberLine(NumberLine);
      }
   }
   
   //function for the outside class
   public static void setNumberLine(String Num, int c)
   {
      if (c == 1)
      {
         NumberLine = Num;
         showPanel.changeNumberLine(NumberLine);
      }
      else if (c == 2)
      {
         showPanel.changeNumExpo(NumberLine, Num);
         NumberLine = Num;
         showPanel.changeNumberLine(NumberLine);
      }
      else if (c == 3)
      {
         showPanel.changeNumExpo(NumberLine);
         NumberLine = "0";
         showPanel.changeNumberLine("0");
      }
      else if (c == 4)
      {
         showPanel.changeNumExpo(NumberLine, Num, 1);
         NumberLine = Num;
         showPanel.changeNumberLine(NumberLine);
      }
      else if (c == 5)
      {
         showPanel.changeNumExpo(NumberLine, Num, 2);
         NumberLine = Num;
         showPanel.changeNumberLine(NumberLine);
      }
   }
   
   public static void setNumberLine(String Num, int c, int d)
   {
      if (c == 1)
      {  
         if (d == 1)
         {
         showValuePanel.seta("sin");
         }
         else if (d == 2)
         {
         showValuePanel.seta("cos");
         }
         else if (d == 3)
         {
         showValuePanel.seta("tan");
         }
         showValuePanel.setSign(8);
         showValuePanel.setb(NumberLine + ")");
         temp = Float.parseFloat(Num);
         NumberLine = Float.toString(temp);
         showPanel.changeNumberLine(NumberLine);
      }
   }
   
   public static String getNumberLine()
   {
      return NumberLine;
   }

}