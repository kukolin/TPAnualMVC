package edu.usal.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import edu.usal.controlador.ItemsLineasAereas;

import javax.swing.JComboBox;

public class AltaVuelo extends JPanel {
	public JButton btnEnviar;
	public JTextField tfCantidadAsientos;
	public JTextField tfAeropuertoSalida;
	public JTextField tfAeropuertoLlegada;
	public JTextField tfFechaSalida;
	public JTextField tfFechaLlegada;
	public JTextField tfTiempoVuelo;
	public JTextField tfNumero;
	ItemsLineasAereas itemsLineasAereas;
	public JComboBox comboBox;
	
	public AltaVuelo() throws IOException, SQLException {

			setBackground(Color.BLACK);
			itemsLineasAereas = new ItemsLineasAereas();
			JLabel lblNumero = new JLabel("Numero:");
			lblNumero.setForeground(Color.ORANGE);
			lblNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			JLabel lblCantAsientos = new JLabel("Cant. Asientos");
			lblCantAsientos.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblCantAsientos.setForeground(Color.ORANGE);
			
			JLabel lblAeropuertoSalida = new JLabel("Aeropuerto de salida:");
			lblAeropuertoSalida.setForeground(Color.ORANGE);
			lblAeropuertoSalida.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBackground(new Color(0, 0, 0));
			btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnEnviar.setForeground(Color.ORANGE);
			
			JLabel lblAeropuertoLlegada = new JLabel("Aeropuerto de llegada:");
			lblAeropuertoLlegada.setForeground(Color.ORANGE);
			lblAeropuertoLlegada.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			JLabel lblFechaSalida = new JLabel("Fecha salida:");
			lblFechaSalida.setForeground(Color.ORANGE);
			lblFechaSalida.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			JLabel lblFechaLlegada = new JLabel("Fecha Llegada:");
			lblFechaLlegada.setForeground(Color.ORANGE);
			lblFechaLlegada.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			JLabel lblTiempoDeVuelo = new JLabel("Tiempo de vuelo:");
			lblTiempoDeVuelo.setForeground(Color.ORANGE);
			lblTiempoDeVuelo.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			JLabel lblLineaAerea = new JLabel("Linea Aerea:");
			lblLineaAerea.setForeground(Color.ORANGE);
			lblLineaAerea.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			tfNumero = new JTextField();
			tfNumero.setColumns(10);
			
			tfCantidadAsientos = new JTextField();
			tfCantidadAsientos.setColumns(10);
			
			tfAeropuertoSalida = new JTextField();
			tfAeropuertoSalida.setColumns(10);
			
			tfAeropuertoLlegada = new JTextField();
			tfAeropuertoLlegada.setColumns(10);
			
			tfFechaSalida = new JTextField();
			tfFechaSalida.setColumns(10);
			
			tfFechaLlegada = new JTextField();
			tfFechaLlegada.setColumns(10);
			
			tfTiempoVuelo = new JTextField();
			tfTiempoVuelo.setColumns(10);
			
			comboBox = new JComboBox(itemsLineasAereas.valores());
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(24)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblCantAsientos, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
								.addGap(33))
							.addComponent(lblAeropuertoSalida, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblAeropuertoLlegada, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblFechaSalida, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblLineaAerea, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblFechaLlegada, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblTiempoDeVuelo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
						.addGap(49)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(tfTiempoVuelo)
							.addComponent(tfFechaLlegada)
							.addComponent(tfFechaSalida)
							.addComponent(tfAeropuertoLlegada)
							.addComponent(tfAeropuertoSalida)
							.addComponent(tfCantidadAsientos)
							.addComponent(tfNumero)
							.addComponent(comboBox, 0, 116, Short.MAX_VALUE))
						.addGap(93)
						.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
						.addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblNumero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblCantAsientos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addComponent(tfCantidadAsientos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblAeropuertoSalida, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(tfAeropuertoSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblAeropuertoLlegada, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(tfAeropuertoLlegada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblFechaSalida, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(tfFechaSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblFechaLlegada, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(tfFechaLlegada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblTiempoDeVuelo, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(tfTiempoVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblLineaAerea, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(81))
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap(278, Short.MAX_VALUE)
						.addComponent(btnEnviar)
						.addGap(72))
			);
			setLayout(groupLayout);

		}
		
		public void addListener(ActionListener al) {
			btnEnviar.addActionListener(al);
		}
	}
