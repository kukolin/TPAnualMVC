package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;
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
		
		ArrayList<LineasAereas> lista = null;
		
		try {
			
			lista = linInter.ListarLineas();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	//	String datos = "";
		
	//	listarLinea.modelo
		
        Object[] object = new Object[lista.size()];
                
		listarLinea.modelo = (DefaultTableModel) listarLinea.tabla.getModel();
		
        listarLinea.modelo.setRowCount(0);
		
        if (lista.size() != 0) {
           for (int i = 0; i < object.length; i++) {
            	
                object[0] = lista.get(i).getNombre();
                object[1] = lista.get(i).getAlianza();
                object[2] = lista.get(i).getVuelos();
                
        		listarLinea.modelo.addRow(object);
        		

            }
        }
        


		mensaje.Realizado();
		
	}
}
