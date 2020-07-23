package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.LineasAereasFactory;

import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.LineasAereas;

public class ItemsLineasAereas {
	
	static LineasAereasInterfaz lineasAereasInterfaz;
	
	public static String[] valores() throws IOException, SQLException {
		
		lineasAereasInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		ArrayList<LineasAereas> al = new ArrayList<LineasAereas>();
		ArrayList<String> al2 = new ArrayList<String>();
		al = lineasAereasInterfaz.ListarLineas();
		for(int i=0;i<al.size();i++)
			al2.add("Nombre: " + al.get(i).getNombre() + ", Alianza: " +al.get(i).getAlianza());
		
		String[] al3 = al2.toArray(new String[al2.size()]);
		return al3;
			
	}
	
}
