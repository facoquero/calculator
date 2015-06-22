package calculate.com.mj.view;


import calculate.com.mj.AbstractExample;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;

public class CalculatorView extends AbstractExample implements Observer {

    private JTextField indicator;
    private Collection<JButton> numberAndColonKeys;
    private Collection<JButton> operationKeys;
    private Collection<JButton> functionKeys;

    public CalculatorView() {
        super();
        this.numberAndColonKeys = new HashSet<JButton>();
        this.operationKeys = new HashSet<JButton>();
        this.functionKeys = new HashSet<JButton>();
    }

    public static void main(String[] args) {
        new CalculatorView().createAndShowGui();
    }

    public Collection<JButton> getFunctionKeys() {
        return functionKeys;
    }

    public JTextField getIndicator() {
        return indicator;
    }

    public Collection<JButton> getNumbersAndColonKeys() {
        return numberAndColonKeys;
    }

    public Collection<JButton> getOperationKeys() {
        return operationKeys;
    }

    @Override
    protected String getName() {
        return "CalcView";
    }

    public JComponent createContent() {

        JPanel mainContent = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        mainContent.setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainContent.add(createDisplayPanel(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainContent.add(createMainKeyboard(), gbc);

        return mainContent;
    }

    private JComponent createMainKeyboard() {

        JPanel mainPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        mainPanel.setLayout(gbl);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton undoBTN = new JButton("UNDO");
        mainPanel.add(undoBTN, gbc);
        functionKeys.add(undoBTN);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton divisionBTN = new JButton("/");
        mainPanel.add(divisionBTN, gbc);
        operationKeys.add(divisionBTN);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton multiplyBTN = new JButton("*");
        mainPanel.add(multiplyBTN, gbc);
        operationKeys.add(multiplyBTN);

        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton substractionBTN = new JButton("-");
        mainPanel.add(substractionBTN, gbc);
        operationKeys.add(substractionBTN);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton sevenBTN = new JButton("7");
        mainPanel.add(sevenBTN, gbc);
        numberAndColonKeys.add(sevenBTN);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton eigthBTN = new JButton("8");
        mainPanel.add(eigthBTN, gbc);
        numberAndColonKeys.add(eigthBTN);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton nineBTN = new JButton("9");
        mainPanel.add(nineBTN, gbc);
        numberAndColonKeys.add(nineBTN);

        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JButton plusBTN = new JButton("+");
        mainPanel.add(plusBTN, gbc);
        operationKeys.add(plusBTN);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton fourBTN = new JButton("4");
        mainPanel.add(fourBTN, gbc);
        numberAndColonKeys.add(fourBTN);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton fiveBTN = new JButton("5");
        mainPanel.add(fiveBTN, gbc);
        numberAndColonKeys.add(fiveBTN);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton sixBTN = new JButton("6");
        mainPanel.add(sixBTN, gbc);
        numberAndColonKeys.add(sixBTN);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton oneBTN = new JButton("1");
        mainPanel.add(oneBTN, gbc);
        numberAndColonKeys.add(oneBTN);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton twoBTN = new JButton("2");
        mainPanel.add(twoBTN, gbc);
        numberAndColonKeys.add(twoBTN);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton threeBTN = new JButton("3");
        mainPanel.add(threeBTN, gbc);
        numberAndColonKeys.add(threeBTN);

        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        JButton equalsBTN = new JButton("=");
        mainPanel.add(equalsBTN, gbc);
        functionKeys.add(equalsBTN);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton zeroBTN = new JButton("0");
        mainPanel.add(zeroBTN, gbc);
        numberAndColonKeys.add(zeroBTN);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton comaBTN = new JButton(".");
        mainPanel.add(comaBTN, gbc);
        numberAndColonKeys.add(comaBTN);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton clearBTN = new JButton("CLR");
        mainPanel.add(clearBTN, gbc);
        functionKeys.add(clearBTN);

        return mainPanel;
    }

    private JComponent createDisplayPanel() {
        JPanel displayPanel = new JPanel(new BorderLayout());
        indicator = new JTextField();
        indicator.setEditable(false);
        displayPanel.add(indicator);
        return displayPanel;
    }

    @Override
    public void update(Observable o, Object arg) {
        indicator.setText((String) arg);
        indicator.repaint();
    }
}
