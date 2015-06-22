package calculate.com.mj;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class AbstractExample {

    private static final String LAF_CLASS = "javax.swing.plaf.metal.MetalLookAndFeel";


    private void showFrame(String title, JComponent content) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(content);
        frame.setJMenuBar(createMenuBar());

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent paramWindowEvent) {
                super.windowClosing(paramWindowEvent);
                askForKill();
            }

        });

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    protected void askForKill() {
        int result = JOptionPane.showConfirmDialog(null, "Are you sure, that you want exit?", null, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
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

    public abstract JComponent createContent();

    protected JMenuBar createMenuBar() {
        JMenuBar mainBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        mainBar.add(fileMenu);

        JMenuItem open = new JMenuItem("Open ...");
        JMenuItem exit = new JMenuItem("Exit");

        fileMenu.add(open);
        fileMenu.add(new JSeparator());
        fileMenu.add(exit);

        JMenu help = new JMenu("Help");
        mainBar.add(help);

        JMenuItem about = new JMenuItem("About");
        help.add(about);

        return mainBar;
    }


    public void createAndShowGui() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setLookAndFeel();
                showFrame(getName(), createContent());
            }
        });
    }

    public void showGui(final JComponent createdContent) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setLookAndFeel();
                showFrame(getName(), createdContent);
            }
        });
    }

}