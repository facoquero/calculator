package calculate.com.mn.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;

public class Calculator implements CalculatorDisplay {

    private static final String LAF_CLASS = "javax.swing.plaf.metal.MetalLookAndFeel";
    private JTextField displayTextField;

    protected String getName() {
        return null;
    }

    protected JComponent createContent() {
        JPanel mainContentPanel = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainContentPanel.setLayout(gridBagLayout);
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        mainContentPanel.add(createDisplayPanel(), constraints);
        constraints.gridy = 1;
        mainContentPanel.add(createKeyboardPanel(), constraints);
        return mainContentPanel;
    }

    private JComponent createDisplayPanel() {
        displayTextField = new JTextField();
        displayTextField.setEditable(false);
        return displayTextField;
    }

    private JComponent createKeyboardPanel() {
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.add(createNumericKeyboard());
        keyboardPanel.add(createOperationKeyboard());
        return keyboardPanel;
    }

    private JComponent createOperationKeyboard() {
        JPanel operationKeyboard = new JPanel();
        BoxLayout boxLayout = new BoxLayout(operationKeyboard, BoxLayout.PAGE_AXIS);
        operationKeyboard.setLayout(boxLayout);
        JButton clearButton = new JButton("C");
        operationKeyboard.add(clearButton);
        JButton allClearButton = new JButton("AC");
        registerListenerForAllClearButton(allClearButton);
        operationKeyboard.add(allClearButton);
        JButton openingParenthesisButton = new JButton("(");
        operationKeyboard.add(openingParenthesisButton);
        JButton closingParenthesisButton = new JButton(")");
        operationKeyboard.add(closingParenthesisButton);
        JButton plusMinusButton = new JButton("+/-");
        operationKeyboard.add(plusMinusButton);

        return operationKeyboard;

    }

    private JComponent createNumericKeyboard() {
        JPanel mainKeyboardPanel = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();
        Collection<JButton> digitButtons = new ArrayList<>();
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainKeyboardPanel.setLayout(gridBagLayout);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        JButton percentButton = new JButton("%");
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainKeyboardPanel.add(percentButton, constraints);

        JButton divideButton = new JButton("/");
        constraints.gridx = 1;
        mainKeyboardPanel.add(divideButton, constraints);

        JButton multiplyButton = new JButton("*");
        constraints.gridx = 2;
        mainKeyboardPanel.add(multiplyButton, constraints);

        JButton subtractButton = new JButton("-");
        constraints.gridx = 3;
        mainKeyboardPanel.add(subtractButton, constraints);

        JButton numeric7Button = new JButton("7");
        constraints.gridx = 0;
        constraints.gridy = 1;
        digitButtons.add(numeric7Button);
        mainKeyboardPanel.add(numeric7Button, constraints);

        JButton numeric8Button = new JButton("8");
        constraints.gridx = 1;
        digitButtons.add(numeric8Button);
        mainKeyboardPanel.add(numeric8Button, constraints);

        JButton numeric9Button = new JButton("9");
        constraints.gridx = 2;
        digitButtons.add(numeric9Button);
        mainKeyboardPanel.add(numeric9Button, constraints);

        JButton plusButton = new JButton("+");
        constraints.gridx = 3;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.weighty = 2;
        mainKeyboardPanel.add(plusButton, constraints);

        JButton numeric4Button = new JButton("4");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridheight = 1;
        constraints.weighty = 1;
        constraints.gridx = 0;
        constraints.gridy = 2;
        digitButtons.add(numeric4Button);
        mainKeyboardPanel.add(numeric4Button, constraints);

        JButton numeric5Button = new JButton("5");
        constraints.gridx = 1;
        digitButtons.add(numeric5Button);
        mainKeyboardPanel.add(numeric5Button, constraints);

        JButton numeric6Button = new JButton("6");
        constraints.gridx = 2;
        digitButtons.add(numeric6Button);
        mainKeyboardPanel.add(numeric6Button, constraints);

        JButton numeric3Button = new JButton("3");
        constraints.gridx = 0;
        constraints.gridy = 3;
        digitButtons.add(numeric3Button);
        mainKeyboardPanel.add(numeric3Button, constraints);

        JButton numeric2Button = new JButton("2");
        constraints.gridx = 1;
        digitButtons.add(numeric2Button);
        mainKeyboardPanel.add(numeric2Button, constraints);

        JButton numeric1Button = new JButton("1");
        constraints.gridx = 2;
        digitButtons.add(numeric1Button);
        mainKeyboardPanel.add(numeric1Button, constraints);

        JButton equalsButton = new JButton("=");
        constraints.gridx = 3;
        constraints.gridheight = 2;
        constraints.weighty = 2;
        constraints.fill = GridBagConstraints.VERTICAL;
        mainKeyboardPanel.add(equalsButton, constraints);

        JButton numeric0Button = new JButton("0");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weighty = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        digitButtons.add(numeric0Button);
        mainKeyboardPanel.add(numeric0Button, constraints);

        JButton commaButton = new JButton(",");
        constraints.gridx = 2;
        constraints.weighty = 1;
        constraints.gridwidth = 1;
        mainKeyboardPanel.add(commaButton, constraints);

        registerListenersForDigitButtons(digitButtons);


        return mainKeyboardPanel;


    }

    private void registerListenersForDigitButtons(
            Collection<JButton> digitButtons) {
        for (JButton digitButton : digitButtons) {
            digitButton.addActionListener(new NumericButtonsListener());
        }

    }

    private void registerListenerForAllClearButton(JButton allClearButton) {
        allClearButton.addActionListener(new AllClearButtonListener());
    }

    public static void main(String[] args) {
        new Calculator().createAndShowGui();

    }

    protected JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        return menuBar;


    }

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

    public void createAndShowGui() {
        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();
            showFrame(getName(), createContent());
        });
    }

    @Override
    public double getEnteredNumber() {
        String enteredNumberString = displayTextField.getText();
        double enteredNumber = Double.valueOf(enteredNumberString);
        return enteredNumber;
    }
}
