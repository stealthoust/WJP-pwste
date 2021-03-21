import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class Window extends Frame implements WindowListener, ActionListener {

    public Window() throws HeadlessException {
        super();
        setBounds(1250, 250, 500, 250);
        setVisible(true);
        this.addWindowListener(this);

        Button rainbowButton = new Button("Hello world!");
        rainbowButton.setBounds(100, 50, 200, 25);
        rainbowButton.setVisible(true);
        add(rainbowButton);

        this.setLayout(null);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
        setTitle("Przycisk wciśnięty");
    }

    public static void main(String[] args) throws Exception {
        Window win = new Window();
    }
}
