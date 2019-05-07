import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
   

public class Calculadora extends JFrame implements ActionListener
{
    private JOptionPane mensaje;
    private JButton boton;
    private JTextField caja;
    private JTextField caja2;

    public Calculadora() 
    {
        super();
        configurarVentana();
        crearComponente();
    }

    private void configurarVentana() {
        this.setTitle("Calculadora"); 
        this.setSize(400, 300); 
        this.setLocationRelativeTo(null);
        this.setLayout(null); 
        this.setResizable(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void crearComponente() {
    	mensaje = new JOptionPane();
        mensaje.setMessage("Valor 1");
        mensaje.setBounds(50, 30, 100, 30);
        this.setForeground(Color.BLUE);
        this.add(mensaje);

        caja = new JTextField();
        caja.setBounds(50, 60, 100, 30);
        this.add(caja);
        
        mensaje = new JOptionPane();
        mensaje.setMessage("Valor 2");
        mensaje.setBounds(50, 90, 100, 30);
        this.setForeground(Color.BLUE);
        this.add(mensaje);

        caja2 = new JTextField();
        caja2.setBounds(50, 120, 100, 30);
        this.add(caja2);

        boton = new JButton();
        boton.setText("SUMAR");
        boton.setBounds(50, 160, 100, 30);
        boton.addActionListener(this);
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float valor1 = Float.parseFloat(caja.getText());
        float valor2 = Float.parseFloat(caja2.getText());
        float resultado = valor1 + valor2;
        JOptionPane.showMessageDialog(this, "El valor es: " + resultado);
    }

    public static void main(String[] args) {
        Calculadora ventana = new Calculadora();
        ventana.setVisible(true);
    }
}