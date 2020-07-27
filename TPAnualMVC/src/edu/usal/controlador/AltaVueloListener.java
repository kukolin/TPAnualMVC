package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.AltaVuelo;
import edu.usal.vista.Mensajes;

public class AltaVueloListener implements ActionListener{
	
	Mensajes mensaje;
	AltaVuelo altaVueloVista;
	LineasAereasInterfaz lineasAereasInterfaz;
	static ClienteInterfaz clienteImple;
	VuelosInterfaz vuelosInter;
	
	public AltaVueloListener() throws IOException {
		vuelosInter = VuelosFactory.GetImplementation("MSSQL");
		lineasAereasInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		altaVueloVista = MenuListener.altaVuelo;
		
		mensaje = new Mensajes();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {					
			
		ArrayList<LineasAereas> alLineasAereas = new ArrayList<LineasAereas>();
		
		try {
			alLineasAereas = lineasAereasInterfaz.ListarLineas();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

		int idSelecLineas = altaVueloVista.comboBox.getSelectedIndex();
		LineasAereas lineasAereas = alLineasAereas.get(idSelecLineas);
		
		if(altaVueloVista.tfCantidadAsientos.getText().matches("[0-9]+"))
		{
			try {
			
				String pattern = "dd-MM-yyyy";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				
				Date dateSalida = simpleDateFormat.parse(altaVueloVista.tfFechaSalida.getText());
				java.sql.Date dateSalida2= new java.sql.Date(dateSalida.getTime());
				
				Date dateLlegada = simpleDateFormat.parse(altaVueloVista.tfFechaLlegada.getText());
				java.sql.Date dateLlegada2= new java.sql.Date(dateLlegada.getTime());
				
				java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());
				
				
				String numero = altaVueloVista.tfNumero.getText();
				String tiempo = altaVueloVista.tfTiempoVuelo.getText();
				int cantAsientos = Integer.parseInt(altaVueloVista.tfCantidadAsientos.getText());
				String aeroSalida = altaVueloVista.tfAeropuertoSalida.getText();
				String aeroLlegada = altaVueloVista.tfAeropuertoLlegada.getText();
//				int lineasAereas = idSelecLineas;	
				
				
				
			Vuelos vuelos = new Vuelos(numero, tiempo, cantAsientos, dateSalida2, dateLlegada2, aeroSalida, aeroLlegada, lineasAereas);
			
			if(dateLlegada.getTime() > hoy.getTime() || dateSalida.getTime() > hoy.getTime()) {
				mensaje.ErrorDeFecha();
			}
			else
			if(dateLlegada.getTime() > dateSalida.getTime()) {
				mensaje.LlegadaMayorASalida();
			}
			else {
				vuelosInter.AltaVuelos(vuelos, lineasAereas);
				mensaje.Realizado();
			}

			
			} catch (Exception e1) {
				
				mensaje.Verificar();
				
			//	e1.printStackTrace();
			}
		}
			else {
				mensaje.ErrorNumerico();
			}
	

	}

	
}
