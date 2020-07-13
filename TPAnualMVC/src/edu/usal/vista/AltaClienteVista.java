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

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AltaClienteVista extends JPanel {
	public JTextField tNombre;
	public JTextField tDni;
	public JTextField tNumeroPas;
	public JTextField tCuit;
	public JTextField tFechaNac;
	public JTextField tEmail;
	public JTextField tPersonal;
	public JTextField tCelular;
	public JTextField tLaboral;
	public JTextField tAlianza;
	public JTextField tFechaEmic;
	public JTextField tAerolinea;
	public JTextField tNumeroFrec;
	public JTextField tCategoriaFrec;
	public JTextField tFechaVen;
	public JTextField tCalle;
	public JTextField tAltura;
	public JTextField tCiudad;
	public JTextField tCodPostal;
	public JTextField tAutoridad;
	public JButton btnEnviar;
	public JComboBox paisEmic;
	public JComboBox paisDir;
	public JComboBox provincias;
	public JTextField provincia2;

	public AltaClienteVista() throws IOException, SQLException {
		setBackground(new Color(0, 0, 128));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(new Color(255, 0, 0));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDni.setForeground(Color.RED);
		
		JLabel lblPasaporte = new JLabel("Numero Pasaporte:");
		lblPasaporte.setForeground(Color.RED);
		lblPasaporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCuitcuil = new JLabel("CuitCuil");
		lblCuitcuil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuitcuil.setForeground(Color.RED);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setForeground(Color.RED);
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.RED);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblTelefono = new JLabel("Telefono personal:");
		lblTelefono.setForeground(Color.RED);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblPasajeroFrecuente = new JLabel("Alianza Pasajero Frecuente:");
		lblPasajeroFrecuente.setForeground(Color.RED);
		lblPasajeroFrecuente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDireccion = new JLabel("Calle");
		lblDireccion.setForeground(Color.RED);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		tDni = new JTextField();
		tDni.setColumns(10);
		
		tNumeroPas = new JTextField();
		tNumeroPas.setColumns(10);
		
		tCuit = new JTextField();
		tCuit.setColumns(10);
		
		tFechaNac = new JTextField();
		tFechaNac.setColumns(10);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		
		tPersonal = new JTextField();
		tPersonal.setColumns(10);
		
		tCelular = new JTextField();
		tCelular.setColumns(10);
		
		tLaboral = new JTextField();
		tLaboral.setColumns(10);
		
		JLabel lblPaisDeEmision = new JLabel("Pais de Emision");
		lblPaisDeEmision.setForeground(Color.RED);
		lblPaisDeEmision.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblAutoridad = new JLabel("Autoridad:");
		lblAutoridad.setForeground(Color.RED);
		lblAutoridad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblFechaDeEmision = new JLabel("Fecha de Emision");
		lblFechaDeEmision.setForeground(Color.RED);
		lblFechaDeEmision.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblVencimiento = new JLabel("Vencimiento:");
		lblVencimiento.setForeground(Color.RED);
		lblVencimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblTelefonoCelular = new JLabel("Telefono Celular:");
		lblTelefonoCelular.setForeground(Color.RED);
		lblTelefonoCelular.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblTelefonoLaboral = new JLabel("Telefono Laboral:");
		lblTelefonoLaboral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefonoLaboral.setForeground(Color.RED);
		
		tAlianza = new JTextField();
		tAlianza.setColumns(10);
		
		tFechaEmic = new JTextField();
		tFechaEmic.setColumns(10);
		
		JLabel lblAerolinea = new JLabel("Aerolinea");
		lblAerolinea.setForeground(Color.RED);
		lblAerolinea.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNumeroPFrecuente = new JLabel("Numero P. Frecuente");
		lblNumeroPFrecuente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumeroPFrecuente.setForeground(Color.RED);
		
		JLabel lblCategoriaPFrecuente = new JLabel("Categoria P. Frecuente");
		lblCategoriaPFrecuente.setForeground(Color.RED);
		lblCategoriaPFrecuente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tAerolinea = new JTextField();
		tAerolinea.setColumns(10);
		
		tNumeroFrec = new JTextField();
		tNumeroFrec.setColumns(10);
		
		tCategoriaFrec = new JTextField();
		tCategoriaFrec.setColumns(10);
		
		tFechaVen = new JTextField();
		tFechaVen.setColumns(10);
		
		tCalle = new JTextField();
		tCalle.setColumns(10);
		
		tAltura = new JTextField();
		tAltura.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setForeground(Color.RED);
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setForeground(Color.RED);
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblProvincia_1 = new JLabel("Provincia");
		lblProvincia_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProvincia_1.setForeground(Color.RED);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setForeground(Color.RED);
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCodPostal = new JLabel("Cod. Postal");
		lblCodPostal.setForeground(Color.RED);
		lblCodPostal.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(Color.RED);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tCiudad = new JTextField();
		tCiudad.setColumns(10);
		
		tCodPostal = new JTextField();
		tCodPostal.setColumns(10);
		
		tAutoridad = new JTextField();
		tAutoridad.setColumns(10);
		
		
		paisEmic = new JComboBox(JCombobox());
		
		paisDir = new JComboBox(JCombobox());
		
		provincias = new JComboBox(JCombobox2());
		provincias.setEnabled(false);
		
		provincia2 = new JTextField();
		provincia2.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPasaporte, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(tNumeroPas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblFechaDeEmision, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(tFechaEmic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCuitcuil, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
							.addGap(46)
							.addComponent(tCuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblVencimiento, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(tFechaVen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(128)
									.addComponent(tFechaNac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechaNacimiento, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
									.addGap(73)))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(118)
									.addComponent(tCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(128)
									.addComponent(tEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
									.addGap(84)))
							.addGap(10)
							.addComponent(lblAltura, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(tAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCategoriaPFrecuente, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
							.addGap(9)
							.addComponent(tCategoriaFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(214))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(55)
									.addComponent(tDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblAutoridad, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
									.addGap(46)
									.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblPaisDeEmision, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(paisEmic, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tAutoridad)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAerolinea, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
									.addGap(46)
									.addComponent(tAerolinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblCodPostal, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(36))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(128)
											.addComponent(tNumeroFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNumeroPFrecuente, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
											.addGap(84)))
									.addGap(128))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTelefono, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
									.addGap(31)
									.addComponent(tPersonal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(72))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblPasajeroFrecuente, GroupLayout.PREFERRED_SIZE, 141, Short.MAX_VALUE)
											.addGap(84))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(128)
											.addComponent(tAlianza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(128))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTelefonoLaboral, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
									.addGap(31)
									.addComponent(tLaboral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblProvincia_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(21))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTelefonoCelular, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
									.addGap(9)
									.addComponent(tCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblPais, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(41)))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(provincias, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(paisDir, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(provincia2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
									.addComponent(tCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(tCodPostal)
									.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(4)
								.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(4))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(1)
								.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(4)
								.addComponent(lblPaisDeEmision)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(paisEmic, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tAutoridad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblAutoridad)))))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPasaporte, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tNumeroPas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFechaDeEmision))
						.addComponent(tFechaEmic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCuitcuil, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tCuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblVencimiento))
						.addComponent(tFechaVen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tFechaNac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFechaNacimiento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDireccion)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAltura))
						.addComponent(tAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTelefono, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tPersonal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCiudad))
						.addComponent(tCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(4)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(4)
										.addComponent(lblTelefonoCelular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(4))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(1)
										.addComponent(tCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGap(6))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(8)
								.addComponent(lblPais)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(paisDir, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblTelefonoLaboral, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(4))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(tLaboral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblProvincia_1)))
							.addGap(5))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(provincias, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblPasajeroFrecuente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(3))
								.addComponent(tAlianza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(5))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(provincia2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAerolinea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(tAerolinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCodPostal))
						.addComponent(tCodPostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tNumeroFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNumeroPFrecuente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(3)))
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblCategoriaPFrecuente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(3))
								.addComponent(tCategoriaFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(20))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(btnEnviar)
							.addContainerGap())))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	public void addListener2(ItemListener al) {
		
		paisDir.addItemListener(al);
		
	}
	
	
	public String[] JCombobox() throws IOException, SQLException {
		
			ClienteInterfaz cliInter = ClienteFactory.GetImplementation("MSSQL");
			ArrayList<String> al = new ArrayList<String>();
			al = cliInter.ListarPaises();
			String[] al2 = al.toArray(new String[al.size()]);
			return al2;
		
	}
	public String[] JCombobox2() throws IOException, SQLException {
		
		ClienteInterfaz cliInter = ClienteFactory.GetImplementation("MSSQL");
		ArrayList<String> al = new ArrayList<String>();
		al = cliInter.ListarProvincias();
		String[] al2 = al.toArray(new String[al.size()]);
		return al2;
	
}
}
