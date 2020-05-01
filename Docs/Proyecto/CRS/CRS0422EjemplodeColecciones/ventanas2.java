package CRS0422EjemplodeColecciones;

import javax.swing.JPanel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class ventanas2 {
	public static void main(final String[] args) {
		JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(400, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel etiqueta = new JLabel("Pocision del raton");
		etiqueta.setBorder(BorderFactory.createLineBorder(Color.RED));
		etiqueta.setForeground(Color.BLUE);
		ventana.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved( MouseEvent RatonMovimiento) {
				 Point punto = RatonMovimiento.getLocationOnScreen();
				etiqueta.setText("Posx:"+ punto.x+" Posy: "+ punto.y);
			}

			@Override
			public void mouseDragged( MouseEvent ArrastrarRaton) {
			}
		});
		JPanel Panel = new JPanel();
		Panel.add(etiqueta);
		ventana.setContentPane(Panel);
		ventana.setVisible(true);
	}

}
