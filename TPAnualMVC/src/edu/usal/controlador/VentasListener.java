package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.implementacion.ClienteImpl;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Ventas;
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
	ArrayList<Cliente> listaClientes;
	
	public VentasListener() throws IOException, SQLException{
		venInter = VentasFactory.GetImplementation("MSSQL");
		clienteImple = ClienteFactory.GetImplementation("MSSQL");
		
		altaVentasVista = new AltaVentas();
		mensaje = new Mensajes();
		
//
//		try {
//			for(int i=0;i<clienteImple.ListarClientes().size(); i++) {
//			altaVentasVista.comboClientes.addItem(new ComboItem(clienteImple.ListarClientes().get(i).getNombreyApellido(), "Value 3"));
//			
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {			
	
	//	JOptionPane.showMessageDialog(null, altaVentasVista.tidcliente.getText(), "Warning", JOptionPane.WARNING_MESSAGE);	
		
			
			
			try {
			
			ArrayList<Cliente> alClientes = clienteImple.ListarClientes();
				
			Ventas venta = new Ventas(0, 0, 0, null , "");
			
			java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

			venta.setFechaVenta(date);
							
			if(altaVentasVista.rdbtnEfectivo.isSelected()) venta.setFormaDePago("Efectivo");
			if(altaVentasVista.rdbtnTarjetaCuotas.isSelected()) venta.setFormaDePago("3 Cuotas");
			if(altaVentasVista.rdbtnTarjetaCuotas_1.isSelected()) venta.setFormaDePago("12 Cuotas");					
			
			int ClienteSel = altaVentasVista.comboClientes.getSelectedIndex();
			
			venta.setIdCliente(alClientes.get(ClienteSel).getIdCliente());
		//	venta.setIdVuelo(Integer.parseInt(altaVentasVista.tidVuelo.getText()));
			
			
			
				venInter.AltaVentas(venta);
				mensaje.Realizado();
			} catch (Exception e1) {
				
				mensaje.Verificar();
				
			//	e1.printStackTrace();
			}

	

	}

	
}
