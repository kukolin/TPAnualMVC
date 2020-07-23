package edu.usal.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarClienteVista;

public class ModificarClienteComboListener implements ItemListener{
	
	ModificarClienteVista modificarClienteVista;
	ClienteInterfaz clienteInterfaz;
	Mensajes mensaje;
	
	public ModificarClienteComboListener() throws IOException {
		modificarClienteVista = MenuListener.modificarClienteVista;
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		mensaje = new Mensajes();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		int idSelec = modificarClienteVista.comboBox.getSelectedIndex();
		
		ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		
		try {
			alClientes = clienteInterfaz.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
						
		modificarClienteVista.textField.setText(alClientes.get(idSelec).getNombreyApellido());
		modificarClienteVista.textField_1.setText(alClientes.get(idSelec).getDni());
		modificarClienteVista.textField_2.setText(alClientes.get(idSelec).getCuit_cuil());
		modificarClienteVista.textField_3.setText(alClientes.get(idSelec).getFechaNac().toString());
		modificarClienteVista.textField_4.setText(alClientes.get(idSelec).getEmail());
		
		
	}
}
