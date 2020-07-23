package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.Mensajes;

public class AltaLineaListener implements ActionListener{

	Mensajes mensaje;
	AltaLinea altaLinea;
	LineasAereasInterfaz linInter;
	
	public AltaLineaListener() throws IOException{
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
		altaLinea = MenuListener.altaLinea;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {

			LineasAereas lineas = new LineasAereas(0, null, null, 0);
			
			lineas.setNombre(altaLinea.textField.getText());
			lineas.setAlianza(altaLinea.textField_1.getText());
			
			linInter.AltaLineas(lineas);
			JOptionPane.showMessageDialog(null,"Realizado", "Warning", JOptionPane.WARNING_MESSAGE);
		} catch (SQLException e2) {
			e2.printStackTrace();
			mensaje.Verificar();
		}
	}
	
}
