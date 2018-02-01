import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by IntelliJ IDEA.
 * User: student
 * Date: 14.05.14
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
public class ButtonTest
{
    public static void main (String [] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
             public void run()
             {
                 ButtonFrame frame=new ButtonFrame();
                 frame.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
                 frame.setVisible(true);
             }
        });
    }
}

class ButtonFrame extends JFrame
{
    public ButtonFrame ()
    {
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        // Создание кнопок.
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton ("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();

        // Добавление кнопок к панели.
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton) ;
        buttonPanel.add(redButton);

        // Добавление панели к фрейму.
        add(buttonPanel);

        // Создание действий кнопок.
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction (Color.BLUE);
        ColorAction redAction = new ColorAction (Color. RED);

        // Связывание действий с кнопками. .
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener
    {
        public ColorAction (Color c)
        {
            backgroundColor = c;
        }
        public void actionPerformed (ActionEvent event)
        {
            buttonPanel.setBackground(backgroundColor);
        }
        private Color backgroundColor;
    }

    private JPanel buttonPanel;
    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 400;
}

