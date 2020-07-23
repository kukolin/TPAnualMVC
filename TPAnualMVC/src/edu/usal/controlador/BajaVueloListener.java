package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.BajaVuelo;
import edu.usal.vista.Mensajes;

public class BajaVueloListener implements ActionListener{
	
	Mensajes mensaje;
	BajaVuelo bajaVuelo;
	VuelosInterfaz vueloInter;
	
	public BajaVueloListener() throws IOException{
		vueloInter = VuelosFactory.GetImplementation("MSSQL");
		bajaVuelo = MenuListener.bajaVueloVista;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {			
		
		
		
		ArrayList<Vuelos> alVuelos = new ArrayList<Vuelos>();
		
		try {
			alVuelos = vueloInter.ListarVuelos();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alVuelos.get(bajaVuelo.comboBox.getSelectedIndex()).getIdVuelo();
		
		try {
			
				
				
				vueloInter.BajaVuelos(idSelec);
				
				mensaje.Realizado();
					
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
		}
	}
	
}
