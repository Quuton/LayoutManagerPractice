package ui.customerform.editor;

import javax.swing.*;
import java.awt.*;

public class Preferences extends JPanel {
    JLabel primaryActivityLabel = new JLabel("Primary Activity");
    JLabel secondaryActivityLabel = new JLabel("Secondary Activity");
    JLabel primaryDestinationLabel = new JLabel("Primary Destination");
    JLabel secondaryDestinationLabel = new JLabel("Secondary Destination");

    JComboBox<String> primaryActivityComboBox = new JComboBox<String>(new String[] {"Walking Tours"});
    JComboBox<String> secondaryActivityComboBox = new JComboBox<String>(new String[] {"Canoing"});
    JComboBox<String> primaryDestinationComboBox = new JComboBox<String>(new String[] {"Indonesia"});
    JComboBox<String> secondaryDestinationComboBox = new JComboBox<String>(new String[] {"Iceland"});



    public Preferences(){
        this.setBorder(BorderFactory.createTitledBorder("Preferences"));
        this.setLayout(new GridBagLayout());

        GridBagConstraints primaryActivityLabelConstraints = new GridBagConstraints();
        primaryActivityLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        primaryActivityLabelConstraints.insets = new Insets(10, 10, 10, 10);
        primaryActivityLabelConstraints.anchor = GridBagConstraints.WEST;
        primaryActivityLabelConstraints.gridx = 0;
        primaryActivityLabelConstraints.gridy = 0;
        primaryActivityLabelConstraints.gridwidth = 1;
        this.add(primaryActivityLabel, primaryActivityLabelConstraints);

        GridBagConstraints secondaryActivityLabelConstraints = new GridBagConstraints();
        secondaryActivityLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        secondaryActivityLabelConstraints.insets = new Insets(10, 10, 10, 10);
        secondaryActivityLabelConstraints.anchor = GridBagConstraints.WEST;
        secondaryActivityLabelConstraints.gridx = 0;
        secondaryActivityLabelConstraints.gridy = 1;
        secondaryActivityLabelConstraints.gridwidth = 1;
        this.add(secondaryActivityLabel, secondaryActivityLabelConstraints);

        GridBagConstraints primaryDestinationLabelConstraints = new GridBagConstraints();
        primaryDestinationLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        primaryDestinationLabelConstraints.insets = new Insets(10, 10, 10, 10);
        primaryDestinationLabelConstraints.anchor = GridBagConstraints.WEST;
        primaryDestinationLabelConstraints.gridx = 0;
        primaryDestinationLabelConstraints.gridy = 2;
        primaryDestinationLabelConstraints.gridwidth = 1;
        this.add(primaryDestinationLabel, primaryDestinationLabelConstraints);

        GridBagConstraints secondaryDestinationLabelConstraints = new GridBagConstraints();
        secondaryDestinationLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        secondaryDestinationLabelConstraints.insets = new Insets(10, 10, 10, 10);
        secondaryDestinationLabelConstraints.anchor = GridBagConstraints.WEST;
        secondaryDestinationLabelConstraints.gridx = 0;
        secondaryDestinationLabelConstraints.gridy = 3;
        secondaryDestinationLabelConstraints.gridwidth = 1;
        this.add(secondaryDestinationLabel, secondaryDestinationLabelConstraints);

        GridBagConstraints primaryActivityComboBoxConstraints = new GridBagConstraints();
        primaryActivityComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        primaryActivityComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        primaryActivityComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        primaryActivityComboBoxConstraints.gridx = 1;
        primaryActivityComboBoxConstraints.gridy = 0;
        primaryActivityComboBoxConstraints.gridwidth = 2;
        this.add(primaryActivityComboBox, primaryActivityComboBoxConstraints);

        GridBagConstraints secondaryActivityComboBoxConstraints = new GridBagConstraints();
        secondaryActivityComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        secondaryActivityComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        secondaryActivityComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        secondaryActivityComboBoxConstraints.gridx = 1;
        secondaryActivityComboBoxConstraints.gridy = 1;
        secondaryActivityComboBoxConstraints.gridwidth = 2;
        this.add(secondaryActivityComboBox, secondaryActivityComboBoxConstraints);

        GridBagConstraints primaryDestinationComboBoxConstraints = new GridBagConstraints();
        primaryDestinationComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        primaryDestinationComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        primaryDestinationComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        primaryDestinationComboBoxConstraints.gridx = 1;
        primaryDestinationComboBoxConstraints.gridy = 2;
        primaryDestinationComboBoxConstraints.gridwidth = 2;
        this.add(primaryDestinationComboBox, primaryDestinationComboBoxConstraints);

        GridBagConstraints secondaryDestinationComboBoxConstraints = new GridBagConstraints();
        secondaryDestinationComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        secondaryDestinationComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        secondaryDestinationComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        secondaryDestinationComboBoxConstraints.gridx = 1;
        secondaryDestinationComboBoxConstraints.gridy = 3;
        secondaryDestinationComboBoxConstraints.gridwidth = 2;
        this.add(secondaryDestinationComboBox, secondaryDestinationComboBoxConstraints);

        primaryActivityComboBox.setPrototypeDisplayValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        secondaryActivityComboBox.setPrototypeDisplayValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        primaryDestinationComboBox.setPrototypeDisplayValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        secondaryDestinationComboBox.setPrototypeDisplayValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
