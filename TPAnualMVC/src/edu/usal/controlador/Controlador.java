package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.vista.*;

import javax.swing.JFrame;


public class Controlador extends JFrame implements ActionListener{

	LineasAereasInterfaz linInter;
	ClienteInterfaz cliInter;
	VuelosInterfaz vueInter;
	VentasInterfaz venInter;
	Mensajes mensaje;
	
	public static AltaLinea altaLinea;
	public static BajaLinea bajaLinea;
	public static ListarLinea listarLinea;
	public static AltaCliente altaCliente;
	public static BajaCliente bajaCliente;
	public static AltaVentas altaVentas;
	public static ListarClientes listarClientes;
	
	private Frame frame;
	
	public Controlador(Frame frame) throws IOException, SQLException {
		
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		vueInter = VuelosFactory.GetImplementation("MSSQL");
		venInter = VentasFactory.GetImplementation("MSSQL");
		
		
		
		this.frame = frame;
		
		mensaje = new Mensajes();
		
		 altaLinea = new AltaLinea();
		 bajaLinea = new BajaLinea();
		 listarLinea = new ListarLinea();
		 altaCliente = new AltaCliente();
		 bajaCliente = new BajaCliente();
		 altaVentas = new AltaVentas();
		 listarClientes = new ListarClientes();
		
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
			frame.getContentPane().add(altaCliente);			
			frame.getContentPane().validate();
			frame.getContentPane().setVisible(true);
			
			try {
				altaCliente.addListener(new AltaClienteListener());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			altaCliente.addListener2(new paisListener());
			
		}
		if(arg0.getSource() == this.frame.mntmBajaCliente) {
			
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().add(bajaCliente);			
			frame.getContentPane().validate();
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
			frame.getContentPane().validate();
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
			frame.getContentPane().validate();
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
			frame.getContentPane().validate();
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
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		if(!mensaje.Edad()) {
			System.exit(0);
		}
		
		
		try {
			altaVentas.addListener(new VentasListener());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	if(arg0.getSource() == this.frame.mntmListarClientes) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(listarClientes);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		
		try {
			listarClientes.addListener(new ListarClienteListener());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		
	}
	
}
	




