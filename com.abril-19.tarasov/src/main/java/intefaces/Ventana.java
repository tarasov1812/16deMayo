package intefaces;

import javax.swing.JFrame;

import com.abril19.tarasov.Cliente;

public class Ventana extends JFrame{
	protected Cliente clienteLogado;
	
	public Ventana() {
		this.setSize(1000, 800);
		this.setTitle("Programa de prueba de clase");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true);
	}
	
	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if(clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		this.getContentPane().setVisible(true);
	}

}
