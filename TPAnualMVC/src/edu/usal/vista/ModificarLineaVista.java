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

public class ModificarLineaVista extends JPanel {
	public JButton btnEnviar;
	public JComboBox comboBox;
	private JLabel lblLinea;
	private JLabel lblNombre;
	private JLabel lblAlianza;
	public JTextField textAlianza;
	public JTextField txtNombre;
	ItemsLineasAereas itemsLineasAereas;
	
	public ModificarLineaVista() throws IOException, SQLException {
		setBackground(Color.BLACK);
		itemsLineasAereas = new ItemsLineasAereas();
		btnEnviar = new JButton("Modificar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBox = new JComboBox(itemsLineasAereas.valores());
		
		lblLinea = new JLabel("Linea Aerea:");
		lblLinea.setForeground(Color.ORANGE);
		lblLinea.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblAlianza = new JLabel("Alianza:");
		lblAlianza.setForeground(Color.ORANGE);
		lblAlianza.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textAlianza = new JTextField();
		textAlianza.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(lblLinea, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, 0, 253, Short.MAX_VALUE)
					.addGap(213))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAlianza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(68))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(78)))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNombre)
								.addComponent(textAlianza))
							.addGap(271))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLinea, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAlianza, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textAlianza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(110)
					.addComponent(btnEnviar)
					.addGap(126))
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
