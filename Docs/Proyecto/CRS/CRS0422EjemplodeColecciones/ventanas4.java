package CRS0422EjemplodeColecciones;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Point;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class ventanas4 {
	public static void main(final String[] args) {
		final JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(400, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel etiqueta = new JLabel("¿Donde se fue el raton?");
		etiqueta.setBorder(BorderFactory.createLineBorder(Color.red));
		etiqueta.setForeground(Color.blue);
		JLabel etiqueta2 = new JLabel("Posicion del raton");
		etiqueta2.setBorder(BorderFactory.createLineBorder(Color.pink));
		etiqueta2.setForeground(Color.orange);
		JLabel etiqueta3 = new JLabel("Se ha pulsado la tecla con codigoo: XXXXX");
		etiqueta3.setBorder(BorderFactory.createLineBorder(Color.orange));
		etiqueta3.setForeground(Color.magenta);
		ventana.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(final MouseEvent ratonSuelto) {
			}

			@Override
			public void mousePressed(final MouseEvent ratonPresionado) {
			}

			@Override
			public void mouseExited(final MouseEvent RatonSalida) {
				etiqueta.setText("Te has ido! Vuelve :(");
			}

			@Override
			public void mouseEntered(final MouseEvent RatonDentro) {

				etiqueta.setText("Has entrado con el raton");
			}

			@Override
			public void mouseClicked(final MouseEvent RatonClick) {
			}
		});
		ventana.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(final MouseEvent RatonMover) {
				final Point punto = RatonMover.getLocationOnScreen();
				etiqueta2.setText("Posx:"+ punto.x+" Posy: "+ punto.y);
			}

			@Override
			public void mouseDragged(final MouseEvent ArrastrarRaton) {
			}
		});
		ventana.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(final KeyEvent teclado) {
			}

			@Override
			public void keyReleased(final KeyEvent teclado) {
			}

			@Override
			public void keyPressed(final KeyEvent tecladoPresionado) {
				etiqueta3.setText("Se ha pulsado la tecla con codigo: "+ tecladoPresionado.getKeyCode());
						
			}
		});
		JPanel Panel = new JPanel();
		Panel.add(etiqueta);
		Panel.add(etiqueta2);
		Panel.add(etiqueta3);
		ventana.setContentPane(Panel);
		ventana.setVisible(true);
	}

}
