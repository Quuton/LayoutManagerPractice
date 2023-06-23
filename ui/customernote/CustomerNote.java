package ui.customernote;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class CustomerNote extends JPanel{
    JLabel notesLabel = new JLabel("Notes:");
    JLabel addDateLabel = new JLabel("Add Date:");
    JLabel modifiedDateLabel = new JLabel("Modified Date:");
    JLabel initialDateLabel = new JLabel("Initial Date at Customer:");
    JTextArea notesTextArea = new JTextArea(null, 10, 95);
    DateFormat df = new SimpleDateFormat("mmm/dd/yyyy");

    JDateChooser addDateDateChooser = new JDateChooser();
    JDateChooser modifiedDateDateChooser = new JDateChooser();
    JDateChooser initialDateDateChooser = new JDateChooser();
    
    public CustomerNote() {
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 20));
        this.add(notesLabel);
        this.add(notesTextArea);
        this.add(addDateLabel);
        this.add(addDateDateChooser);
        this.add(modifiedDateLabel);
        this.add(modifiedDateDateChooser);
        this.add(initialDateLabel);
        this.add(initialDateDateChooser);
    }
}
