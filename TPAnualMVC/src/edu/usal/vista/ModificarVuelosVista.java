package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import edu.usal.controlador.ItemsClienteListener;
import edu.usal.controlador.ItemsLineasAereas;
import edu.usal.controlador.ItemsVuelos;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ModificarVuelosVista extends JPanel {
	public JButton btnEnviar;
	public ItemsVuelos itemsVuelos;
	public JComboBox comboBox;
	private JLabel lblCliente;
	private JLabel lblNumero;
	private JLabel lblCantidadAsientos;
	private JLabel lblAeropuertoSalida;
	private JLabel lblAeropuertoLlegada;
	private JLabel lblFechaSalida;
	private JLabel lblFechaLlegada;
	private JLabel lblTiempoDeVuelo;
	private JLabel lblLineaAerea;
	public JTextField textField_3;
	public JTextField textField_2;
	public JTextField textField_1;
	public JTextField textField;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	ItemsLineasAereas itemsLineasAereas;
	public JComboBox comboBox_1;
	
	public ModificarVuelosVista() throws IOException, SQLException {
		setBackground(Color.BLACK);
		itemsVuelos = new ItemsVuelos();
		itemsLineasAereas = new ItemsLineasAereas();
		btnEnviar = new JButton("Modificar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBox = new JComboBox(itemsVuelos.valores());
		
		lblCliente = new JLabel("Vuelo:");
		lblCliente.setForeground(Color.ORANGE);
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNumero = new JLabel("Numero:");
		lblNumero.setForeground(Color.ORANGE);
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCantidadAsientos = new JLabel("Cantidad Asientos:");
		lblCantidadAsientos.setForeground(Color.ORANGE);
		lblCantidadAsientos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblAeropuertoSalida = new JLabel("Aeropuerto Salida:");
		lblAeropuertoSalida.setForeground(Color.ORANGE);
		lblAeropuertoSalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblAeropuertoLlegada = new JLabel("Aeropuerto Llegada:");
		lblAeropuertoLlegada.setForeground(Color.ORANGE);
		lblAeropuertoLlegada.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setForeground(Color.ORANGE);
		lblFechaSalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblFechaLlegada = new JLabel("Fecha Llegada:");
		lblFechaLlegada.setForeground(Color.ORANGE);
		lblFechaLlegada.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblTiempoDeVuelo = new JLabel("Tiempo de Vuelo:");
		lblTiempoDeVuelo.setForeground(Color.ORANGE);
		lblTiempoDeVuelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblLineaAerea = new JLabel("Linea Aerea: ");
		lblLineaAerea.setForeground(Color.ORANGE);
		lblLineaAerea.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		comboBox_1 = new JComboBox(itemsLineasAereas.valores());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(lblCliente, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, 0, 253, Short.MAX_VALUE)
					.addGap(213))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAeropuertoLlegada, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
							.addGap(40))
						.addComponent(lblAeropuertoSalida, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCantidadAsientos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(68))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNumero, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(78))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFechaSalida, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(78))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFechaLlegada, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(78))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTiempoDeVuelo, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
							.addGap(21))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblLineaAerea, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(78)))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_5)
							.addGap(75)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(271))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField)
								.addComponent(textField_1)
								.addComponent(textField_2)
								.addComponent(textField_3))
							.addGap(271))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBox_1, Alignment.LEADING, 0, 116, Short.MAX_VALUE)
								.addComponent(textField_6))
							.addGap(271))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadAsientos, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAeropuertoSalida, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAeropuertoLlegada, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
							.addComponent(btnEnviar)
							.addGap(126))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFechaSalida, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFechaLlegada, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTiempoDeVuelo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLineaAerea, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(39))))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	public void addListener2(ItemListener al) {
		
		comboBox.addItemListener(al);
		
	}
}
