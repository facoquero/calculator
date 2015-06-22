package calculate.com.mn.view;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class AbstractExample {

    private static final String LAF_CLASS = "javax.swing.plaf.metal.MetalLookAndFeel";
//	private static final String LAF_CLASS = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
//	private static final String LAF_CLASS = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
//	private static final String LAF_CLASS = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
//	private static final String LAF_CLASS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";


    private void showFrame(String title, JComponent content) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(content);
        frame.setJMenuBar(createMenuBar());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(LAF_CLASS);
        } catch (Exception e) {
            System.err.println("Cannot install L&F\n" + e);
        }
    }

    protected JPanel createPanelWithTitle(String title, JComponent... components) {
        JPanel panel = new JPanel();
        for (JComponent component : components) {
            panel.add(component);
        }
        panel.setBorder(BorderFactory.createTitledBorder(title));
        return panel;
    }

    protected abstract String getName();

    protected abstract JComponent createContent();

    protected JMenuBar createMenuBar() {
        return null;
    }

    public void createAndShowGui() {
        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();
            showFrame(getName(), createContent());
        });
    }

}