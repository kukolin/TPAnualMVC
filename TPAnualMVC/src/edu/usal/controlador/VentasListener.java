package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;

import edu.usal.dao.factory.VentasFactory;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.vista.AltaVentas;
import edu.usal.vista.Mensajes;

public class VentasListener implements ActionListener{
	
	Mensajes mensaje;
	AltaVentas altaVentas;
	VentasInterfaz venInter;
	
	public VentasListener() throws IOException{
		venInter = VentasFactory.GetImplementation("MSSQL");
		altaVentas = Controlador.altaVentas;
		mensaje = new Mensajes();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {			
	
	//	JOptionPane.showMessageDialog(null, altaVentas.tidcliente.getText(), "Warning", JOptionPane.WARNING_MESSAGE);	
		
		
		
		if(altaVentas.tidcliente.getText().matches("[0-9]+") && altaVentas.tidLinea.getText().matches("[0-9]+") && altaVentas.tidVuelo.getText().matches("[0-9]+"))
		{
			
			
			try {
			
			Ventas venta = new Ventas(0, 0, 0, null, "");
			
			Date d1 = Date.valueOf(altaVentas.tFechaVen.getText());
			venta.setFechaVenta(d1);
							
			if(altaVentas.rdbtnEfectivo.isSelected()) venta.setFormaDePago("Efectivo");
			if(altaVentas.rdbtnTarjetaCuotas.isSelected()) venta.setFormaDePago("3 Cuotas");
			if(altaVentas.rdbtnTarjetaCuotas_1.isSelected()) venta.setFormaDePago("12 Cuotas");					
			
			
			venta.setIdCliente(Integer.parseInt(altaVentas.tidcliente.getText()));
			venta.setIdLineaAerea(Integer.parseInt(altaVentas.tidLinea.getText()));
			venta.setIdVuelo(Integer.parseInt(altaVentas.tidVuelo.getText()));
			
			
			
				venInter.AltaVentas(venta);
				mensaje.Realizado();
			} catch (Exception e1) {
				
				mensaje.Verificar();
				
			//	e1.printStackTrace();
			}
		}
		else mensaje.ErrorNumerico();
	

	}

		
}
