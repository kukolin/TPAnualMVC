package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.DireccionFactory;
import edu.usal.dao.factory.PasajeroFrecuenteFactory;
import edu.usal.dao.factory.PasaporteFactory;
import edu.usal.dao.factory.TelefonoFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.DireccionInterfaz;
import edu.usal.dao.interfaces.PasajeroFrecuenteInterfaz;
import edu.usal.dao.interfaces.PasaporteInterfaz;
import edu.usal.dao.interfaces.TelefonoInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.Mensajes;

public class AltaClienteListener implements ActionListener{
	
	Mensajes mensaje;
	static AltaClienteVista altaClienteVista;
	ClienteInterfaz cliInter;
	TelefonoInterfaz telefonoInterfaz;
	PasaporteInterfaz pasaporteInterfaz;
	DireccionInterfaz direccionInterfaz;
	PasajeroFrecuenteInterfaz pasajeroFrecuenteInterfaz;

	public AltaClienteListener() throws IOException, SQLException{
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		telefonoInterfaz = TelefonoFactory.GetImplementation("MSSQL");
		pasaporteInterfaz = PasaporteFactory.GetImplementation("MSSQL");
		direccionInterfaz = DireccionFactory.GetImplementation("MSSQL");
		pasajeroFrecuenteInterfaz = PasajeroFrecuenteFactory.GetImplementation("MSSQL");
		altaClienteVista = MenuListener.altaClienteVista;
		mensaje = new Mensajes();

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(altaClienteVista.tDni.getText().matches("[0-9]+") && altaClienteVista.tCuit.getText().matches("[0-9]+"))
		{
		
		try {
			
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(0, "", "", "", "");
		Pasaporte pasaporte = new Pasaporte(0, "", "", "", null, null);
		Direccion direccion = new Direccion(0, "", "", "", "", "", "");
		Telefono telefono = new Telefono(0, "", "", "");
//		Cliente cliente = new Cliente(0,"", "", "", "", null, 0, 0, 0, 0);
		Cliente cliente = new Cliente(0, "", "", "", "", null, pasaporte, telefono, direccion, pasajeroFrecuente);

		
		cliente.setNombreyApellido(altaClienteVista.tNombre.getText());
		cliente.setCuit_cuil(altaClienteVista.tCuit.getText());
		cliente.setDni(altaClienteVista.tDni.getText());
		cliente.setEmail(altaClienteVista.tEmail.getText());
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date dateEmicion = simpleDateFormat.parse(altaClienteVista.tFechaEmic.getText());
		java.sql.Date dateEmicion2 = new java.sql.Date(dateEmicion.getTime());
		
		java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		Date dateNac = simpleDateFormat.parse(altaClienteVista.tFechaNac.getText());
		java.sql.Date dateNac2 = new java.sql.Date(dateNac.getTime());
		
		Date dateVen = simpleDateFormat.parse(altaClienteVista.tFechaVen.getText());
		java.sql.Date dateVen2 = new java.sql.Date(dateVen.getTime());
		
//		Date d1 = Date.valueOf(altaClienteVista.tFechaNac.getText());	
		
		cliente.setFechaNac(dateNac2);
		
		pasajeroFrecuente.setAerolinea(altaClienteVista.tAerolinea.getText());
		pasajeroFrecuente.setAlianza(altaClienteVista.tAlianza.getText());
		pasajeroFrecuente.setCategoria(altaClienteVista.tCategoriaFrec.getText());
		pasajeroFrecuente.setNumero(altaClienteVista.tNumeroFrec.getText());
		int pasajeroFrecuenteId = pasajeroFrecuenteInterfaz.AltaPasajeroFrecuente(pasajeroFrecuente);
		pasajeroFrecuente.setIdPasajeroFrecuente(pasajeroFrecuenteId);
		
		pasaporte.setAutoridad(altaClienteVista.tAutoridad.getText());
		pasaporte.setNumero(altaClienteVista.tNumeroPas.getText());
		pasaporte.setPais(altaClienteVista.paisEmic.getSelectedItem().toString());
		
		
		
		
//		Date d2 = Date.valueOf(altaClienteVista.tFechaEmic.getText());
//		Date d3 = Date.valueOf(altaClienteVista.tFechaVen.getText());
		pasaporte.setFechaEmision(dateEmicion2);
		pasaporte.setFechaVencimiento(dateVen2);
		int pasaporteId = pasaporteInterfaz.AltaPasaporte(pasaporte);
		pasaporte.setIdPasaporte(pasaporteId);
		
		
		telefono.setCelular(altaClienteVista.tCelular.getText());
		telefono.setLaboral(altaClienteVista.tLaboral.getText());
		telefono.setPersonal(altaClienteVista.tPersonal.getText());
		
		direccion.setAltura(altaClienteVista.tAltura.getText());
		direccion.setCalle(altaClienteVista.tCalle.getText());
		direccion.setCiudad(altaClienteVista.tCiudad.getText());
		direccion.setCodigo(altaClienteVista.tCodPostal.getText());
		direccion.setPais(altaClienteVista.paisDir.getSelectedItem().toString());

		altaClienteVista.addListener2(new paisListener());
		
		if(direccion.getPais().equals("Argentina")) {
		
		direccion.setProvincia(altaClienteVista.provincias.getSelectedItem().toString());
		}
		else {
			direccion.setProvincia(altaClienteVista.provincia2.getText());
		}
		
		int direccionId = direccionInterfaz.AltaDireccion(direccion);
		direccion.setIdDireccion(direccionId);
		telefono.setIdTelefono(telefonoInterfaz.getTelefono());
		
//		cliente.setIdPasajeroFrecuente(pasajeroFrecuenteId);
//		cliente.setIdPasaporte(pasaporteId);
//		cliente.setIdDireccion(direccionId);
//		
//		cliente.setIdTelefono(telefonoInterfaz.getTelefono());
		
		if(dateEmicion.getTime() > hoy.getTime() || dateNac.getTime() > hoy.getTime() || dateVen.getTime() > hoy.getTime()) {
			mensaje.ErrorDeFecha();
		}
		else {
		if(dateEmicion.getTime() > dateVen.getTime()) {
			mensaje.EmisionMayorAVen();
		}
		else {
			cliInter.AltaCliente(cliente, telefono, pasaporte, pasajeroFrecuente, direccion);
			mensaje.Realizado();	
		}

		
		}
		
		} catch (SQLException | ParseException e1) {
			mensaje.Verificar();
		//	e1.printStackTrace();
		}
		
		}
		else {
			mensaje.ErrorNumerico();
		}
		
		
	}	
}
