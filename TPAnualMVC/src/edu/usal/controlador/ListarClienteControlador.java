package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.ListarLinea;
import edu.usal.vista.Mensajes;

public class ListarClienteControlador implements ActionListener{
	
	Mensajes mensaje;
	ListarClientes listarCliente;
	ClienteInterfaz clienteInterfaz;
	
	public ListarClienteControlador() throws IOException{
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		listarCliente = Controlador.listarClientes;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			
			lista = clienteInterfaz.ListarClientes();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String datos = "";
		
		for(int i=0;i<lista.size() ;i++) {
			lista.get(i).toString();			
			
			
			
			
		listarCliente.modelo.addElement(datos);
		
		}
		mensaje.Realizado();
		
	}
}
