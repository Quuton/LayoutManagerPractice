import javax.swing.*;
import ui.customerform.CustomerForm;
import ui.customernote.CustomerNote;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    // Hacky way to change the card title
    boolean isCard1 = true;
    

    JFrame mainFrame = new JFrame();
    JFrame toggleFrame = new JFrame("Toggle Card");
    JButton toggleButton = new JButton("Toggle the Card Panel");
    public Main() {
        CardLayout cardLayout = new CardLayout(10, 10);
        mainFrame.setLayout(cardLayout);
        mainFrame.setTitle("Card 1");
        mainFrame.add(new CustomerForm(), "customer_form");
        mainFrame.add(new CustomerNote(), "customer_note");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setPreferredSize(new Dimension(1200, 500));
        mainFrame.pack();
        mainFrame.setVisible(true);
        

        

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTitle();
                cardLayout.next(mainFrame.getContentPane());
            }
        });
        toggleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toggleFrame.getContentPane().add(toggleButton, BorderLayout.CENTER);
        toggleFrame.setSize(225, 100);
        toggleFrame.setLocationRelativeTo(null);
        toggleFrame.setVisible(true);
    }
    private void changeTitle() {
        isCard1 = !isCard1;
        if (isCard1) {
                    mainFrame.setTitle("Card 1");
        } else {
                    mainFrame.setTitle("Card 2");
        }
    }
    public static void main(String[] args) {
        try {
            FlatDarkLaf.setup();
        } catch (Exception e){}
        new Main();
    }
}