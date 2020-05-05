package CRS0422EjemplodeColecciones;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class ventanas1 {
	public static void main(final String[] args) {
	    JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(400, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta = new JLabel("¿where is the raton?");
		etiqueta.setBorder(BorderFactory.createLineBorder(Color.green));
		etiqueta.setForeground(Color.RED);
		ventana.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased( MouseEvent Ratonsuelto ) {
			}
			@Override
			public void mousePressed( MouseEvent RatonPresionado) {
			}
			@Override
			public void mouseExited( MouseEvent RatonSalida ) {
				etiqueta.setText("Vuelve perro");
			}
			@Override
			public void mouseEntered( MouseEvent RatonDentro) {
				etiqueta.setText("Aqui estas perro");
			}
			@Override
			public void mouseClicked( MouseEvent RatonClick) {
			}
		});
		JPanel Panel = new JPanel();
		Panel.add(etiqueta);
		ventana.setContentPane(Panel);
		ventana.setVisible(true);
	}

}
