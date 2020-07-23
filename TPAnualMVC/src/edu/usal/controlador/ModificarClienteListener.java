package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarClienteVista;

public class ModificarClienteListener implements ActionListener{

	Mensajes mensaje;
	public static ModificarClienteVista modificarClienteVista;
	ClienteInterfaz clienteInterfaz;
	
	public ModificarClienteListener() throws IOException{
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		modificarClienteVista = MenuListener.modificarClienteVista;
		mensaje = new Mensajes();
		
		
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		
		try {
			alClientes = clienteInterfaz.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alClientes.get(modificarClienteVista.comboBox.getSelectedIndex()).getIdCliente();

		
		
		Cliente cliente = new Cliente(0, "ave", "123456", "111", "111", new Date(1234567894), 3, 1, 2, 3);
		
		
		
		if(modificarClienteVista.textField_1.getText().matches("[0-9]+") && modificarClienteVista.textField_2.getText().matches("[0-9]+"))
		{
		try {

		cliente.setNombreyApellido(modificarClienteVista.textField.getText());
		cliente.setDni(modificarClienteVista.textField_1.getText());
		cliente.setCuit_cuil(modificarClienteVista.textField_2.getText());
		cliente.setFechaNac(Date.valueOf(modificarClienteVista.textField_3.getText()));
		cliente.setEmail(modificarClienteVista.textField_4.getText());
		
		
		mensaje.Realizado();
		
		clienteInterfaz.ModificarCliente(idSelec, cliente);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}}
		else {
			mensaje.ErrorNumerico();
		}
	
	}
}
