import javax.swing.*;
import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        /**Creacion del objeto y el metodo de lectura (Scanner)*/
        Fecha fechap=  new Fecha();
        Scanner sc = new Scanner(System.in);

        /**Creacion de variables*/
        int dia, mes, ano;
        String entrada;
        /**Lectura de datos*/

        do {

            entrada = JOptionPane.showInputDialog("Ingrese el dia: ");
            dia= Integer.parseInt(entrada);
            if(dia <  31 || dia > 0){
                fechap.setDia(dia);
                }
        }while(dia >  31 || dia < 0);

        do {

            entrada = JOptionPane.showInputDialog("Ingrese el mes: ");
            mes= Integer.parseInt(entrada);
            if(mes <  13 || mes > 0){
                fechap.setMes(mes);
            }
        }while(mes >  12 || mes < 0);

        do {
            
            entrada = JOptionPane.showInputDialog("Ingrese el ano: ");
            ano = Integer.parseInt(entrada);
            if(ano >  1000 || ano < 9999){
                fechap.setAno(ano);
            }
        }while(ano < 1000 || ano > 9999);

        /**Impresion de la fecha*/
        JOptionPane.showMessageDialog(null, "La fecha es: " + fechap.mostrarFecha(dia, mes, ano));
    }
}