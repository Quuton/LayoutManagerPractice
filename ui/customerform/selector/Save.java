package ui.customerform.selector;
import javax.swing.*;
import java.awt.*;

public class Save extends JPanel{
    JButton newButton = new JButton("New Customer");
    JButton saveButton = new JButton("Save Customer");
    public Save() {
        this.setLayout(new GridBagLayout());

        GridBagConstraints newButtonConstraints = new GridBagConstraints();
        newButtonConstraints.gridx = 0;
        newButtonConstraints.gridy = 0;
        newButtonConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(newButton, newButtonConstraints);

        GridBagConstraints saveButtonConstraints = new GridBagConstraints();
        saveButtonConstraints.gridx = 0;
        saveButtonConstraints.gridy = 1;
        saveButtonConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(saveButton, saveButtonConstraints);


    }
}
