package ui.customerform;
import java.awt.*;
import javax.swing.*;
import ui.customerform.selector.Selector;
import ui.customerform.editor.Editor;

public class CustomerForm extends JPanel{
    public CustomerForm() {
        this.setLayout(new BorderLayout());
        this.add(new Selector(), BorderLayout.NORTH);
        this.add(new Editor(), BorderLayout.SOUTH);
    }
}
