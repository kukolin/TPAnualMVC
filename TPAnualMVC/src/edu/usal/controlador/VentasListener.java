package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.implementacion.ClienteImpl;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.vista.AltaVentas;
import edu.usal.vista.ListarClientes;
import edu.usal.vista.Mensajes;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.time.LocalDateTime;

public class VentasListener implements ActionListener{
	
	Mensajes mensaje;
	AltaVentas altaVentasVista;
	static ClienteInterfaz clienteImple;
	VentasInterfaz venInter;
	static VuelosInterfaz vuelosInterfaz;
//	ArrayList<Cliente> listaClientes;
	
	public VentasListener() throws IOException, SQLException{
		venInter = VentasFactory.GetImplementation("MSSQL");
		clienteImple = ClienteFactory.GetImplementation("MSSQL");
		vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		altaVentasVista = MenuListener.altaVentas;
		
		mensaje = new Mensajes();


	}
	
	@Override
	public void actionPerformed(ActionEvent e) {					
			
			
			try {
			
			ArrayList<Cliente> alClientes = clienteImple.ListarClientes();
			ArrayList<Vuelos> alVuelos = vuelosInterfaz.ListarVuelos();
			
			int clienteSel = altaVentasVista.comboClientes.getSelectedIndex();
			Cliente cliente = alClientes.get(clienteSel);	
			
			int vuelosSel = altaVentasVista.comboVuelo.getSelectedIndex();
			Vuelos vuelos = alVuelos.get(vuelosSel);
			
			java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

			Ventas venta = new Ventas(cliente, vuelos, date, "");
			
			if(altaVentasVista.rdbtnEfectivo.isSelected()) venta.setFormaDePago("Efectivo");	
			if(altaVentasVista.rdbtnTarjetaCuotas.isSelected()) venta.setFormaDePago("3 Cuotas");
			if(altaVentasVista.rdbtnTarjetaCuotas_1.isSelected()) venta.setFormaDePago("12 Cuotas");				
			
			

//			System.out.println(altaVentasVista.comboClientes.getSelectedItem());
//			System.out.println(altaVentasVista.comboClientes.getSelectedIndex());
			
		//	venta.setIdVuelo(Integer.parseInt(altaVentasVista.tidVuelo.getText()));
			
		

				venInter.AltaVentas(venta, vuelos, cliente);
				mensaje.Realizado();
			} catch (Exception e1) {
				
				mensaje.Verificar();
				
			//	e1.printStackTrace();
			}

	

	}

	
}
