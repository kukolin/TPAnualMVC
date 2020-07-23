package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.BajaCliente;
import edu.usal.vista.Mensajes;

public class BajaClienteListener implements ActionListener{
	
	Mensajes mensaje;
	BajaCliente bajaCliente;
	ClienteInterfaz cliInter;
	
	public BajaClienteListener() throws IOException{
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		bajaCliente = MenuListener.bajaCliente;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {			
		
		
		
		ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		
		try {
			alClientes = cliInter.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alClientes.get(bajaCliente.comboBox.getSelectedIndex()).getIdCliente();
		
		try {
			
				
				
				cliInter.BajaCliente(idSelec);
				
				mensaje.Realizado();
					
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
		}
	}
	
}
