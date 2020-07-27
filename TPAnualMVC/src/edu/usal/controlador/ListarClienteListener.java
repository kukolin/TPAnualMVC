package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.Mensajes;

public class ListarClienteListener implements ActionListener{
	
	Mensajes mensaje;
	ListarClientes listarClienteVista;
	ClienteInterfaz clienteInterfaz;
	
	public ListarClienteListener() throws IOException{
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		listarClienteVista = MenuListener.listarClientes;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		if(listarClienteVista.modelo.getColumnCount() != 6) {
		
		listarClienteVista.modelo.addColumn("Nombre");
		listarClienteVista.modelo.addColumn("DNI");
		listarClienteVista.modelo.addColumn("Email");
		listarClienteVista.modelo.addColumn("Fecha Nac.");
		listarClienteVista.modelo.addColumn("Cuit/Cuil");
		listarClienteVista.modelo.addColumn("Telefono");
		}
		
		ArrayList<Cliente> lista = null;
		
		
		try {
			lista = clienteInterfaz.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
    Object[] object = new Object[6];      
    
    listarClienteVista.modelo.setRowCount(0);
 //   listarClienteVista.modelo.setColumnCount(0);

	
    if (lista.size() != 0) {
       for (int i = 0; i < lista.size(); i++) {

    	   Telefono telefono = lista.get(i).getTelefono();

    	   	object[0] = lista.get(i).getNombreyApellido();
            object[1] = lista.get(i).getDni();
            object[2] = lista.get(i).getEmail();
            object[3] = lista.get(i).getFechaNac();
            object[4] = lista.get(i).getCuit_cuil();
            object[5] = telefono.getIdTelefono();

            
            listarClienteVista.modelo.addRow(object);
    		
        }
		

    }

		}
		
	}
	
	

