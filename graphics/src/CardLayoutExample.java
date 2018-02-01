import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CardLayoutExample extends JPanel {
    public static void main(String[] args)
    {

        CardFrame frame = new CardFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CardFrame extends JFrame{

    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    CardLayout cards=new CardLayout();
    JPanel cardPanel;

    class ButtonFrame2 extends JFrame
    {

    }

    CardFrame(){

        setTitle("Card Layout");
        setSize(750, 600);

        //додаємо у вікно панель

    }
}