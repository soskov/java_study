import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class ButtonTest
{
  public static void main(String [] args)
    {
      ButtonFrame frame = new ButtonFrame ();
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}


class ButtonFrame extends JFrame
{
    JButton Button1 = new JButton("Круг");
    JButton Button2 = new JButton ("Овал");
    JButton Button3 = new JButton("Квадрат");
    JPanel Buttonpanel = new JPanel();

    ButtonFrame ()
    {

        setTitle("ButtonTest");
        setSize(500, 300);

        Buttonpanel.add(Button1);
        Buttonpanel.add(Button2);
        Buttonpanel.add(Button3);
        Buttonpanel.setBackground(Color.green);
        add(Buttonpanel);

        ActionListener listener1 = new ActionListener( )
        {
            public void actionPerformed(ActionEvent e)
            {
                pnl panel = new pnl(new Ellipse2D.Double(30,100, 120,120));
                panel.paintComponent(getGraphics());
            }
        };
        Button1.addActionListener(listener1);

        ActionListener listener2 = new ActionListener( )
        {
            public void actionPerformed(ActionEvent e)
            {
                pnl panel = new pnl(new Ellipse2D.Double(170,120, 150,75));
                panel.paintComponent(getGraphics());
            }
        };
        Button2.addActionListener(listener2);

        ActionListener listener3 = new ActionListener( )
        {
            public void actionPerformed(ActionEvent e)
            {
                pnl panel = new pnl(new Rectangle2D.Double(350,100, 120,120));
                panel.paintComponent(getGraphics());
            }
        };
        Button3.addActionListener(listener3);
    }


}
class pnl extends JPanel
{
    pnl(Shape shape)
    {
         sh = shape;
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponents(g);
        g.setColor(Color.BLUE);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(sh);
    }
    Shape sh;

}
