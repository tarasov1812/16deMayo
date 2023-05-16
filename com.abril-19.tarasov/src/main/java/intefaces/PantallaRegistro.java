package intefaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;

import com.abril19.tarasov.Cliente;

import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PantallaRegistro extends JPanel{
	private Ventana ventana;
	private JTextField emailFiled;
	private JTextField nombreField;
	private JTextField telefonoField;
	private JPasswordField contasenaField;
	private JTextField campoEmail;
	private JTextField campoNombre;
	private JTextField campoTelefono;
	private JPasswordField campoContraseña;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public PantallaRegistro(Ventana v) {
		setToolTipText("Registrate");
		setBorder(new TitledBorder(null, "Registrate", TitledBorder.CENTER, TitledBorder.TOP, null, null));	
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{94, 54, 194, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{116, 16, 29, 67, 26, 26, 0, 0, 0, 0, 29, 20, 43, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelTitulo = new JLabel("Registrate aqui por favor");
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);
		
		JLabel labelEmail = new JLabel("Email");
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 4;
		add(labelEmail, gbc_labelEmail);
		
		campoEmail = new JTextField();
		GridBagConstraints gbc_campoEmail = new GridBagConstraints();
		gbc_campoEmail.gridwidth = 2;
		gbc_campoEmail.anchor = GridBagConstraints.NORTH;
		gbc_campoEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmail.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmail.gridx = 2;
		gbc_campoEmail.gridy = 4;
		add(campoEmail, gbc_campoEmail);
		campoEmail.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre\n");
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 5;
		add(labelNombre, gbc_labelNombre);
		
		campoNombre = new JTextField();
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.gridwidth = 2;
		gbc_campoNombre.anchor = GridBagConstraints.NORTH;
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.gridx = 2;
		gbc_campoNombre.gridy = 5;
		add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);
		
		JLabel laberTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_laberTelefono = new GridBagConstraints();
		gbc_laberTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_laberTelefono.gridx = 1;
		gbc_laberTelefono.gridy = 6;
		add(laberTelefono, gbc_laberTelefono);
		
		campoTelefono = new JTextField();
		GridBagConstraints gbc_campoTelefono = new GridBagConstraints();
		gbc_campoTelefono.gridwidth = 2;
		gbc_campoTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_campoTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoTelefono.gridx = 2;
		gbc_campoTelefono.gridy = 6;
		add(campoTelefono, gbc_campoTelefono);
		campoTelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 7;
		add(lblNewLabel, gbc_lblNewLabel);
		
		campoContraseña = new JPasswordField();
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.gridwidth = 2;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 2;
		gbc_campoContraseña.gridy = 7;
		add(campoContraseña, gbc_campoContraseña);
		
		JLabel laberlGenero = new JLabel("Genero");
		GridBagConstraints gbc_laberlGenero = new GridBagConstraints();
		gbc_laberlGenero.gridwidth = 3;
		gbc_laberlGenero.insets = new Insets(0, 0, 5, 5);
		gbc_laberlGenero.gridx = 1;
		gbc_laberlGenero.gridy = 8;
		add(laberlGenero, gbc_laberlGenero);
		
		JRadioButton radioHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 1;
		gbc_radioHombre.gridy = 9;
		add(radioHombre, gbc_radioHombre);
		
		JRadioButton radioMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 2;
		gbc_radioMujer.gridy = 9;
		add(radioMujer, gbc_radioMujer);
		
		JRadioButton radioOtro = new JRadioButton("Otro");
		buttonGroup.add(radioOtro);
		GridBagConstraints gbc_radioOtro = new GridBagConstraints();
		gbc_radioOtro.insets = new Insets(0, 0, 5, 5);
		gbc_radioOtro.gridx = 3;
		gbc_radioOtro.gridy = 9;
		add(radioOtro, gbc_radioOtro);
		
		JButton registrate = new JButton("Registrate");
		registrate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
//				if(radioHombre.isSelected()) {
//					asdfsdf
//				}
				
				try {
					String nombre = campoNombre.getText();
					int telefono = Integer.parseInt(campoTelefono.getText());
					String email = campoEmail.getText();
					String contrasena = new String(campoContraseña.getPassword());
					
					new Cliente(nombre, email, telefono, contrasena);
					JOptionPane.showMessageDialog(ventana, "Registrado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaLogin.class);
				} catch (SQLIntegrityConstraintViolationException e6) {
					JOptionPane.showMessageDialog(ventana, "No se puede registrar", "Error", JOptionPane.ERROR_MESSAGE);
				}	catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "No se puede connectar", JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException e3) {
					JOptionPane.showMessageDialog(ventana, "Tienes que poner un numero de telefono", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		registrate.setBackground(new Color(4, 50, 255));
		GridBagConstraints gbc_registrate = new GridBagConstraints();
		gbc_registrate.gridwidth = 3;
		gbc_registrate.insets = new Insets(0, 0, 5, 5);
		gbc_registrate.anchor = GridBagConstraints.NORTH;
		gbc_registrate.gridx = 1;
		gbc_registrate.gridy = 10;
		add(registrate, gbc_registrate);
		
		JButton botonLimpiar = new JButton("limpiar formulario");
		botonLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campoNombre.setText("");
				campoTelefono.setText("");
				campoEmail.setText("");
				campoContraseña.setText("");
				buttonGroup.clearSelection();
			}
		});
		GridBagConstraints gbc_botonLimpiar = new GridBagConstraints();
		gbc_botonLimpiar.gridwidth = 3;
		gbc_botonLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_botonLimpiar.gridx = 1;
		gbc_botonLimpiar.gridy = 11;
		add(botonLimpiar, gbc_botonLimpiar);
		
		JButton botonAtras = new JButton("cancelar");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.insets = new Insets(0, 0, 0, 5);
		gbc_botonAtras.gridx = 0;
		gbc_botonAtras.gridy = 13;
		add(botonAtras, gbc_botonAtras);
		
	}
}
