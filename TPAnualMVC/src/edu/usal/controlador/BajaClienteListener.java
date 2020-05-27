package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.vista.BajaCliente;
import edu.usal.vista.Mensajes;

public class BajaClienteListener implements ActionListener{
	
	Mensajes mensaje;
	BajaCliente bajaCliente;
	ClienteInterfaz cliInter;
	
	public BajaClienteListener() throws IOException{
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		bajaCliente = Controlador.bajaCliente;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {			
		
		try {
			
			if(bajaCliente.textField.getText().matches("[0-9]+")) {
				
				cliInter.BajaCliente(Integer.parseInt(bajaCliente.textField.getText()));
				
				mensaje.Realizado();
			}
			else mensaje.ErrorNumerico();		
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
		}
	}
	
}
