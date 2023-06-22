package ui.customerform.editor;

import javax.swing.*;
import java.awt.*;
public class Title extends JPanel {
    JLabel titleLabel = new JLabel("Title:");
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel typeLabel = new JLabel("Customer Type:");

    JTextField titleTextField = new JTextField(20);
    JTextField firstNameTextField = new JTextField("George",20);
    JTextField lastNameTextField = new JTextField("Alderson", 20);
    JComboBox<String> typeComboBox = new JComboBox<String>();



    public Title() {
        typeComboBox.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXX");
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(titleLabel);
        this.add(titleTextField);
        this.add(firstNameLabel);
        this.add(firstNameTextField);
        this.add(lastNameLabel);
        this.add(lastNameTextField);
        this.add(typeLabel);
        this.add(typeComboBox);
    }
    
}
