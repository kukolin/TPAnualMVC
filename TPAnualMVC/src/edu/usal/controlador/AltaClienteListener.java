package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.vista.AltaCliente;
import edu.usal.vista.Mensajes;

public class AltaClienteListener implements ActionListener{
	
	Mensajes mensaje;
	AltaCliente altaCliente;
	ClienteInterfaz cliInter;

	public AltaClienteListener() throws IOException{
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		altaCliente = Controlador.altaCliente;
		mensaje = new Mensajes();

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(altaCliente.tDni.getText().matches("[0-9]+") && altaCliente.tCuit.getText().matches("[0-9]+"))
		{
		
		try {
			
		Cliente cliente = new Cliente("", "", "", "", null, null, null, null, null);
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente("", "", "", "");
		Pasaporte pasaporte = new Pasaporte("", "", "", null, null);
		Direccion direccion = new Direccion("", "", "", "", "", "");
		Telefono telefono = new Telefono("", "", "");
		
		cliente.setNombreyApellido(altaCliente.tNombre.getText());
		cliente.setCuit_cuil(altaCliente.tCuit.getText());
		cliente.setDni(altaCliente.tDni.getText());
		cliente.setEmail(altaCliente.tEmail.getText());
		
		Date d1 = Date.valueOf(altaCliente.tFechaNac.getText());			
		cliente.setFechaNac(d1);
		
		pasajeroFrecuente.setAerolinea(altaCliente.tAerolinea.getText());
		pasajeroFrecuente.setAlianza(altaCliente.tAlianza.getText());
		pasajeroFrecuente.setCategoria(altaCliente.tCategoriaFrec.getText());
		pasajeroFrecuente.setNumero(altaCliente.tNumeroFrec.getText());
		
		pasaporte.setAutoridad(altaCliente.tAutoridad.getText());
		pasaporte.setNumero(altaCliente.tNumeroPas.getText());
		pasaporte.setPais(altaCliente.paisEmic.getSelectedItem().toString());
	
		
		Date d2 = Date.valueOf(altaCliente.tFechaEmic.getText());
		//Date d3 = Date.valueOf(altaCliente.tFechaVen.getText());
		pasaporte.setFechaEmision(d1);
		pasaporte.setFechaVencimiento(d2);
		
		telefono.setCelular(altaCliente.tCelular.getText());
		telefono.setLaboral(altaCliente.tLaboral.getText());
		telefono.setPersonal(altaCliente.tPersonal.getText());
		
		direccion.setAltura(altaCliente.tAltura.getText());
		direccion.setCalle(altaCliente.tCalle.getText());
		direccion.setCiudad(altaCliente.tCiudad.getText());
		direccion.setCodigo(altaCliente.tCodPostal.getText());
		direccion.setPais(altaCliente.paisDir.getSelectedItem().toString());
		
	//	altaCliente.addListener2(new paisListener());
		
		if(direccion.getPais().equals("Argentina")) {
		
		direccion.setProvincia(altaCliente.provincias.getSelectedItem().toString());
		}
		else {
			direccion.setProvincia(altaCliente.provincia2.getText());
		}
		
		
		cliente.setPasajeroFrecuente(pasajeroFrecuente);
		cliente.setPasaporte(pasaporte);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		
		
		
			cliInter.AltaCliente(cliente);
			mensaje.Realizado();
		
		} catch (SQLException e1) {
			mensaje.Verificar();
		//	e1.printStackTrace();
		}
		
		}
		else {
			mensaje.ErrorNumerico();
		}
		
		
	}	
}
