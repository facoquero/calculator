package calculate.com.wo.ui;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Collection;

public class CalculatorView implements CalculatorDisplay
{

    JTextField mainTextField;
    Collection<JComponent> theNumbers = new ArrayList<JComponent>();
    Collection<JComponent> theOperators = new ArrayList<JComponent>();
    Collection<JComponent> theFunctions = new ArrayList<JComponent>();

    public CalculatorView()
    {

    }

    public JComponent createContent()
    {
        JPanel mainPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();
        mainPanel.setLayout(gbl);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridy = 0;
        mainPanel.add(createOperationsPanel(), gbc);

        gbc.gridy = 1;
        mainPanel.add(createKeyboard(), gbc);

        return mainPanel;
    }

    private JComponent createOperationsPanel()
    {
        JPanel operationsPanel = new JPanel();
        mainTextField = new JTextField();
        mainTextField.setEditable(false);
        operationsPanel.add(mainTextField);
        return operationsPanel;
    }

    private JComponent createKeyboard()
    {
        JPanel keyboardPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();

        keyboardPanel.add(gbl);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton percentButton = new JButton("%");
        keyboardPanel.add(percentButton, gbc);
        theOperators.add(percentButton);

        gbc.gridx = 1;
        JButton plusMinusButton = new JButton("+/-");
        keyboardPanel.add(plusMinusButton, gbc);
        theFunctions.add(plusMinusButton);

        gbc.gridx = 2;
        JButton cButton = new JButton("C");
        keyboardPanel.add(cButton, gbc);
        theFunctions.add(cButton);

        gbc.gridx = 3;
        JButton acButton = new JButton("AC");
        keyboardPanel.add(acButton, gbc);
        theFunctions.add(acButton);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton sevenButton = new JButton("7");
        keyboardPanel.add(sevenButton, gbc);
        theNumbers.add(sevenButton);

        gbc.gridx = 1;
        JButton eightButton = new JButton("8");
        keyboardPanel.add(eightButton, gbc);
        theNumbers.add(eightButton);

        gbc.gridx = 2;
        JButton nineButton = new JButton("9");
        keyboardPanel.add(nineButton, gbc);
        theNumbers.add(nineButton);

        gbc.gridx = 3;
        JButton divButton = new JButton("/");
        keyboardPanel.add(divButton, gbc);
        theOperators.add(divButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton fourButton = new JButton("4");
        keyboardPanel.add(fourButton, gbc);
        theNumbers.add(fourButton);

        gbc.gridx = 1;
        JButton fiveButton = new JButton("5");
        keyboardPanel.add(fiveButton, gbc);
        theNumbers.add(fiveButton);

        gbc.gridx = 2;
        JButton sixButton = new JButton("6");
        keyboardPanel.add(sixButton, gbc);
        theNumbers.add(sixButton);

        gbc.gridx = 3;
        JButton multButton = new JButton("*");
        keyboardPanel.add(multButton, gbc);
        theOperators.add(multButton);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JButton oneButton = new JButton("1");
        keyboardPanel.add(oneButton, gbc);
        theNumbers.add(oneButton);

        gbc.gridx = 1;
        JButton twoButton = new JButton("2");
        keyboardPanel.add(twoButton, gbc);
        theNumbers.add(twoButton);

        gbc.gridx = 2;
        JButton threeButton = new JButton("3");
        keyboardPanel.add(threeButton, gbc);
        theNumbers.add(threeButton);

        gbc.gridx = 3;
        JButton minusButton = new JButton("-");
        keyboardPanel.add(minusButton, gbc);
        theOperators.add(minusButton);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JButton zeroButton = new JButton("0");
        keyboardPanel.add(zeroButton, gbc);
        theNumbers.add(zeroButton);

        gbc.gridx = 1;
        JButton dotButton = new JButton(".");
        keyboardPanel.add(dotButton, gbc);
        theNumbers.add(dotButton);

        gbc.gridx = 2;
        JButton equalsButton = new JButton("=");
        keyboardPanel.add(equalsButton, gbc);
        theFunctions(equalsButton);

        gbc.gridx = 3;
        JButton plusButton = new JButton("+");
        keyboardPanel.add(plusButton, gbc);
        theOperators.add(plusButton);

        return keyboardPanel;

    }

    public String getOperation()
    {
        return mainTextField.getText();
    }


}