package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.vista.ListarLinea;
import edu.usal.vista.Mensajes;

public class ListarLineaListener implements ActionListener{
	
	Mensajes mensaje;
	ListarLinea listarLinea;
	LineasAereasInterfaz linInter;
	
	public ListarLineaListener() throws IOException{
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
		listarLinea = Controlador.listarLinea;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		try {
			
			lista = linInter.ListarLineas();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String datos = "";
		
		for(int i=0;i<lista.size() ;i++) {
			datos = lista.get(i);
			//System.out.println(datos);
			
		listarLinea.modelo.addElement(datos);
		
		}
		mensaje.Realizado();
		
	}
}
