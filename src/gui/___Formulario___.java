package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import parcial.___Solucion____;
import java.awt.SystemColor;
import java.awt.Color;

public class ___Formulario___ extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	//El objeto a tiene todos los métodos del arreglo
	private ___Solucion____ a = new ___Solucion____();
	
	private JPanel contentPane;
	private JButton btn00;

	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					___Formulario___ frame = new ___Formulario___();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ___Formulario___() {
		setTitle("Ejemplo - Semana_07");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn00 = new JButton("Soluci\u00F3n");
		btn00.setForeground(new Color(255, 255, 240));
		btn00.setBackground(new Color(0, 0, 128));
		btn00.addActionListener(this);
		btn00.setBounds(340, 48, 180, 23);
		btn00.setOpaque(true);
		contentPane.add(btn00);
	
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 315, 400);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		listar();
	}
	
	//  Métodos tipo void sin parámetros
	void listar() {
		txtS.setText("");
		for (int i = 0; i < a.tamaño(); i++) {
			txtS.append("n [" + i + "] = " + a.obtener(i)+"\n");
		}	
	}
	
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void con parámetros
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn00) {
			do_btn00_actionPerformed(e);
		}
	}
	
	protected void do_btn00_actionPerformed(ActionEvent e) {
		imprimir("mayor : " + a.mayor());
		imprimir("menor : " + a.menor());
		imprimir("promedio : " + a.promedio());
		imprimir("Cantidad de mayores al precio promedio : " + a.mayorAlPromedio());
		imprimir("Cantidad de menores al precio promedio : " + a.menorAlPromedio());
		imprimir("Posición del primer precio mayor a 1000.0 : " + a.buscarPrimerPrecioMayorAlMinimo());
		imprimir("Posición del último precio menor a 1000.0 : " + a.buscarUltimoPrecioMenorAlMinimo());
	}
}