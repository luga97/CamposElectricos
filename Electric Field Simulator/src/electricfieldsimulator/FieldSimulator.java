package electricfieldsimulator;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Tiger He, Jeff Niu
 */
public class FieldSimulator extends JFrame {

    /**
     * @author Tiger He
     */
    public static Dimension size; // size of the window

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FieldSimulator fieldSim = new FieldSimulator();
    }
    /**
     * @author Tiger He
     */
    public ElectricDisplay electricDisplay; // display panel

    /**
     * @author Tiger He=
     */
    public FieldSimulator() {
        super();
        electricDisplay = new ElectricDisplay(this);

        // set window properties
        super.setTitle("Simulador de campo electrico");
        size = new Dimension(1600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(size);
        setPreferredSize(size);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        // set initial state to log in screen
        setContentPane(electricDisplay);
        pack();
    }

}
