package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.AltaVentas;
import edu.usal.vista.BajaCliente;
import edu.usal.vista.BajaLinea;
import edu.usal.vista.Frame;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.ListarLinea;
import edu.usal.vista.Mensajes;

public class MenuListener implements ActionListener{

	public static AltaLinea altaLinea;
	public static BajaLinea bajaLinea;
	public static ListarLinea listarLinea;
	public static AltaClienteVista altaClienteVista;
	public static BajaCliente bajaCliente;
	public static AltaVentas altaVentas;
	public static ListarClientes listarClientes;
	
	Frame frame;
	Mensajes mensaje;

	public MenuListener() throws IOException, SQLException {
		
		frame = Controlador.frame;

		 altaLinea = new AltaLinea();
		 bajaLinea = new BajaLinea();
		 listarLinea = new ListarLinea();
		 altaClienteVista = new AltaClienteVista();
		 bajaCliente = new BajaCliente();
		 altaVentas = new AltaVentas();
		 listarClientes = new ListarClientes();
		
		mensaje = new Mensajes();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {


		if(arg0.getSource() == this.frame.mntmSalir) {
			System.exit(0);
		}
		
		if(arg0.getSource() == this.frame.mntmAcercaDe) {
		mensaje.AcercaDe();
		}
		
		if(arg0.getSource() == this.frame.mntmAltaCliente) {
						
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().hide();
			frame.getContentPane().add(altaClienteVista);			
			frame.getContentPane().validate();
			frame.getContentPane().setVisible(true);
			
			try {
				altaClienteVista.addListener(new AltaClienteListener());
			} catch (IOException | SQLException e) {
				e.printStackTrace();
			}
			
			altaClienteVista.addListener2(new paisListener());
			
		}
		if(arg0.getSource() == this.frame.mntmBajaCliente) {
			
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().add(bajaCliente);			
			frame.getContentPane().revalidate();
			frame.getContentPane().repaint();
			frame.getContentPane().setVisible(true);

			try {
				bajaCliente.addListener(new BajaClienteListener());
			} catch (IOException e) {
				e.printStackTrace();
			}


		}
		if(arg0.getSource() == this.frame.mntmAltaDeLineas) {
			
			
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().add(altaLinea);			
			frame.getContentPane().revalidate();
			frame.getContentPane().repaint();
			frame.getContentPane().setVisible(true);

			try {
				altaLinea.addListener(new AltaLineaListener());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		if(arg0.getSource() == this.frame.mntmBajaDeLineas) {
			
			
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().add(bajaLinea);			
			frame.getContentPane().revalidate();
			frame.getContentPane().repaint();
			frame.getContentPane().setVisible(true);

			
			try {
				bajaLinea.addListener(new BajaLineaListener());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	if(arg0.getSource() == this.frame.mntmListarLineas) {
			
			
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().add(listarLinea);			
			frame.getContentPane().revalidate();
			frame.getContentPane().repaint();
			frame.getContentPane().setVisible(true);

			
			try {
				listarLinea.addListener(new ListarLineaListener());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	if(arg0.getSource() == this.frame.mntmVentas) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(altaVentas);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);

		if(!mensaje.Edad()) {
			System.exit(0);
		}
		
		
		try {
			altaVentas.addListener(new VentasListener());
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}
	if(arg0.getSource() == this.frame.mntmListarClientes) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(listarClientes);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);

		
		try {
			listarClientes.addListener(new ListarClienteListener());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	}
	
}