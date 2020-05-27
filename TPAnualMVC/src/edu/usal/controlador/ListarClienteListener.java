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
import edu.usal.vista.ListarClientes;
import edu.usal.vista.ListarLinea;
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
		
		ArrayList<String> lista = new ArrayList<String>();
		
		try {
			
			lista = clienteInterfaz.ListarClientes();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String datos = "";
		
		for(int i=0;i<lista.size() ;i++) {
			datos = lista.get(i);
			//System.out.println(datos);
			
		listarCliente.modelo.addElement(datos);
		
		}
		mensaje.Realizado();
		
	}
}
