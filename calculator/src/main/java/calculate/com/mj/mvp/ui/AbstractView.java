package calculate.com.mj.mvp.ui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class AbstractView {

    private static final String LAF_CLASS = "javax.swing.plaf.metal.MetalLookAndFeel";


    private void showFrame(String title, JComponent content) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(content);

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

    public void createAndShowGui() {
        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();
            showFrame(getName(), createContent());
        });
    }

    public void showGui(final JComponent createdContent) {
        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();
            showFrame(getName(), createdContent);
        });
    }

}