package ui.customerform.editor;
import javax.swing.*;
import java.awt.*;

public class Editor extends JPanel{
    JPanel tempPanel = new JPanel();
    public Editor() {
        this.setLayout(new BorderLayout());
        this.add(new Title(), BorderLayout.NORTH);
        tempPanel.setLayout(new GridLayout(1, 2, 20, 20));
        tempPanel.add(new Preferences());
        tempPanel.add(new Personal());
        this.add(tempPanel, BorderLayout.SOUTH);
        }   
    
}
