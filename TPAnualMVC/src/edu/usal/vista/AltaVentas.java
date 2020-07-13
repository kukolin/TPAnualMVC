package edu.usal.vista;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import edu.usal.controlador.ItemsClienteListener;
import edu.usal.controlador.ItemsVuelos;
import edu.usal.controlador.VentasListener;

import javax.swing.JComboBox;

public class AltaVentas extends JPanel {
	public JRadioButton rdbtnEfectivo;
	public JRadioButton rdbtnTarjetaCuotas;
	public JRadioButton rdbtnTarjetaCuotas_1;
	public JButton btnEnviar;
	public ButtonGroup grupo;
	public JComboBox comboClientes;
	ItemsClienteListener itemsClienteListener;
	ItemsVuelos itemsVuelos;
	private JComboBox comboVuelo;

	/**
	 * Create the panel.
	 * @throws IOException 
	 * @throws SQLException 
	 */
	public AltaVentas() throws IOException, SQLException {
		setBackground(new Color(0, 0, 128));
		itemsClienteListener  = new ItemsClienteListener();
		itemsVuelos = new ItemsVuelos();
		
		
		JLabel lblIdvuelo = new JLabel("Vuelo:");
		lblIdvuelo.setForeground(new Color(255, 0, 0));
		lblIdvuelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblIdcliente = new JLabel("Cliente:");
		lblIdcliente.setForeground(new Color(255, 0, 0));
		lblIdcliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setForeground(new Color(255, 0, 0));
		lblFormaDePago.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		grupo = new ButtonGroup();
		
		rdbtnEfectivo = new JRadioButton("Efectivo", null, true);
		rdbtnEfectivo.setForeground(new Color(255, 0, 0));
		rdbtnEfectivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEfectivo.setBackground(new Color(0, 0, 128));
		
		rdbtnTarjetaCuotas = new JRadioButton("Tarjeta 3 cuotas s/i");
		rdbtnTarjetaCuotas.setForeground(new Color(255, 0, 0));
		rdbtnTarjetaCuotas.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnTarjetaCuotas.setBackground(new Color(0, 0, 128));
		
		rdbtnTarjetaCuotas_1 = new JRadioButton("Tarjeta 12 Cuotas");
		rdbtnTarjetaCuotas_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnTarjetaCuotas_1.setForeground(new Color(255, 0, 0));
		rdbtnTarjetaCuotas_1.setBackground(new Color(0, 0, 128));
		
		grupo.add(rdbtnEfectivo);
		grupo.add(rdbtnTarjetaCuotas);
		grupo.add(rdbtnTarjetaCuotas_1);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(new Color(255, 0, 0));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboClientes = new JComboBox(itemsClienteListener.valores());
		
		comboVuelo = new JComboBox(itemsVuelos.valores());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFormaDePago, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
							.addGap(182)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(23))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(rdbtnEfectivo, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(rdbtnTarjetaCuotas, GroupLayout.PREFERRED_SIZE, 147, Short.MAX_VALUE)
							.addGap(2)
							.addComponent(rdbtnTarjetaCuotas_1, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblIdvuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(104))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblIdcliente, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboVuelo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboClientes, 0, 257, Short.MAX_VALUE))
							.addGap(49)))
					.addGap(6))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdvuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdcliente, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
						.addComponent(comboClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(101)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblFormaDePago, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(5))
						.addComponent(btnEnviar))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnEfectivo)
						.addComponent(rdbtnTarjetaCuotas)
						.addComponent(rdbtnTarjetaCuotas_1))
					.addGap(30))
		);
		setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnEnviar.addActionListener(al);
	}
}
