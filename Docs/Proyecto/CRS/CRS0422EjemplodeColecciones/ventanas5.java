package CRS0422EjemplodeColecciones;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class ventanas5 {
	   public static void main(final String[] args) {
	        JFrame ventana = new JFrame("Titulo de la ventana");
	        ventana.setSize(400, 250);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JLabel etiqueta = new JLabel("No has pulsado el boton");
	        JButton boton = new JButton("!Pulsa!");
	        boton.addActionListener(new ActionListener() {
	            int pulsador = 0;

	            @Override
	            public void actionPerformed(ActionEvent arg0) {
	               pulsador++;
	               if(pulsador==1) {
	            	   etiqueta.setText("Has pulsado "+ this.pulsador+ " vez");
		            }else {
		            	etiqueta.setText("Has pulsado "+ this.pulsador+ " veces");
		            }
	            	   
	               }
	        });
	        JPanel Panel = new JPanel();
	        Panel.add(etiqueta);
	        Panel.add(boton);
	        ventana.setContentPane(Panel);
	        ventana.setVisible(true);
	    }
	

}
