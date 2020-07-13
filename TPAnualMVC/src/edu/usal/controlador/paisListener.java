package edu.usal.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.vista.AltaClienteVista;

public class paisListener implements ItemListener{
	
	AltaClienteVista altaCliente;
	
	public paisListener() {
		try {
			altaCliente = new AltaClienteVista();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		if(e.getItem().toString().trim().equals("Argentina")) {
			
			altaCliente.provincias.setEnabled(true);
			altaCliente.provincia2.setEnabled(false);
		
		}
		else {
			altaCliente.provincias.setEnabled(false);
			altaCliente.provincia2.setEnabled(true);

		
		}
	}
}
