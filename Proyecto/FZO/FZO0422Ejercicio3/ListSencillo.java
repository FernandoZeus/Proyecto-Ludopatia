package FZO0422Ejercicio3;

import java.util.Date;
import java.util.ArrayList;

public class ListSencillo{
    public static void main(String[] args) {
     
       ArrayList  suma = new ArrayList ();

          final int NumeroMaximo = 5;
          int numero=0;
         
         
          while(numero != 5){
            suma.add(numero);
            numero++;
           
            System.out.print(suma.size());
          }
    }
}