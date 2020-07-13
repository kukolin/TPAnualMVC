package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;

public class AgregarItemsLinea {

	LineasAereasInterfaz linInter;
	DefaultTableModel modelo;
	
	public  AgregarItemsLinea() throws IOException {
		linInter = LineasAereasFactory.GetImplementation("MSSQL");
	}
	
	
	
	public DefaultTableModel items() {
		
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Alianza");
		modelo.addColumn("Vuelos");
		
		ArrayList<LineasAereas> lista = null;
		
		
		try {
			lista = linInter.ListarLineas();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
    Object[] object = new Object[lista.size()];
            	
    modelo.setRowCount(0);
	
    if (lista.size() != 0) {
       for (int i = 0; i < object.length; i++) {
        	
            object[0] = lista.get(i).getNombre();
            object[1] = lista.get(i).getAlianza();
            object[2] = lista.get(i).getVuelos();
            
    		modelo.addRow(object);
    		
    //		System.out.println(lista.get(i).getNombre());

        }
		

    }

    return modelo;
		}
	
	
}
