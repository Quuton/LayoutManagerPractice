package ui.customerform.selector;
import javax.swing.*;
import java.awt.*;

public class Filter extends JPanel{
    JRadioButton customersOnlyRadio = new JRadioButton("Customers Only");
    JRadioButton customersTripRadio = new JRadioButton("Customers on a Trip");
    JRadioButton allRadio = new JRadioButton("All Contacts");
    ButtonGroup filterButtonGroup = new ButtonGroup();
    JComboBox<String> customersTripComboBox = new JComboBox<String>();
    public Filter() {
        this.setBorder(BorderFactory.createTitledBorder("Filter"));

        filterButtonGroup.add(customersOnlyRadio);
        filterButtonGroup.add(customersTripRadio);
        filterButtonGroup.add(allRadio);
        this.setLayout(new GridBagLayout());

        GridBagConstraints customersOnlyRadioConstraints = new GridBagConstraints();
        customersOnlyRadioConstraints.gridx = 0;
        customersOnlyRadioConstraints.gridy = 0;
        customersOnlyRadioConstraints.gridwidth = 1;
        customersOnlyRadioConstraints.weightx = 0;
        customersOnlyRadioConstraints.anchor = GridBagConstraints.LINE_START;
        customersOnlyRadioConstraints.insets = new Insets(10, 10, 10, 10);

        this.add(customersOnlyRadio, customersOnlyRadioConstraints);

        GridBagConstraints customersTripRadioConstraints = new GridBagConstraints();
        customersTripRadioConstraints.gridx = 0;
        customersTripRadioConstraints.gridy = 1;
        customersTripRadioConstraints.gridwidth = 1;
        customersTripRadioConstraints.weightx = 0;
        customersTripRadioConstraints.anchor = GridBagConstraints.LINE_START;
        customersTripRadioConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(customersTripRadio, customersTripRadioConstraints);

        GridBagConstraints allRadioConstraints = new GridBagConstraints();
        allRadioConstraints.gridx = 0;
        allRadioConstraints.gridy = 2;
        allRadioConstraints.gridwidth = 1;
        allRadioConstraints.weightx = 0;
        allRadioConstraints.anchor = GridBagConstraints.LINE_START;
        allRadioConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(allRadio, allRadioConstraints);

        customersTripComboBox.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        GridBagConstraints customersTripComboBoxConstraints = new GridBagConstraints();
        customersTripComboBoxConstraints.gridx = 1;
        customersTripComboBoxConstraints.gridy = 1;
        customersTripComboBoxConstraints.gridwidth = 2;
        customersTripComboBoxConstraints.gridheight = 1;
        customersTripComboBoxConstraints.weighty = 0;
        customersTripComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(customersTripComboBox, customersTripComboBoxConstraints);
       

    }
    
}
