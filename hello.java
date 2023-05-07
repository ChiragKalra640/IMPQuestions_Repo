import javax.swing.*;
import java.awt.event.*;
class ThisAsArrgument implements ActionListener
{
  JTextField tf;
  ThisAsArrgument()
  {
    JFrame jf = new JFrame("Operation Perform");
    tf = new JTextField();
    tf.setBounds(100,100,120,30);
    JButton jb = new JButton("Click Me!");
    jb.setBounds(100,150,100,50);
    jb.addActionListener(this);
    jf.add(tf);jf.add(jb);
    jf.setSize(500,400);
    jf.setLayout(null);
    jf.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    tf.setText("Welcome to Ducat ");
  }
  
  public static void main(String[] args)
  {
    new ThisAsArrgument();
  }
}
