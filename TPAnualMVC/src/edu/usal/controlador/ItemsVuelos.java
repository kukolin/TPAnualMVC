package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Vuelos;

public class ItemsVuelos {
	
	static VuelosInterfaz vuelosInterfaz;
	
	public static String[] valores() throws IOException, SQLException {
		
		vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		ArrayList<Vuelos> al = new ArrayList<Vuelos>();
		ArrayList<String> al2 = new ArrayList<String>();
		al = vuelosInterfaz.ListarVuelos();
		for(int i=0;i<al.size();i++)
			al2.add("Numero de vuelo: " + al.get(i).getNumero() + ", Fecha: " +al.get(i).getFechaSalida());
		
		String[] al3 = al2.toArray(new String[al2.size()]);
		return al3;
			
	}
	
}
