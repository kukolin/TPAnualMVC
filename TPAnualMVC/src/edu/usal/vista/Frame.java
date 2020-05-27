package edu.usal.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.controlador.Controlador;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnLineasAereas;
	private JMenu mnVuelos;
	private JMenu mnVentas;
	public JMenuItem mntmVentas;
	public JMenuItem mntmAltaDeVuelos;
	public JMenuItem mntmBajaDeVuelos;
	public JMenuItem mntmListarVuelos;
	public JMenuItem mntmAltaDeLineas;
	public JMenuItem mntmBajaDeLineas;
	public JMenuItem mntmListarLineas;
	public JMenuItem mntmAltaCliente;
	public JMenuItem mntmBajaCliente;
	public JMenuItem mntmListarClientes;
	public JMenuItem mntmAcercaDe;
	public JMenuItem mntmSalir;
	private JPanel panel;
	private JLabel lblSeleccioneUnaOpcin;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws SQLException 
	 */
	public Frame() throws IOException, SQLException {
		
		Controlador controlador = new Controlador(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 430);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo...");
		menuBar.add(mnNewMenu);
		
		mntmAcercaDe = new JMenuItem("Acerca de...");
		mntmAcercaDe.addActionListener(controlador);
		mnNewMenu.add(mntmAcercaDe);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(controlador);
		mnNewMenu.add(mntmSalir);
		
		mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		mntmAltaCliente = new JMenuItem("Alta Cliente");
		mntmAltaCliente.addActionListener(controlador);
		mnNewMenu_1.add(mntmAltaCliente);
		
		mntmBajaCliente = new JMenuItem("Baja Cliente");
		mntmBajaCliente.addActionListener(controlador);
		mnNewMenu_1.add(mntmBajaCliente);
		
		mntmListarClientes = new JMenuItem("Listar Clientes");
		mntmListarClientes.addActionListener(controlador);
		mnNewMenu_1.add(mntmListarClientes);
		
		mnLineasAereas = new JMenu("Lineas Aereas");
		menuBar.add(mnLineasAereas);
		
		mntmAltaDeLineas = new JMenuItem("Alta de Lineas");
		mntmAltaDeLineas.addActionListener(controlador);
		mnLineasAereas.add(mntmAltaDeLineas);
		
		mntmBajaDeLineas = new JMenuItem("Baja de Lineas");
		mntmBajaDeLineas.addActionListener(controlador);
		mnLineasAereas.add(mntmBajaDeLineas);
		
		mntmListarLineas = new JMenuItem("Listar Lineas");
		mntmListarLineas.addActionListener(controlador);
		mnLineasAereas.add(mntmListarLineas);
		
		mnVuelos = new JMenu("Vuelos");
		menuBar.add(mnVuelos);
		
		mntmAltaDeVuelos = new JMenuItem("Alta de Vuelos");
		mntmAltaDeVuelos.addActionListener(controlador);
		mnVuelos.add(mntmAltaDeVuelos);
		
		mntmBajaDeVuelos = new JMenuItem("Baja de Vuelos");
		mntmBajaDeVuelos.addActionListener(controlador);
		mnVuelos.add(mntmBajaDeVuelos);
		
		mntmListarVuelos = new JMenuItem("Listar Vuelos");
		mntmListarVuelos.addActionListener(controlador);
		mnVuelos.add(mntmListarVuelos);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVentas = new JMenuItem("Ventas");
		mntmVentas.addActionListener(controlador);
		mnVentas.add(mntmVentas);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, "name_202213171225400");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("logo usal chico.png"));
		
		JLabel lblBienvenido = new JLabel("Bienvenido! ");
		lblBienvenido.setForeground(Color.ORANGE);
		lblBienvenido.setFont(new Font("Harlow Solid Italic", Font.ITALIC, 20));
		
		lblSeleccioneUnaOpcin = new JLabel("Seleccione una opci\u00F3n del men\u00FA de arriba para continuar...");
		lblSeleccioneUnaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnaOpcin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccioneUnaOpcin.setForeground(Color.ORANGE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
					.addGap(309))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(202)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(183))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(75)
					.addComponent(lblSeleccioneUnaOpcin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(73))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBienvenido, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSeleccioneUnaOpcin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
