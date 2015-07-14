package calculate.com.wo.ui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;

public class CalculatorView extends JFrame implements CalculatorDisplay
{

    JTextField mainTextField;
    Collection<JComponent> theNumbers = new ArrayList<JComponent>();
    Collection<JComponent> theOperators = new ArrayList<JComponent>();
    Collection<JComponent> theFunctions = new ArrayList<JComponent>();



    JButton percentButton = new JButton("%");
    JButton plusMinusButton = new JButton("+/-");
    JButton cButton = new JButton("C");
    JButton acButton = new JButton("AC");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton divButton = new JButton("/");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton multButton = new JButton("*");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton minusButton = new JButton("-");
    JButton zeroButton = new JButton("0");
    JButton dotButton = new JButton(".");
    JButton equalsButton = new JButton("=");
    JButton plusButton = new JButton("+");



    public CalculatorView()
    {

    }

    public JComponent createContent()
    {
        JPanel mainPanel = new JPanel();

        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize( 250, 250 );
        this.setContentPane(mainPanel);

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


    public String getOperation()
    {
        return mainTextField.getText();
    }


    private JComponent createOperationsPanel()
    {
        JPanel operationsPanel = new JPanel();
        mainTextField = new JTextField("", 15 );
        mainTextField.setEditable(false);
        operationsPanel.add(mainTextField);
        return operationsPanel;
    }


    private JComponent createKeyboard()
    {
        JPanel keyboardPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();

        keyboardPanel.setLayout( gbl );

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        keyboardPanel.add(percentButton, gbc);
        theOperators.add(percentButton);



        gbc.gridx = 1;
        keyboardPanel.add(plusMinusButton, gbc);
        theFunctions.add(plusMinusButton);

        gbc.gridx = 2;
        keyboardPanel.add(cButton, gbc);
        theFunctions.add(cButton);

        gbc.gridx = 3;
        keyboardPanel.add(acButton, gbc);
        theFunctions.add(acButton);

        gbc.gridx = 0;
        gbc.gridy = 1;
        keyboardPanel.add(sevenButton, gbc);
        theNumbers.add(sevenButton);

        gbc.gridx = 1;
        keyboardPanel.add(eightButton, gbc);
        theNumbers.add(eightButton);

        gbc.gridx = 2;
        keyboardPanel.add(nineButton, gbc);
        theNumbers.add(nineButton);

        gbc.gridx = 3;

        keyboardPanel.add(divButton, gbc);
        theOperators.add(divButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        keyboardPanel.add(fourButton, gbc);
        theNumbers.add(fourButton);

        gbc.gridx = 1;
        keyboardPanel.add(fiveButton, gbc);
        theNumbers.add(fiveButton);

        gbc.gridx = 2;
        keyboardPanel.add(sixButton, gbc);
        theNumbers.add(sixButton);

        gbc.gridx = 3;
        keyboardPanel.add(multButton, gbc);
        theOperators.add(multButton);

        gbc.gridx = 0;
        gbc.gridy = 3;
        keyboardPanel.add(oneButton, gbc);
        theNumbers.add(oneButton);

        gbc.gridx = 1;
        keyboardPanel.add(twoButton, gbc);
        theNumbers.add(twoButton);

        gbc.gridx = 2;
        keyboardPanel.add(threeButton, gbc);
        theNumbers.add(threeButton);

        gbc.gridx = 3;
        keyboardPanel.add(minusButton, gbc);
        theOperators.add(minusButton);

        gbc.gridx = 0;
        gbc.gridy = 4;
        keyboardPanel.add(zeroButton, gbc);
        theNumbers.add(zeroButton);

        gbc.gridx = 1;
        keyboardPanel.add(dotButton, gbc);
        theNumbers.add(dotButton);

        gbc.gridx = 2;
        keyboardPanel.add(equalsButton, gbc);
        theFunctions.add(equalsButton);

        gbc.gridx = 3;
        keyboardPanel.add(plusButton, gbc);
        theOperators.add(plusButton);

        return keyboardPanel;

    }



    public void addPercentListener(ActionListener percentListener)
    {
        percentButton.addActionListener( percentListener );
    }
    public void addPlusMinusListener(ActionListener plusMinusListener)
    {
        plusMinusButton.addActionListener( plusMinusListener );
    }
    public void addCListener(ActionListener cListener)
    {
        cButton.addActionListener( cListener );
    }
    public void addACListener(ActionListener acListener)
    {
        acButton.addActionListener( acListener );
    }
    public void addSevenListener(ActionListener sevenListener)
    {
        sevenButton.addActionListener( sevenListener );
    }
    public void addEightListener(ActionListener eightListener)
    {
        eightButton.addActionListener( eightListener );
    }
    public void addNineListener(ActionListener nineListener)
    {
        nineButton.addActionListener( nineListener );
    }
    public void addDivListener(ActionListener divListener)
    {
        divButton.addActionListener( divListener );
    }
    public void addFourListener(ActionListener fourListener)
    {
        fourButton.addActionListener( fourListener );
    }
    public void addFiveListener(ActionListener fiveListener)
    {
        fiveButton.addActionListener( fiveListener );
    }
    public void addSixListener(ActionListener sixListener)
    {
        sixButton.addActionListener( sixListener );
    }
    public void addMultListener(ActionListener multListener)
    {
        multButton.addActionListener( multListener );
    }
    public void addOneListener(ActionListener oneListener)
    {
        oneButton.addActionListener( oneListener );
    }
    public void addTwoListener(ActionListener twoListener)
    {
        twoButton.addActionListener( twoListener );
    }
    public void addThreeListener(ActionListener threeListener)
    {
        threeButton.addActionListener( threeListener );
    }
    public void addMinusListener(ActionListener minusListener)
    {
        minusButton.addActionListener( minusListener );
    }
    public void addZeroListener(ActionListener zeroListener)
    {
        zeroButton.addActionListener( zeroListener );
    }
    public void addDotListener(ActionListener dotListener)
    {
        dotButton.addActionListener( dotListener );
    }
    public void addEqualsListener(ActionListener equalsListener)
    {
        equalsButton.addActionListener( equalsListener );
    }
    public void addPlusListener(ActionListener plusListener)
    {
        plusButton.addActionListener( plusListener );
    }


}
