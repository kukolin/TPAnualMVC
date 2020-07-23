package edu.usal.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarLineaVista;

public class ModificarLineaComboListener implements ItemListener{
	
	ModificarLineaVista modificarLineasVista;
	LineasAereasInterfaz lineasInterfaz;
	Mensajes mensaje;
	
	public ModificarLineaComboListener() throws IOException {
		modificarLineasVista = MenuListener.modificarLineaVista;
		lineasInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		mensaje = new Mensajes();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		int idSelec = modificarLineasVista.comboBox.getSelectedIndex();
		
		ArrayList<LineasAereas> alLineas = new ArrayList<LineasAereas>();
		
		try {
			alLineas = lineasInterfaz.ListarLineas();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}		
				
		modificarLineasVista.txtNombre.setText(alLineas.get(idSelec).getNombre());
		modificarLineasVista.textAlianza.setText(alLineas.get(idSelec).getAlianza());


	}
}
