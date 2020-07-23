package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

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
			
		Cliente cliente = new Cliente(0,"", "", "", "", null, 0, 0, 0, 0);
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente("", "", "", "");
		Pasaporte pasaporte = new Pasaporte("", "", "", null, null);
		Direccion direccion = new Direccion("", "", "", "", "", "");
		Telefono telefono = new Telefono("", "", "");
		
		cliente.setNombreyApellido(altaClienteVista.tNombre.getText());
		cliente.setCuit_cuil(altaClienteVista.tCuit.getText());
		cliente.setDni(altaClienteVista.tDni.getText());
		cliente.setEmail(altaClienteVista.tEmail.getText());
		
		Date d1 = Date.valueOf(altaClienteVista.tFechaNac.getText());			
		cliente.setFechaNac(d1);
		
		pasajeroFrecuente.setAerolinea(altaClienteVista.tAerolinea.getText());
		pasajeroFrecuente.setAlianza(altaClienteVista.tAlianza.getText());
		pasajeroFrecuente.setCategoria(altaClienteVista.tCategoriaFrec.getText());
		pasajeroFrecuente.setNumero(altaClienteVista.tNumeroFrec.getText());
		int pasajeroFrecuenteId = pasajeroFrecuenteInterfaz.AltaPasajeroFrecuente(pasajeroFrecuente);
		
		pasaporte.setAutoridad(altaClienteVista.tAutoridad.getText());
		pasaporte.setNumero(altaClienteVista.tNumeroPas.getText());
		pasaporte.setPais(altaClienteVista.paisEmic.getSelectedItem().toString());
		
		
		Date d2 = Date.valueOf(altaClienteVista.tFechaEmic.getText());
		//Date d3 = Date.valueOf(altaCliente.tFechaVen.getText());
		pasaporte.setFechaEmision(d1);
		pasaporte.setFechaVencimiento(d2);
		int pasaporteId = pasaporteInterfaz.AltaPasaporte(pasaporte);
		
		
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

		
		cliente.setIdPasajeroFrecuente(pasajeroFrecuenteId);
		cliente.setIdPasaporte(pasaporteId);
		cliente.setIdDireccion(direccionId);
		
		cliente.setIdTelefono(telefonoInterfaz.getTelefono());
		
		
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
