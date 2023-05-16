package intefaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.abril19.tarasov.Cliente;

import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JTable;

public class PantallaLogin extends JPanel{
	private JTextField campoUsuario;
	private JPasswordField passwordField;
	private Ventana ventana;
	private JButton bottonLogin;
	
	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setLayout(null);
		bottonLogin = new JButton("LOGIN");
		bottonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = campoUsuario.getText();
				String contrasena = new String(passwordField.getPassword());
				System.out.println(usuario);
				System.out.println(contrasena);
				try {
					ventana.clienteLogado = new Cliente(usuario, contrasena);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClienteNoExisteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ContraseñaInvalidaExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		bottonLogin.setToolTipText("Pinchame para iniciar sesion");
		bottonLogin.setBackground(new Color(255, 255, 0));
		bottonLogin.setFont(new Font("Monospaced", Font.BOLD, 30));
		bottonLogin.setForeground(new Color(0, 22, 255));
		bottonLogin.setBounds(117, 257, 166, 44);
		add(bottonLogin);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(117, 137, 348, 26);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel etiquetaUsuario = new JLabel("EMAIL:");
		etiquetaUsuario.setBounds(127, 120, 91, 16);
		add(etiquetaUsuario);
		
		JLabel etiquetaContrasena = new JLabel("CONTRASEÑA:");
		etiquetaContrasena.setBounds(127, 187, 91, 16);
		add(etiquetaContrasena);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(117, 203, 348, 26);
		add(passwordField);
		
		JButton registroBoton = new JButton("Registro");
		registroBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		registroBoton.setToolTipText("Pinchame para iniciar sesion");
		registroBoton.setForeground(new Color(0, 22, 255));
		registroBoton.setFont(new Font("Monospaced", Font.BOLD, 30));
		registroBoton.setBackground(Color.YELLOW);
		registroBoton.setBounds(299, 257, 166, 44);
		add(registroBoton);
	}
}
