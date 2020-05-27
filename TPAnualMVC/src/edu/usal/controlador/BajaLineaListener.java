package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.vista.BajaLinea;
import edu.usal.vista.Mensajes;

public class BajaLineaListener implements ActionListener{
	
	Mensajes mensaje;
	BajaLinea bajaLinea;
	LineasAereasInterfaz linInter;
	
	public BajaLineaListener() throws IOException{
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
		bajaLinea = Controlador.bajaLinea;
		mensaje = new Mensajes();

	}
	
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				
				if(bajaLinea.textField.getText().matches("[0-9]+")) {
					
					linInter.BajaLineas(Integer.parseInt(bajaLinea.textField.getText()));
					
					mensaje.Realizado();
				}
				else mensaje.ErrorNumerico();		
				
				
			} catch (NumberFormatException | SQLException e1) {
				e1.printStackTrace();
			}
		
	}
}
