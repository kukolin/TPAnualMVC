package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;



public class AgregarItemsCliente {

	ClienteInterfaz clienteInterfaz;
	DefaultTableModel modelo;

	
	public AgregarItemsCliente() throws IOException {
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
	}

	
	public DefaultTableModel items() {
		
		modelo = new DefaultTableModel();
		
		
		modelo.addColumn("Nombre");
		modelo.addColumn("DNI");
		modelo.addColumn("Email");
		modelo.addColumn("Fecha Nac.");
		modelo.addColumn("Cuit/Cuil");
		modelo.addColumn("Telefono");
		
		ArrayList<Cliente> lista = null;
		
		
		try {
			lista = clienteInterfaz.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
    Object[] object = new Object[lista.size()];
            
	
    modelo.setRowCount(0);
	
    if (lista.size() != 0) {
       for (int i = 0; i < object.length; i++) {


    	   	object[0] = lista.get(i).getNombreyApellido();
            object[1] = lista.get(i).getDni();
            object[2] = lista.get(i).getEmail();
            object[3] = lista.get(i).getFechaNac();
            object[4] = lista.get(i).getCuit_cuil();
            object[5] = lista.get(i).getIdTelefono();

            
    		modelo.addRow(object);
    		
        }
		

    }

    return modelo;
		}
}
