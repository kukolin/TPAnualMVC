package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.ListarVuelo;
import edu.usal.vista.Mensajes;

public class ListarVueloListener implements ActionListener{
	
	Mensajes mensaje;
	ListarVuelo listarVueloVista;
	VuelosInterfaz vuelosInter;
	
	public ListarVueloListener() throws IOException{
		vuelosInter = VuelosFactory.GetImplementation("MSSQL");
		listarVueloVista = MenuListener.listarVuelo;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(listarVueloVista.modelo.getColumnCount() != 8) {	
	listarVueloVista.modelo.addColumn("Numero");
	listarVueloVista.modelo.addColumn("Cantidad de Asientos");
	listarVueloVista.modelo.addColumn("Aeropuerto Salida");
	listarVueloVista.modelo.addColumn("Aeropuerto Llegada");
	listarVueloVista.modelo.addColumn("Fecha Salida");
	listarVueloVista.modelo.addColumn("Fecha Llegada");
	listarVueloVista.modelo.addColumn("Tiempo Vuelo");
	listarVueloVista.modelo.addColumn("Linea Aerea");

	}	
		ArrayList<Vuelos> lista = null;
		
		
		try {
			lista = vuelosInter.ListarVuelos();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
    Object[] object = new Object[8];
            	
    listarVueloVista.modelo.setRowCount(0);
	
    if (lista.size() != 0) {
       for (int i = 0; i < lista.size(); i++) {
        	
            object[0] = lista.get(i).getNumero();
            object[1] = lista.get(i).getCantAsientos();
            object[2] = lista.get(i).getAeroSalida();
            object[3] = lista.get(i).getAeroLlegada();
            object[4] = lista.get(i).getFechaSalida();
            object[5] = lista.get(i).getFechaLlegada();
            object[6] = lista.get(i).getTiempo();
            object[7] = lista.get(i).getLineasAereas();
            
            listarVueloVista.modelo.addRow(object);
    		
        }

    }
}
}

