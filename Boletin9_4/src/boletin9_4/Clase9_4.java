package boletin9_4;

import javax.swing.JOptionPane;

public class Clase9_4 {
    public int ponerNum(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del que quiera obtener la tabla de multiplicar \n Para salir del programa introduzca 0"));
    }
    public void calcularTabla(){
        int num=ponerNum();
        while (num>0){
        for(int i=1;i<=10;i++){
             JOptionPane.showMessageDialog(null, "Tabla del " + num + "\n " +num + "X"+ i+ "=" + (num*i));
        }    
       num=ponerNum();
        }
    }
}
