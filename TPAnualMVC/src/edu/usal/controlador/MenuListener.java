package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.AltaVentas;
import edu.usal.vista.AltaVuelo;
import edu.usal.vista.BajaCliente;
import edu.usal.vista.BajaLinea;
import edu.usal.vista.BajaVuelo;
import edu.usal.vista.Frame;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.ListarLinea;
import edu.usal.vista.ListarVuelo;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarClienteVista;
import edu.usal.vista.ModificarVuelosVista;
import edu.usal.vista.ModificarLineaVista;

public class MenuListener implements ActionListener{

	public static AltaLinea altaLinea;
	public static BajaLinea bajaLinea;
	public static ListarLinea listarLinea;
	public static AltaClienteVista altaClienteVista;
	public static BajaCliente bajaCliente;
	public static AltaVentas altaVentas;
	public static ListarClientes listarClientes;
	public static AltaVuelo altaVuelo;
	public static ListarVuelo listarVuelo;
	public static ModificarClienteVista modificarClienteVista;
	public static BajaVuelo bajaVueloVista;
	public static ModificarLineaVista modificarLineaVista;
	public static ModificarVuelosVista modificarVuelosVista;
	ClienteInterfaz clienteInterfaz;
	VuelosInterfaz vuelosInterfaz;
	LineasAereasInterfaz lineasAereas;

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
		 altaVuelo = new AltaVuelo();
		 listarVuelo = new ListarVuelo();
		 modificarClienteVista = new ModificarClienteVista();
		 bajaVueloVista = new BajaVuelo();
		 modificarVuelosVista = new ModificarVuelosVista();
		 modificarLineaVista = new ModificarLineaVista();
		 clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		 vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		 lineasAereas = LineasAereasFactory.GetImplementation("MSSQL");
		
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
	if(arg0.getSource() == this.frame.mntmAltaDeVuelos) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(altaVuelo);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);		
		
		try {
			altaVuelo.addListener(new AltaVueloListener());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	if(arg0.getSource() == this.frame.mntmListarVuelos) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(listarVuelo);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);		
		
		try {
			listarVuelo.addListener(new ListarVueloListener());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	if(arg0.getSource() == this.frame.mntmModificarClientes) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(modificarClienteVista);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);		
		
		try {
			modificarClienteVista.addListener(new ModificarClienteListener());
			modificarClienteVista.addListener2(new ModificarClienteComboListener());
			
			ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
			
			try {
				alClientes = clienteInterfaz.ListarClientes();
			} catch (SQLException e1) {
				e1.printStackTrace();
				mensaje.Verificar();
			}
							
			modificarClienteVista.textField.setText(alClientes.get(0).getNombreyApellido());
			modificarClienteVista.textField_1.setText(alClientes.get(0).getDni());
			modificarClienteVista.textField_2.setText(alClientes.get(0).getCuit_cuil());
			modificarClienteVista.textField_3.setText(alClientes.get(0).getFechaNac().toString());
			modificarClienteVista.textField_4.setText(alClientes.get(0).getEmail());
			
		} catch (IOException e) {
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
	if(arg0.getSource() == this.frame.mntmBajaDeVuelos) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(bajaVueloVista);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);

		
		try {
			bajaVueloVista.addListener(new BajaVueloListener());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	if(arg0.getSource() == this.frame.mntmModificarVuelos) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(modificarVuelosVista);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);

		
		try {
			modificarVuelosVista.addListener(new ModificarVueloListener());
			modificarVuelosVista.addListener2(new ModificarVueloComboListener());

			ArrayList<Vuelos> alVueloss = new ArrayList<Vuelos>();
			
			try {
				alVueloss = vuelosInterfaz.ListarVuelos();
			} catch (SQLException e1) {
				e1.printStackTrace();
				mensaje.Verificar();
			}
							
			modificarVuelosVista.textField.setText(alVueloss.get(0).getNumero());
			modificarVuelosVista.textField_1.setText(String.valueOf(alVueloss.get(0).getCantAsientos()));
			modificarVuelosVista.textField_2.setText(alVueloss.get(0).getAeroSalida());
			modificarVuelosVista.textField_3.setText(alVueloss.get(0).getAeroLlegada());
			modificarVuelosVista.textField_4.setText(alVueloss.get(0).getFechaSalida().toString());
			modificarVuelosVista.textField_5.setText(alVueloss.get(0).getFechaLlegada().toString());
			modificarVuelosVista.textField_6.setText(alVueloss.get(0).getTiempo());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	if(arg0.getSource() == this.frame.mntmModificarLineas) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().add(modificarLineaVista);			
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.getContentPane().setVisible(true);

		try {
			modificarLineaVista.addListener(new ModificarLineaListener());
			modificarLineaVista.addListener2(new ModificarLineaComboListener());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<LineasAereas> alLineas = new ArrayList<LineasAereas>();
		
		try {
			alLineas = lineasAereas.ListarLineas();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
						
		modificarLineaVista.txtNombre.setText(alLineas.get(0).getNombre());
		modificarLineaVista.textAlianza.setText(alLineas.get(0).getAlianza());

	}

	
	
	}
	
}