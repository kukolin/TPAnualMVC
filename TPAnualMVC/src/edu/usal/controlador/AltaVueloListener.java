package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
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

		int idSelecLineas = alLineasAereas.get(altaVueloVista.comboBox.getSelectedIndex()).getIdLinea();
		
		if(altaVueloVista.tfCantidadAsientos.getText().matches("[0-9]+"))
		{
			try {
			
				
				String numero = altaVueloVista.tfNumero.getText();
				String tiempo = altaVueloVista.tfTiempoVuelo.getText();
				int cantAsientos = Integer.parseInt(altaVueloVista.tfCantidadAsientos.getText());
				Date fechaSalida = Date.valueOf(altaVueloVista.tfFechaSalida.getText());
				Date fechaLlegada = Date.valueOf(altaVueloVista.tfFechaLlegada.getText());
				String aeroSalida = altaVueloVista.tfAeropuertoSalida.getText();
				String aeroLlegada = altaVueloVista.tfAeropuertoLlegada.getText();
				int lineasAereas = idSelecLineas;	
				
				
				
			Vuelos vuelos = new Vuelos(numero, tiempo, cantAsientos, fechaSalida, fechaLlegada, aeroSalida, aeroLlegada, lineasAereas, 0);
				
			vuelosInter.AltaVuelos(vuelos);
			
			mensaje.Realizado();
			
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
