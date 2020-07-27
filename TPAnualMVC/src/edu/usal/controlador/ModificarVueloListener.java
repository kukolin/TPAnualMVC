package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarLineaVista;
import edu.usal.vista.ModificarVuelosVista;

public class ModificarVueloListener implements ActionListener{

	Mensajes mensaje;
	public static ModificarVuelosVista modificarVuelosVista;
	VuelosInterfaz vuelosInterfaz;
	LineasAereasInterfaz lineasAereasInterfaz;
	
	public ModificarVueloListener() throws IOException{
		vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		lineasAereasInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		modificarVuelosVista = MenuListener.modificarVuelosVista;
		
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		ArrayList<Vuelos> alVueloss = new ArrayList<Vuelos>();
		ArrayList<LineasAereas> alLineasAereas = new ArrayList<LineasAereas>();
		
		try {
			alVueloss = vuelosInterfaz.ListarVuelos();
			alLineasAereas = lineasAereasInterfaz.ListarLineas();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alVueloss.get(modificarVuelosVista.comboBox.getSelectedIndex()).getIdVuelo();
		
		int idSelecLineas = modificarVuelosVista.comboBox_1.getSelectedIndex();
		LineasAereas lineasAereas = alLineasAereas.get(idSelecLineas);
		
		Vuelos vuelos = new Vuelos("", "", 0, null, null, "", "", lineasAereas);
		
		
		if(modificarVuelosVista.textField_1.getText().matches("[0-9]+"))
		{
		try {
		
		vuelos.setNumero(modificarVuelosVista.textField.getText());
		vuelos.setCantAsientos(Integer.parseInt(modificarVuelosVista.textField_1.getText()));
		vuelos.setAeroSalida(modificarVuelosVista.textField_3.getText());
		vuelos.setAeroLlegada(modificarVuelosVista.textField_2.getText());
		vuelos.setFechaSalida(Date.valueOf(modificarVuelosVista.textField_4.getText().toString()));
		vuelos.setFechaLlegada(Date.valueOf(modificarVuelosVista.textField_5.getText().toString()));
		vuelos.setTiempo(modificarVuelosVista.textField_6.getText());
		
		mensaje.Realizado();
		
		vuelosInterfaz.ModificarVuelo(idSelec, vuelos, lineasAereas);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}}
		else {
			mensaje.ErrorNumerico();
		}
	
	}
}
