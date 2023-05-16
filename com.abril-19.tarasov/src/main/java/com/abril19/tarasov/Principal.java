package com.abril19.tarasov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import intefaces.Ventana;
import util.DAO;

public class Principal {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		Ventana ventana = new Ventana();
		
//		
//		Byte opcion;
//		do {
//			System.out.println("Dime que quieres hacer: "
//					+"\n\t0 - Salir"
//					+"\n\t1 - Insertar cliente"
//					+"\n\t2 - Borrar cliente"
//					+"\n\t3 - Modificar cliente"
//					+"\n\t4 - Mostrar clientes");
//			opcion=Byte.parseByte(sc.nextLine());
//			switch(opcion) {
//			case 1:
//				System.out.println("Dime tu email");
//				String email = sc.nextLine();
//				System.out.println("Dime tu nombre");
//				String nombre = sc.nextLine();
//				System.out.println("Dime tu clave");
//				String clave = sc.nextLine();
//				System.out.println("Dime tu telefeno");
//				int telefeno = Integer.parseInt(sc.nextLine());
//				try {
//					HashMap<String, Object> cols = new HashMap<String, Object>();
//					cols.put("email", email);
//					cols.put("nombre", nombre);
//					cols.put("password", clave);
//					cols.put("telefono", telefeno);
//					DAO.insertar("cliente", cols);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}				
//				break;
//			case 2:
//				System.out.println("Dime el email de la persona a borrar");
//				String emailABorrar = sc.nextLine();
//				try {
//					HashMap<String, Object> columnasBorrar = new HashMap<String, Object>();
//					columnasBorrar.put("email", emailABorrar);
//					if(DAO.borrar("cliente", columnasBorrar)==0) {
//						System.out.println("No se puede borrar esto");
//					} else {
//						System.out.println("Borrado con exito");
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
//			case 3:
//				HashMap<String, Object> valores = new HashMap<String, Object>();
//				System.out.println("Dime el email del cliente a modificar");
//				String emailMod = sc.nextLine();
//				System.out.println("Que quieres cambiar? "
//						+"\n\t1 - Email"
//						+"\n\t2 - Nombre"
//						+"\n\t3 - Password"
//						+"\n\t4 - Telefono");
//				switch(Byte.parseByte(sc.nextLine())) {
//				case 1:
//					System.out.println("Dime el nuevo email");
//					valores.put("email", sc.nextLine());
//					break;
//				case 2:
//					System.out.println("Dime el nuevo nombre");
//					valores.put("nombre", sc.nextLine());				
//					break;
//				case 3:
//					System.out.println("Dime el nuevo password");
//					valores.put("password", sc.nextLine());
//					break;
//				case 4:
//					System.out.println("Dime el nuevo Telefono");
//					valores.put("telefono", Integer.parseInt(sc.nextLine()));
//					break;
//				}
//				HashMap<String, Object> restriccionesMOD = new HashMap<String, Object>();
//				restriccionesMOD.put("email", emailMod);
//				try {
//					DAO.actualizar("cliente", valores, restriccionesMOD);
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				break;
//			case 4:
//				try {
//					LinkedHashSet columnasSacar = new LinkedHashSet<String>();
//					columnasSacar.add("email");
//					columnasSacar.add("password");
//					columnasSacar.add("telefono");
//					columnasSacar.add("nombre");
//					HashMap<String, Object> rescticciones = new HashMap<String, Object>();
//					ArrayList<Object> cliente = DAO.consultar("cliente", columnasSacar, rescticciones);
//					for(byte i = 0; i<cliente.size(); i++) {
//						if(i%4 == 0) {
//							System.out.println();
//						}
//						System.out.print(cliente.get(i) + " : ");
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
//			}
//		}while(opcion!=0);
//		
		
		// 1 - Coge el proyecto del repositorio y borra el main
		// 2 - Crea un POJO Cliente que tenga las mismas variables internas que columnas
		// tienes la table
		// 3 - Aqui en el main, lo primero que se va a hacer es pedir un usuario y 
		// una contrasena por teclado. Cuando tengas ambos datos, usa la function
		// consultar para traer todos los datos del cliente  (menos contrasena)
		// desde base de datos solo si el email y contrasena que se han puesto 
		// son correctos.
		// 4 - Si el array que recibes de la funcion consultar esta vacio, quere
		// decir que el usuario o la contrasena no son correctos:
		// vuelve a pedirlos por teclado las veces que haga falta hasta que 
		// ponga unos datos correctos. En ese caso, di al usuario @LOGIN CORRECTO!
		// , crea una variable de tipo cliente con los datos que te devuelve el 
		// ArrayList, y usa toString, para imprimir el cliente por pantalla
		// (recuerda: le password no tiene que salir aqui)
//		
//		Cliente cl;
//		
//		
//		ArrayList<Object> cliente = null;
//		do {
//			
//			System.out.println("Dime un usuario por teclado");
//			String usuario = sc.nextLine();
//			System.out.println("Dime una contrasena por teclado");
//			String password = sc.nextLine();
//			
//		LinkedHashSet columnasSacar = new LinkedHashSet<String>();
//		columnasSacar.add("email");
//		columnasSacar.add("telefono");
//		columnasSacar.add("nombre");
//		HashMap<String, Object> rescticciones = new HashMap<String, Object>();
//		rescticciones.put("nombre", usuario);
//		rescticciones.put("password", password);
//		
//		
//		try {
//			cliente = DAO.consultar("cliente", columnasSacar, rescticciones);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println("S");
//			e.printStackTrace();
//		}
//			cl = new Cliente((String)(cliente.get(0)), (String)(cliente.get(2)), (Integer)(cliente.get(1)));	
//		} while (cl == null);
//		System.out.println(cl);
//		
//		
	}

}
