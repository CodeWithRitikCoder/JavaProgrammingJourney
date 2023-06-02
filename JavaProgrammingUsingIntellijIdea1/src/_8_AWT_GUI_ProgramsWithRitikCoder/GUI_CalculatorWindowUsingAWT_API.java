package _8_AWT_GUI_ProgramsWithRitikCoder;

//importing statements is here.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Other Classes is here.
class GUI_CalculatorClass extends Frame implements ActionListener{
    Label labelForWelcomeToThisCalculator, labelForEnterFirstNumber, labelForEnterSecondNumber;
    TextField textFieldForEnterFirstNumber, textFieldForEnterSecondNumber, textFieldForShowResult;
    Button buttonForAdditionSymbol, buttonForSubtractionSymbol, buttonForMultiplySymbol,
            buttonForDivisionSymbol, buttonForPercentageSymbol, buttonForSwapping, buttonForClear;
    GUI_CalculatorClass(){
        //Creating things is here.
        Frame frame1= new Frame("RitikCoder's Calculator1");
        labelForWelcomeToThisCalculator= new Label("  Welcome to RitikCoder's Calculator ");
        labelForEnterFirstNumber= new Label("Enter First Number = ");
        labelForEnterSecondNumber= new Label("Enter Second Number = ");
        textFieldForEnterFirstNumber= new TextField();
        textFieldForEnterSecondNumber= new TextField();
        buttonForAdditionSymbol= new Button(" + ");
        buttonForSubtractionSymbol= new Button(" - ");
        buttonForMultiplySymbol= new Button(" * ");
        buttonForDivisionSymbol= new Button(" / ");
        buttonForPercentageSymbol= new Button(" % ");
        textFieldForShowResult= new TextField();
        buttonForSwapping= new Button(" Swapping ");
        buttonForClear= new Button(" Clear ");


        //Created Frame Properties is here.
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setBounds(1400, 450, 450, 400);
        frame1.setTitle("GUI Calculator Window With RitikCoder");
        frame1.setBackground(Color.BLACK);
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });
        frame1.setResizable(false);

        //Created things is added here.
        frame1.add(labelForWelcomeToThisCalculator);
        frame1.add(labelForEnterFirstNumber);
        frame1.add(labelForEnterSecondNumber);
        frame1.add(textFieldForEnterFirstNumber);
        frame1.add(textFieldForEnterSecondNumber);
        frame1.add(buttonForAdditionSymbol);
        frame1.add(buttonForSubtractionSymbol);
        frame1.add(buttonForMultiplySymbol);
        frame1.add(buttonForDivisionSymbol);
        frame1.add(buttonForPercentageSymbol);
        frame1.add(textFieldForShowResult);
        frame1.add(buttonForSwapping);
        frame1.add(buttonForClear);

        //Created things Properties is here.
            //creation of Reference variable of Font Class.
        Font fontForWelcomeLabel, fontForEnterFirstNumber, fontForEnterSecondNumber, fontForTextFieldForEnterFirstNumber,
                fontForTextFieldForEnterSecondNumber, fontForButtonForAdditionSymbol, fontForButtonForSubtractionSymbol,
                fontForButtonForMultiplySymbol, fontForButtonForDivisionSymbol, fontForButtonForPercentageSymbol,
                fontForTextFieldForShowResult, fontForButtonForGetResult, fontForButtonForClear;
        labelForWelcomeToThisCalculator.setBounds(60, 50, 328, 30);
        fontForWelcomeLabel= new Font("Cascadia Mono PL", Font.BOLD, 18);
        labelForWelcomeToThisCalculator.setFont(fontForWelcomeLabel);
        labelForWelcomeToThisCalculator.setBackground(Color.BLUE);
        labelForWelcomeToThisCalculator.setForeground(Color.WHITE);
        labelForEnterFirstNumber.setBounds(40, 105, 140, 20);
        fontForEnterFirstNumber= new Font("Cascadia Mono PL", Font.PLAIN, 15);
        labelForEnterFirstNumber.setFont(fontForEnterFirstNumber);
        labelForEnterFirstNumber.setForeground(Color.YELLOW);
        labelForEnterSecondNumber.setBounds(40, 150, 160, 20);
        fontForEnterSecondNumber= new Font("Cascadia Mono PL", Font.PLAIN, 15);
        labelForEnterSecondNumber.setFont(fontForEnterSecondNumber);
        labelForEnterSecondNumber.setForeground(Color.YELLOW);
        textFieldForEnterFirstNumber.setBounds(195, 98, 160, 30);
        fontForTextFieldForEnterFirstNumber= new Font("Cascadia Mono PL", Font.BOLD, 18);
        textFieldForEnterFirstNumber.setFont(fontForTextFieldForEnterFirstNumber);
        textFieldForEnterFirstNumber.setForeground(Color.BLUE);
        textFieldForEnterSecondNumber.setBounds(215, 144, 160, 30);
        fontForTextFieldForEnterSecondNumber= new Font("Coscadia Mono PL", Font.BOLD, 18);
        textFieldForEnterSecondNumber.setFont(fontForTextFieldForEnterSecondNumber);
        textFieldForEnterSecondNumber.setForeground(Color.BLUE);
        buttonForAdditionSymbol.setBounds(70, 200, 40, 30);
        fontForButtonForAdditionSymbol= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForAdditionSymbol.setFont(fontForButtonForAdditionSymbol);
        buttonForAdditionSymbol.setBackground(Color.CYAN);
        buttonForSubtractionSymbol.setBounds(140, 200, 40, 30);
        fontForButtonForSubtractionSymbol= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForSubtractionSymbol.setFont(fontForButtonForSubtractionSymbol);
        buttonForSubtractionSymbol.setBackground(Color.CYAN);
        buttonForMultiplySymbol.setBounds(210, 200, 40 ,30);
        fontForButtonForMultiplySymbol= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForMultiplySymbol.setFont(fontForButtonForMultiplySymbol);
        buttonForMultiplySymbol.setBackground(Color.CYAN);
        buttonForDivisionSymbol.setBounds(280, 200, 40, 30);
        fontForButtonForDivisionSymbol= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForDivisionSymbol.setFont(fontForButtonForDivisionSymbol);
        buttonForDivisionSymbol.setBackground(Color.CYAN);
        buttonForPercentageSymbol.setBounds(350, 200, 40, 30);
        fontForButtonForPercentageSymbol= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForPercentageSymbol.setFont(fontForButtonForPercentageSymbol);
        buttonForPercentageSymbol.setBackground(Color.CYAN);
        textFieldForShowResult.setBounds(80, 250, 300 ,30);
        fontForTextFieldForShowResult= new Font("Cascadia Mono PL", Font.BOLD, 18);
        textFieldForShowResult.setFont(fontForTextFieldForShowResult);
        textFieldForShowResult.setBackground(Color.BLACK);
        textFieldForShowResult.setForeground(Color.WHITE);
        buttonForSwapping.setBounds(70, 310, 140, 40);
        fontForButtonForGetResult= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForSwapping.setFont(fontForButtonForGetResult);
        buttonForSwapping.setBackground(Color.RED);
        buttonForSwapping.setForeground(Color.WHITE);
        buttonForClear.setBounds(250, 310, 140, 40);
        fontForButtonForClear= new Font("Cascadia Mono PL", Font.BOLD, 25);
        buttonForClear.setFont(fontForButtonForClear);
        buttonForClear.setBackground(Color.RED);
        buttonForClear.setForeground(Color.WHITE);

        //Functionality and actionListener of created things.
        buttonForAdditionSymbol.addActionListener(this);
        buttonForSubtractionSymbol.addActionListener(this);
        buttonForMultiplySymbol.addActionListener(this);
        buttonForDivisionSymbol.addActionListener(this);
        buttonForPercentageSymbol.addActionListener(this);
        buttonForSwapping.addActionListener(this);

        buttonForClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldForEnterFirstNumber.setText("");
                textFieldForEnterSecondNumber.setText("");
            }
        });
    }
    public void actionPerformed(ActionEvent event){
        int intVariableForTextFieldForEnterFirstNumber, intVariableForTextFieldForEnterSecondNumber, intVariableForCalculationOfFirstAndSecondTextField;
        try{
        if(event.getSource()== buttonForAdditionSymbol){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            intVariableForCalculationOfFirstAndSecondTextField= intVariableForTextFieldForEnterFirstNumber+ intVariableForTextFieldForEnterSecondNumber;
            textFieldForShowResult.setText("  Addition = "+ intVariableForCalculationOfFirstAndSecondTextField);
        }else if(event.getSource()== buttonForSubtractionSymbol){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            intVariableForCalculationOfFirstAndSecondTextField= intVariableForTextFieldForEnterFirstNumber- intVariableForTextFieldForEnterSecondNumber;
            textFieldForShowResult.setText("  Subtraction = "+ intVariableForCalculationOfFirstAndSecondTextField);
        }else if(event.getSource()== buttonForMultiplySymbol){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            intVariableForCalculationOfFirstAndSecondTextField= intVariableForTextFieldForEnterFirstNumber* intVariableForTextFieldForEnterSecondNumber;
            textFieldForShowResult.setText("  Multiplication is = "+ intVariableForCalculationOfFirstAndSecondTextField);
        }else if(event.getSource()== buttonForDivisionSymbol){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            intVariableForCalculationOfFirstAndSecondTextField= intVariableForTextFieldForEnterFirstNumber/ intVariableForTextFieldForEnterSecondNumber;
            textFieldForShowResult.setText("  Division is = "+ intVariableForCalculationOfFirstAndSecondTextField);
        }else if(event.getSource()== buttonForPercentageSymbol){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            intVariableForCalculationOfFirstAndSecondTextField= intVariableForTextFieldForEnterFirstNumber* intVariableForTextFieldForEnterSecondNumber/ 100;
            textFieldForShowResult.setText("  Percentage is = "+ intVariableForCalculationOfFirstAndSecondTextField);
        }else if(event.getSource()== buttonForSwapping){
            intVariableForTextFieldForEnterFirstNumber= Integer.parseInt(textFieldForEnterFirstNumber.getText());
            intVariableForTextFieldForEnterSecondNumber= Integer.parseInt(textFieldForEnterSecondNumber.getText());
            int intSwappingOfEnteredFirstNumberAndSecondNumber= intVariableForTextFieldForEnterFirstNumber;
            intVariableForTextFieldForEnterFirstNumber= intVariableForTextFieldForEnterSecondNumber;
            intVariableForTextFieldForEnterSecondNumber= intSwappingOfEnteredFirstNumberAndSecondNumber;
            textFieldForEnterFirstNumber.setText(""+ intVariableForTextFieldForEnterFirstNumber);
            textFieldForEnterSecondNumber.setText(""+ intVariableForTextFieldForEnterSecondNumber);
        }else{
            textFieldForShowResult.setText("  !-Please Enter Your Numbers. ");
        }
        }catch(ArithmeticException arithmeticException){
            JOptionPane.showMessageDialog(buttonForDivisionSymbol,  ""+textFieldForEnterFirstNumber.getText() + "  is cannot be divided by 0.");
        }catch(NumberFormatException numberFormatException){
            if(event.getSource()== buttonForAdditionSymbol){
                JOptionPane.showMessageDialog(buttonForAdditionSymbol, "Please Enter Integer Number Only.");
            }else if(event.getSource()== buttonForSubtractionSymbol){
                JOptionPane.showMessageDialog(buttonForSubtractionSymbol, "Please Enter Integer Number Only.");
            }else if(event.getSource()== buttonForMultiplySymbol){
                JOptionPane.showMessageDialog(buttonForMultiplySymbol, "Please Enter Integer Number Only.");
            }else if(event.getSource()== buttonForDivisionSymbol){
                JOptionPane.showMessageDialog(buttonForDivisionSymbol, " Please Enter Integer Number Only.");
            }else if(event.getSource()== buttonForPercentageSymbol){
                JOptionPane.showMessageDialog(buttonForPercentageSymbol, " Please Enter Integer Number Only.");
            }else if(event.getSource()== buttonForSwapping){
                JOptionPane.showMessageDialog(buttonForSwapping, " Please Enter Integer Number Only then Swapping.");
            }
        }
    }
}

public class GUI_CalculatorWindowUsingAWT_API {
    public static void main(String[] args) {
        GUI_CalculatorClass gui_calculatorClass= new GUI_CalculatorClass();

    }
}