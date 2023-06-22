package ui.customerform.selector;

import javax.swing.*;
import java.awt.*;

public class Selector extends JPanel {
    public Selector() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createRaisedBevelBorder());

        GridBagConstraints customerConstraints = new GridBagConstraints();
        customerConstraints.insets = new Insets(10, 10, 10, 10);
        customerConstraints.gridx = 0;
        customerConstraints.gridy = 0;
        customerConstraints.gridwidth = 2;
        customerConstraints.weightx = 1;
        this.add(new Customer(), customerConstraints);

        GridBagConstraints filterConstraints = new GridBagConstraints();
        filterConstraints.insets = new Insets(10, 10, 10, 10);
        filterConstraints.gridx = 2;
        filterConstraints.gridy = 0;
        filterConstraints.gridwidth = 2;
        filterConstraints.weightx = 1;
        this.add(new Filter(), filterConstraints);

        GridBagConstraints saveConstraints = new GridBagConstraints();
        saveConstraints.insets = new Insets(10, 10, 10, 10);
        saveConstraints.gridx = 4;
        saveConstraints.gridy = 0;
        saveConstraints.gridwidth = 1;
        saveConstraints.anchor = GridBagConstraints.CENTER;
        this.add(new Save(), saveConstraints);

    }
}