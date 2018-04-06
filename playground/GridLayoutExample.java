import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class GridLayoutExample extends JApplet {

    public GridLayoutExample() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 4));
        c.add(new JButton("One"));
        c.add(new JButton("Two"));
        c.add(new JButton("Three"));
        c.add(new JButton("Four"));
        c.add(new JButton("Five"));
    }
}
