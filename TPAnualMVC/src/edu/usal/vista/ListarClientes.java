package edu.usal.vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;



import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarClientes extends JPanel {
	public JButton btnListar;
	public DefaultTableModel modelo;

	public JTable tabla;


	public ListarClientes() throws IOException {
		setBackground(Color.BLACK);


		modelo = new DefaultTableModel();
		btnListar = new JButton("Actualizar");
		btnListar.setBackground(new Color(0, 0, 0));
		btnListar.setForeground(Color.ORANGE);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(194)
					.addComponent(btnListar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(182))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnListar)
					.addGap(13)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tabla = new JTable(modelo);
		scrollPane.setViewportView(tabla);
		setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnListar.addActionListener(al);
	}
}
