import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalc extends JFrame implements ActionListener {
    JFrame frame; // El frame
    Border border;
    JLabel label; // Numero en pantalla
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0; // Botones de los numeros
    JButton bsum, bsub, bmult, bdiv, bcalc, bmod, bclr, bback, bdot; // Botones de accion
    String currentNumber;
    String newNumber;
    double num1, num2;
    int opcion;
    double resultado;
    boolean resultadoMostrado;

    MyCalc (){
        frame = new JFrame();
        frame.setTitle("Calculadora");
        frame.setVisible(true);
        frame.setSize(370, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0x3F3A3A));

        border = BorderFactory.createLineBorder(Color.BLACK,1, true);
        label = new JLabel();
            label.setBounds(50, 50, 260, 60);
            label.setBorder(border);
            label.setOpaque(true);
            label.setHorizontalAlignment(JLabel.RIGHT);
            label.setBackground(new Color(0xC9B79C));
            label.setFont(new Font("Comic Sans", Font.BOLD, 20));

        b1 = new JButton("1");
            b1.setBounds(50, 340, 50, 50);
        b2 = new JButton("2");
            b2.setBounds(120, 340, 50, 50);
        b3 = new JButton("3");
            b3.setBounds(190, 340, 50, 50);
        b4 = new JButton("4");
            b4.setBounds(50, 270, 50, 50);
        b5 = new JButton("5");
            b5.setBounds(120, 270, 50, 50);
        b6 = new JButton("6");
            b6.setBounds(190, 270, 50, 50);
        b7 = new JButton("7");
            b7.setBounds(50, 200, 50, 50);
        b8 = new JButton("8");
            b8.setBounds(120, 200, 50, 50);
        b9 = new JButton("9");
            b9.setBounds(190, 200, 50, 50);
        bdot = new JButton(".");
            bdot.setBounds(190, 410, 50, 50);
        b0 = new JButton("0");
            b0.setBounds(120, 410, 50, 50);
        bcalc = new JButton("=");
            bcalc.setBounds(260, 410, 50, 50);
        bsum = new JButton("+");
            bsum.setBounds(260, 340, 50, 50);
        bsub = new JButton("-");
            bsub.setBounds(260, 270, 50, 50);
        bmult = new JButton("*");
            bmult.setBounds(260, 200, 50, 50);
        bdiv = new JButton("/");
            bdiv.setBounds(260, 130, 50, 50);
        bmod = new JButton("%");
            bmod.setBounds(190, 130, 50, 50);
        bback = new JButton("CE");
            bback.setBounds(120, 130, 50, 50);
        bclr = new JButton("AC");
            bclr.setBounds(50, 130, 50, 50);


        JButton[] botones = {b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, b0, bcalc, bsum, bsub, bmult, bdiv, bmod, bback, bclr};
        for (JButton boton : botones) {
            boton.setFocusable(false);
            boton.setFont(new Font("Comic Sans", Font.BOLD, 15));
            boton.setBackground(new Color(0xA78A7F));
            boton.setBorder(border);
            frame.add(boton);
            boton.addActionListener(this);
        }
        frame.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        JButton[] botones = {b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, b0};
        for (JButton boton : botones) {
            if (e.getSource() == boton) {
                if (resultadoMostrado){
                    label.setText("");
                    resultadoMostrado = false;
                }
                currentNumber = label.getText();
                newNumber = currentNumber + boton.getText();
                label.setText(newNumber);
            }
        }

        if (e.getSource() == bsum){
            try{
                num1 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            newNumber = "";
            label.setText(newNumber);
            opcion = 1;
        }
        if (e.getSource() == bsub){
            try{
                num1 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            newNumber = "";
            label.setText(newNumber);
            opcion = 2;
        }
        if (e.getSource() == bmult){
            try{
                num1 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            newNumber = "";
            label.setText(newNumber);
            opcion = 3;
        }
        if (e.getSource() == bdiv){
            try{
                num1 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            newNumber = "";
            label.setText(newNumber);
            opcion = 4;
        }
        if (e.getSource() == bmod){
            try{
                num1 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            newNumber = "";
            label.setText(newNumber);
            opcion = 5;
        }


        if (e.getSource() == bcalc){
            try{
                num2 = Double.parseDouble(label.getText());
            }catch (NumberFormatException frame){
                label.setText("Formato invalido");
                resultadoMostrado = true;
                return;
            }
            if (opcion == 1){
                resultado = num1 + num2;
            }
            if (opcion == 2){
                resultado = num1 - num2;
            }
            if (opcion == 3){
                resultado = num1 * num2;
            }
            if (opcion == 4){
                resultado = num1 / num2;
            }
            if (opcion == 5){
                resultado = num1 % num2;
            }
            label.setText(String.valueOf(resultado));
            resultadoMostrado = true;
        }

        if (e.getSource() == bclr){
            num1 = 0;
            num2 = 0;
            opcion = 0;
            resultado = 0;
            newNumber = "";
            label.setText(newNumber);
        }

        if (e.getSource() == bback){
            currentNumber = label.getText();
            try{
                newNumber = currentNumber.substring(0, currentNumber.length()-1);
            }catch (StringIndexOutOfBoundsException frame){
                return;
            }
            label.setText(newNumber);
        }
    }
}