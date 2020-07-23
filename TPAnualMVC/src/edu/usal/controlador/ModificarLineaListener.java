package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.vista.AltaLinea;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarLineaVista;

public class ModificarLineaListener implements ActionListener{

	Mensajes mensaje;
	public static ModificarLineaVista modificarLineaVista;
	LineasAereasInterfaz lineaInterfaz;
	
	public ModificarLineaListener() throws IOException{
		lineaInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		modificarLineaVista = MenuListener.modificarLineaVista;
		
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		ArrayList<LineasAereas> alLineasAereas = new ArrayList<LineasAereas>();
		
		try {
			alLineasAereas = lineaInterfaz.ListarLineas();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelecLineas = alLineasAereas.get(modificarLineaVista.comboBox.getSelectedIndex()).getIdLinea();
		LineasAereas linea = new LineasAereas(0, null, null, 0);		
		
		try {
		
		linea.setNombre(modificarLineaVista.txtNombre.getText());
		linea.setAlianza(modificarLineaVista.textAlianza.getText());

		
		mensaje.Realizado();
		
		lineaInterfaz.ModificarLineas(idSelecLineas, linea);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}}
	
	}
