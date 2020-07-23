package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class ListarVuelo extends JPanel {
	public JButton btnListar;
	public DefaultTableModel modelo;
	public JTable tabla;

	public ListarVuelo() throws IOException {

		modelo = new DefaultTableModel();
		
		setBackground(Color.BLACK);
		btnListar = new JButton("Actualizar");
		btnListar.setForeground(Color.ORANGE);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBackground(new Color(0, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(172)
					.addComponent(btnListar, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(189))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(btnListar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
					.addContainerGap())
		);
		
				
				tabla = new JTable (modelo);
				scrollPane.setViewportView(tabla);
				setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnListar.addActionListener(al);
	}
}