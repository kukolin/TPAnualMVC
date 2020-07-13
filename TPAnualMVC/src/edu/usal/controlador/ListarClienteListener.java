package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.Mensajes;

public class ListarClienteListener implements ActionListener{
	
	Mensajes mensaje;
	ListarClientes listarClienteVista;
	ClienteInterfaz clienteInterfaz;
	
	public ListarClienteListener() throws IOException{
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		listarClienteVista = new ListarClientes();
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		ArrayList<Cliente> lista = new ArrayList<Cliente>();
//		
//		try {
//			
//			lista = clienteInterfaz.ListarClientes();
//			listarClienteVista.agregarElemento(lista);
//			
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//		
//		listarClienteVista.modelo.removeAllElements();
//		
//		String datos = "";
//		
//		DefaultListModel<String> modelo = new DefaultListModel<String>();
//
//		
//		
//		for(int i=0;i<lista.size() ;i++) {
//			
//			datos = lista.get(i).getInfo();
//			
//		listarClienteVista.modelo.addElement(datos);
//		
//		}
//		System.out.println(listarClienteVista.modelo.getElementAt(1));
//		
//		
//		modelo.addElement("asd");	
//		modelo.addElement("asd2");	
//
//		listarClienteVista.list.setModel(modelo);
//		
////		listarClienteVista.repaint();
////		listarClienteVista.revalidate();
//		
//		mensaje.Realizado();
		
	}
	
	
}
