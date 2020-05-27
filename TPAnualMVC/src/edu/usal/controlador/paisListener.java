package edu.usal.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import edu.usal.vista.AltaCliente;

public class paisListener implements ItemListener{
	
	AltaCliente altaCliente;
	
	public paisListener() {
		altaCliente = Controlador.altaCliente;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//mensaje.Realizado();
	//	JOptionPane.showMessageDialog(null,e.getItem().toString(), "Error", JOptionPane.ERROR_MESSAGE);	

		
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
