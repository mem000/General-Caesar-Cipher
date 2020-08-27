/*
additional file for test purposes
 */
package temp_4_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author: Mahmoud Esmat
 */
public class NativeOpenDialogDemo {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                final JFrame frame = new JFrame();
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    // do something
                }
            }
        });
    }
}
