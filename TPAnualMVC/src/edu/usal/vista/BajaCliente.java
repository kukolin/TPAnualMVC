package edu.usal.vista;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import edu.usal.controlador.ItemsClienteListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class BajaCliente extends JPanel {
	public JButton btnEnviar;
	public JComboBox comboBox;
	ItemsClienteListener itemsClienteListener;

	public BajaCliente() throws IOException, SQLException {
		setBackground(Color.BLACK);
		itemsClienteListener = new ItemsClienteListener();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblIngreseElId = new JLabel("Ingrese el ID del cliente a eliminar:");
		lblIngreseElId.setForeground(Color.ORANGE);
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		
		comboBox = new JComboBox(itemsClienteListener.valores());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(120)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addGap(114))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(163)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(171))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(189)
					.addComponent(lblNewLabel)
					.addContainerGap(261, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(142)
					.addComponent(comboBox, 0, 159, Short.MAX_VALUE)
					.addGap(149))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(75)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(70))
		);
		setLayout(groupLayout);
		
		
		

	}
	public void addListener(ActionListener al) {
		btnEnviar.addActionListener(al);
	}
}
