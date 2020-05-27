package edu.usal.vista;

import javax.swing.JPanel;

import java.awt.event.ActionListener;

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

public class AltaVentas extends JPanel {
	public JTextField tidVuelo;
	public JTextField tidcliente;
	public JTextField tidLinea;
	public JTextField tFechaVen;
	public JRadioButton rdbtnEfectivo;
	public JRadioButton rdbtnTarjetaCuotas;
	public JRadioButton rdbtnTarjetaCuotas_1;
	public JButton btnEnviar;
	public ButtonGroup grupo;

	/**
	 * Create the panel.
	 */
	public AltaVentas() {
		setBackground(new Color(0, 0, 128));
		
		JLabel lblIdvuelo = new JLabel("id Vuelo:");
		lblIdvuelo.setForeground(new Color(255, 0, 0));
		lblIdvuelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblIdcliente = new JLabel("id Cliente:");
		lblIdcliente.setForeground(new Color(255, 0, 0));
		lblIdcliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblIdLineaAerea = new JLabel("id Linea Aerea:");
		lblIdLineaAerea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdLineaAerea.setForeground(new Color(255, 0, 0));
		
		JLabel lblFechaVenta = new JLabel("Fecha Venta: (yyyy/MM/dd)");
		lblFechaVenta.setForeground(new Color(255, 0, 0));
		lblFechaVenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		
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

		tidVuelo = new JTextField();
		tidVuelo.setColumns(10);
		
		tidcliente = new JTextField();
		tidcliente.setColumns(10);
		
		tidLinea = new JTextField();
		tidLinea.setColumns(10);
		
		tFechaVen = new JTextField();
		tFechaVen.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(new Color(255, 0, 0));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblIdvuelo, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
							.addGap(104)
							.addComponent(tidVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(152))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblIdcliente, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
							.addGap(65)
							.addComponent(tidcliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(152))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblIdLineaAerea, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
							.addGap(28)
							.addComponent(tidLinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(152))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFechaVenta, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(tFechaVen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(152))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFormaDePago, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
							.addGap(182)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(23))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(rdbtnEfectivo, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(rdbtnTarjetaCuotas, GroupLayout.PREFERRED_SIZE, 131, Short.MAX_VALUE)
							.addGap(2)
							.addComponent(rdbtnTarjetaCuotas_1, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
					.addGap(6))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tidVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIdvuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3)))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIdcliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tidcliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIdLineaAerea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tidLinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFechaVenta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tFechaVen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
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
