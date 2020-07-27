package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.DireccionFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.PasajeroFrecuenteFactory;
import edu.usal.dao.factory.PasaporteFactory;
import edu.usal.dao.factory.TelefonoFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.DireccionInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.PasajeroFrecuenteInterfaz;
import edu.usal.dao.interfaces.PasaporteInterfaz;
import edu.usal.dao.interfaces.TelefonoInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarClienteVista;

public class ModificarClienteListener implements ActionListener{

	Mensajes mensaje;
	public static ModificarClienteVista modificarClienteVista;
	ClienteInterfaz clienteInterfaz;
	TelefonoInterfaz telefonoInterfaz;
	PasaporteInterfaz pasaporteInterfaz;
	DireccionInterfaz direccionInterfaz;
	PasajeroFrecuenteInterfaz pasajeroFrecuenteInterfaz;
	
	public ModificarClienteListener() throws IOException{
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		telefonoInterfaz = TelefonoFactory.GetImplementation("MSSQL");
		pasaporteInterfaz = PasaporteFactory.GetImplementation("MSSQL");
		direccionInterfaz = DireccionFactory.GetImplementation("MSSQL");
		pasajeroFrecuenteInterfaz = PasajeroFrecuenteFactory.GetImplementation("MSSQL");
		
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

		
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(0, "", "", "", "");
		Pasaporte pasaporte = new Pasaporte(0, "", "", "", null, null);
		Direccion direccion = new Direccion(0, "", "", "", "", "", "");
		Telefono telefono = new Telefono(0, "", "", "");
		Cliente cliente = new Cliente(0, "", "", "", "", null, pasaporte, telefono, direccion, pasajeroFrecuente);
		
		if(modificarClienteVista.textField_1.getText().matches("[0-9]+") && modificarClienteVista.textField_2.getText().matches("[0-9]+"))
		{
		try {
			String pattern = "dd-MM-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
			Date dateNac = simpleDateFormat.parse(modificarClienteVista.textField_3.getText());
			java.sql.Date dateNac2= new java.sql.Date(dateNac.getTime());
			
			java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
			
			
			
		cliente.setNombreyApellido(modificarClienteVista.textField.getText());
		cliente.setDni(modificarClienteVista.textField_1.getText());
		cliente.setCuit_cuil(modificarClienteVista.textField_2.getText());
		cliente.setFechaNac(dateNac2);
		cliente.setEmail(modificarClienteVista.textField_4.getText());
		
		
		
		
		if(dateNac.getTime() > hoy.getTime()) {
			mensaje.ErrorDeFecha();
		}
		else {
		clienteInterfaz.ModificarCliente(idSelec, cliente);
		mensaje.Realizado();
		}
		
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}}
		else {
			mensaje.ErrorNumerico();
		}
	
	}
}
