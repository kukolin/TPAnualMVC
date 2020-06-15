package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.Mensajes;

public class ListarClienteListener implements ActionListener{
	
	Mensajes mensaje;
	ListarClientes listarCliente;
	ClienteInterfaz clienteInterfaz;
	
	public ListarClienteListener() throws IOException{
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
		
		listarCliente.modelo.removeAllElements();
		
		String datos = "";
		
		for(int i=0;i<lista.size() ;i++) {
			
			datos = lista.get(i).getInfo();
			
			
		listarCliente.modelo.addElement(datos);
		
		}
		mensaje.Realizado();
		
	}
}
