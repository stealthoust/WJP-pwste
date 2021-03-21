import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class Window extends Frame implements WindowListener, ActionListener {
    
Button rainbowButton = new Button("Hello world!");
    
    public Window() throws HeadlessException {
        super();
        setBounds(1250, 250, 500, 250);
        setVisible(true);
        this.addWindowListener(this);

        
        rainbowButton.setBounds(100, 50, 200, 25);
        rainbowButton.setVisible(true);
        add(rainbowButton);
       rainbowButton.addActionListener(this);
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
        rainbowButton.setLocation(getX()+5,getY()+5);
        //System.exit(0);
        setTitle("Przycisk wciśnięty");
    }

    public static void main(String[] args) throws Exception {
        Window win = new Window();
    }
}
