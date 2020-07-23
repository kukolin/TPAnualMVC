package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.vista.*;

import javax.swing.JFrame;


public class Controlador extends JFrame{
	
	
	public static Frame frame;
	
	public Controlador(Frame frame) throws IOException, SQLException {
				
		this.frame = frame;	
			
		this.frame.addActionListeners(new MenuListener());

	}

	
	
}
	




