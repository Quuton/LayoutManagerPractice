package ui.customernote;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class CustomerNote extends JPanel{
    JLabel notesLabel = new JLabel("Notes:");
    JLabel addDateLabel = new JLabel("Add Date:");
    JLabel modifiedDateLabel = new JLabel("Modified Date:");
    JLabel initialDateLabel = new JLabel("Initial Date at Customer:");
    JTextArea notesTextArea = new JTextArea(null, 10, 95);
    JTextField addDateTextField = new JTextField(10);
    JTextField modifiedDateTextField = new JTextField(10);
    JTextField initialDateTextField = new JTextField(10);
    public CustomerNote() {
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 20));
        this.add(notesLabel);
        this.add(notesTextArea);
        this.add(addDateLabel);
        this.add(addDateTextField);
        this.add(modifiedDateLabel);
        this.add(modifiedDateTextField);
        this.add(initialDateLabel);
        this.add(initialDateTextField);
    }
}
