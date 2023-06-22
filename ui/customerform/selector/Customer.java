package ui.customerform.selector;
import javax.swing.*;
import java.awt.*;

public class Customer extends JPanel {
    JLabel promptLabel = new JLabel("Select Customer or Contact", JLabel.LEADING);
    JComboBox<String> choiceComboBox = new JComboBox<String>(new String[] {"Alderson.George"});
    public Customer() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints promptLabelConstraints = new GridBagConstraints();
        promptLabelConstraints.gridx = 0;
        promptLabelConstraints.gridy = 0;
        promptLabelConstraints.anchor = GridBagConstraints.LINE_START;
        promptLabelConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(promptLabel, promptLabelConstraints);

        choiceComboBox.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        GridBagConstraints choiceComboBoxConstraints = new GridBagConstraints();
        choiceComboBoxConstraints.gridx = 0;
        choiceComboBoxConstraints.gridy = 1;
        choiceComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(choiceComboBox, choiceComboBoxConstraints);
    }
}
