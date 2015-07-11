package calculate.com.tr.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by trumak on 6/20/2015.
 */
public class CalculatorView extends JFrame{




    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton equal = new JButton("=");
    JButton period = new JButton(".");
    JButton add = new JButton("+");
    JButton multiply = new JButton("x");
    JButton minus = new JButton("-");
    JButton division = new JButton("/");
    JTextField textField = new JTextField(25);

    public CalculatorView(){


        super("Calculator");

        JPanel calcPanel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(650, 300);
        setContentPane(calcPanel);

        GridBagLayout gbl = new GridBagLayout();
        calcPanel.setLayout(gbl);

        GridBagConstraints constrains = new GridBagConstraints();
        constrains.insets = new Insets(1, 1, 1, 1);

        textField.setEditable(false);



        constrains.gridy = 0;
        constrains.gridx = 0;

        constrains.anchor = GridBagConstraints.EAST;
        constrains.fill = GridBagConstraints.EAST;
        constrains.gridwidth = 3;
        constrains.gridheight = 2;




        calcPanel.add(textField, constrains);

        constrains.gridwidth = 1;
        constrains.gridheight = 1;
        constrains.anchor = GridBagConstraints.WEST;
        constrains.gridy = 5;
        constrains.gridx = 0;


        calcPanel.add(zero, constrains);

        //constrains.anchor = GridBagConstraints.CENTER;


        constrains.ipadx = 0;
        constrains.gridy = 5;
        constrains.gridx = 1;
        calcPanel.add(period, constrains);

        constrains.gridy = 5;
        constrains.gridx = 2;
        calcPanel.add(equal, constrains);


        constrains.anchor = GridBagConstraints.WEST;
        constrains.gridy = 5;
        constrains.gridx = 3;
        calcPanel.add(add, constrains);

        constrains.gridy = 4;
        constrains.gridx = 3;
        calcPanel.add(minus, constrains);

        constrains.gridy = 3;
        constrains.gridx = 3;
        calcPanel.add(multiply, constrains);

        constrains.gridy = 2;
        constrains.gridx = 3;
        calcPanel.add(division, constrains);

        constrains.gridy = 4;
        constrains.gridx = 0;
        calcPanel.add(one, constrains);

        constrains.gridy = 4;
        constrains.gridx = 1;
        calcPanel.add(two, constrains);
        constrains.gridy = 4;
        constrains.gridx = 2;
        calcPanel.add(three, constrains);
        constrains.gridy = 3;
        constrains.gridx = 0;
        calcPanel.add(four, constrains);
        constrains.gridy = 3;
        constrains.gridx = 1;
        calcPanel.add(five, constrains);
        constrains.gridy = 3;
        constrains.gridx = 2;
        calcPanel.add(six, constrains);
        constrains.gridy = 2;
        constrains.gridx = 0;
        calcPanel.add(seven, constrains);
        constrains.gridy = 2;
        constrains.gridx = 1;
        calcPanel.add(eight, constrains);
        constrains.gridy = 2;
        constrains.gridx = 2;
        calcPanel.add(nine, constrains);

        initComponents();



    }

    private void initComponents() {
    }

    public void addZeroActionListener(ActionListener listenOnZeroButton){
        zero.addActionListener(listenOnZeroButton);
    }

    public void addOneActionListener(ActionListener listenOnOneButton){

        one.addActionListener(listenOnOneButton);
    }

    public void addTwoActionListener(ActionListener listenOnTwoButton){

        two.addActionListener(listenOnTwoButton);
    }

    public void addThreeActionListner(ActionListener listenOnThreeButton){

        three.addActionListener(listenOnThreeButton);
    }

    public void addFourActionListner(ActionListener listenOnFourButton){

        four.addActionListener(listenOnFourButton);
    }

    public void addFiveActionListner(ActionListener listenOnFiveButton){

        five.addActionListener(listenOnFiveButton);
    }

    public void addSixActionListner(ActionListener listenOnSixButton){

        six.addActionListener(listenOnSixButton);
    }

    public void addSevenActionListner(ActionListener listenOnSevenButton){

        seven.addActionListener(listenOnSevenButton);
    }

    public void addEightActionListner(ActionListener listenOnEightButton){

        eight.addActionListener(listenOnEightButton);
    }

    public void addNineActionListner(ActionListener listenOnNineButton){

        nine.addActionListener(listenOnNineButton);
    }

    public void addAdditionListner(ActionListener listenOnadditionButton){

        add.addActionListener(listenOnadditionButton);
    }

    public void addEqualityListner(ActionListener listenOnEqualButton){

        equal.addActionListener(listenOnEqualButton);
    }

    public void addPeriodListner(ActionListener listenOnPeriodButton){

        period.addActionListener(listenOnPeriodButton);
    }

    public void addMultiplyListner(ActionListener listenOnMultyplyButton){
        multiply.addActionListener(listenOnMultyplyButton);
    }

    public void addDivisionListner(ActionListener listenOnDivisionButton){
        division.addActionListener(listenOnDivisionButton);
    }

    public void addMinusListner(ActionListener listenOnMinusButton){
        minus.addActionListener(listenOnMinusButton);
    }

    public void setTextOnTextField(String strToBeSet){

        textField.setText(strToBeSet);


    }

}
