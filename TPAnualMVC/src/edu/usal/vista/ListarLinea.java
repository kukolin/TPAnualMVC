package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JList;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class ListarLinea extends JPanel {
	public JButton btnListar;
	public DefaultListModel modelo;

	/**
	 * Create the panel.
	 */
	public ListarLinea() {
		
		modelo = new DefaultListModel();
		
		setBackground(Color.BLUE);
		
		btnListar = new JButton("Listar");
		btnListar.setForeground(new Color(255, 0, 0));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBackground(new Color(0, 0, 0));
		
		JList list = new JList();
		list.setModel(modelo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(172)
					.addComponent(btnListar, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(189))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(btnListar)
					.addGap(11)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
					.addGap(24))
		);
		setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnListar.addActionListener(al);
	}
}