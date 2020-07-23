package edu.usal.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarLineaVista;
import edu.usal.vista.ModificarVuelosVista;

public class ModificarVueloComboListener implements ItemListener{
	
	ModificarVuelosVista modificarVuelosVista;
	VuelosInterfaz vuelosInterfaz;
	Mensajes mensaje;
	
	public ModificarVueloComboListener() throws IOException {
		modificarVuelosVista = MenuListener.modificarVuelosVista;
		vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		mensaje = new Mensajes();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		int idSelec = modificarVuelosVista.comboBox.getSelectedIndex();
		
		ArrayList<Vuelos> alVueloss = new ArrayList<Vuelos>();
		
		try {
			alVueloss = vuelosInterfaz.ListarVuelos();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}		
				
		modificarVuelosVista.textField.setText(alVueloss.get(idSelec).getNumero());
		modificarVuelosVista.textField.setText(String.valueOf(alVueloss.get(idSelec).getCantAsientos()));
		modificarVuelosVista.textField_2.setText(alVueloss.get(idSelec).getAeroSalida());
		modificarVuelosVista.textField_3.setText(alVueloss.get(idSelec).getAeroLlegada());
		modificarVuelosVista.textField_4.setText(alVueloss.get(idSelec).getFechaSalida().toString());
		modificarVuelosVista.textField_5.setText(alVueloss.get(idSelec).getFechaLlegada().toString());
		modificarVuelosVista.textField_6.setText(alVueloss.get(idSelec).getTiempo());

		
	}
}
