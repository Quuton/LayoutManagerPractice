package ui.customerform.editor;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

public class Personal extends JPanel{
    JLabel birthDateLabel = new JLabel("Birth Date:");
    JLabel dietaryLabel = new JLabel("Dietary Restrictions:");
    JLabel heightLabel = new JLabel("Height Inches:");
    JLabel weightLabel = new JLabel("Weight Pounds:");

    JDateChooser birthDateDateChooser = new JDateChooser();
    JTextField dietaryComboBox = new JTextField("Allergic to shellfish", 30);
    JTextField heightComboBox = new JTextField("75", 30);
    JTextField weightComboBox = new JTextField("100", 30);



    public Personal(){
        this.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.setLayout(new GridBagLayout());

        GridBagConstraints birthDateLabelConstraints = new GridBagConstraints();
        birthDateLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        birthDateLabelConstraints.insets = new Insets(10, 10, 10, 10);
        birthDateLabelConstraints.anchor = GridBagConstraints.WEST;
        birthDateLabelConstraints.gridx = 0;
        birthDateLabelConstraints.gridy = 0;
        birthDateLabelConstraints.gridwidth = 1;
        this.add(birthDateLabel, birthDateLabelConstraints);

        GridBagConstraints dietaryLabelConstraints = new GridBagConstraints();
        dietaryLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        dietaryLabelConstraints.insets = new Insets(10, 10, 10, 10);
        dietaryLabelConstraints.anchor = GridBagConstraints.WEST;
        dietaryLabelConstraints.gridx = 0;
        dietaryLabelConstraints.gridy = 1;
        dietaryLabelConstraints.gridwidth = 1;
        this.add(dietaryLabel, dietaryLabelConstraints);

        GridBagConstraints heightLabelConstraints = new GridBagConstraints();
        heightLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        heightLabelConstraints.insets = new Insets(10, 10, 10, 10);
        heightLabelConstraints.anchor = GridBagConstraints.WEST;
        heightLabelConstraints.gridx = 0;
        heightLabelConstraints.gridy = 2;
        heightLabelConstraints.gridwidth = 1;
        this.add(heightLabel, heightLabelConstraints);

        GridBagConstraints weightLabelConstraints = new GridBagConstraints();
        weightLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
        weightLabelConstraints.insets = new Insets(10, 10, 10, 10);
        weightLabelConstraints.anchor = GridBagConstraints.WEST;
        weightLabelConstraints.gridx = 0;
        weightLabelConstraints.gridy = 3;
        weightLabelConstraints.gridwidth = 1;
        this.add(weightLabel, weightLabelConstraints);

        GridBagConstraints birthDateDateChooserConstraints = new GridBagConstraints();
        birthDateDateChooserConstraints.fill = GridBagConstraints.HORIZONTAL;
        birthDateDateChooserConstraints.insets = new Insets(10, 10, 10, 10);
        birthDateDateChooserConstraints.anchor = GridBagConstraints.CENTER;
        birthDateDateChooserConstraints.gridx = 1;
        birthDateDateChooserConstraints.gridy = 0;
        birthDateDateChooserConstraints.gridwidth = 2;
        this.add(birthDateDateChooser, birthDateDateChooserConstraints);

        GridBagConstraints dietaryComboBoxConstraints = new GridBagConstraints();
        dietaryComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        dietaryComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        dietaryComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        dietaryComboBoxConstraints.gridx = 1;
        dietaryComboBoxConstraints.gridy = 1;
        dietaryComboBoxConstraints.gridwidth = 2;
        this.add(dietaryComboBox, dietaryComboBoxConstraints);

        GridBagConstraints heightComboBoxConstraints = new GridBagConstraints();
        heightComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        heightComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        heightComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        heightComboBoxConstraints.gridx = 1;
        heightComboBoxConstraints.gridy = 2;
        heightComboBoxConstraints.gridwidth = 2;
        this.add(heightComboBox, heightComboBoxConstraints);

        GridBagConstraints weightComboBoxConstraints = new GridBagConstraints();
        weightComboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
        weightComboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        weightComboBoxConstraints.anchor = GridBagConstraints.CENTER;
        weightComboBoxConstraints.gridx = 1;
        weightComboBoxConstraints.gridy = 3;
        weightComboBoxConstraints.gridwidth = 2;
        this.add(weightComboBox, weightComboBoxConstraints);
        
       
    }
}
