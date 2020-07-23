package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.BajaLinea;
import edu.usal.vista.Mensajes;

public class BajaLineaListener implements ActionListener{
	
	Mensajes mensaje;
	BajaLinea bajaLinea;
	LineasAereasInterfaz linInter;
	
	public BajaLineaListener() throws IOException{
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
		bajaLinea = MenuListener.bajaLinea;
		mensaje = new Mensajes();

	}
	
		@Override
		public void actionPerformed(ActionEvent e) {

			ArrayList<LineasAereas> alLineasAereas = new ArrayList<LineasAereas>();
			
			
			try {
					alLineasAereas = linInter.ListarLineas();
					
					int idSelec = alLineasAereas.get(bajaLinea.comboBox.getSelectedIndex()).getIdLinea();

					linInter.BajaLineas(idSelec);
					
					mensaje.Realizado();
						
				
				
			} catch (NumberFormatException | SQLException e1) {
				e1.printStackTrace();
			}
		
	}
}
