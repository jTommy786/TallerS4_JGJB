import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/**Se crea el objeto persona1*/    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
FrecuenciasCardiacas persona1 = new FrecuenciasCardiacas();

/**Se crean las variables para guardar cada uno de los datos, el valor entrada es un valor que se
 * reemplazara constantemente*/
int anio, mes, dia;
String nombre, apellido, entrada;

/**Se piden los valores e immediatemente se guardan los datos al objeto*/

nombre = JOptionPane.showInputDialog(null, "Ingrese el primer nombre del usuario: ");
persona1.setPrimerNombre(nombre);

apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido: ");
persona1.setApellido(apellido);

/**Se validan los datos para que si se ingrese incorrectamente se vuelva a pedir a usario*/

do {
    entrada = JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento: ");
    anio = Integer.parseInt(entrada);
    persona1.setAnio(anio);
}while(anio<1924 || anio>2025);

do {
    entrada = JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento: ");
    mes = Integer.parseInt(entrada);
    if(mes<1 || mes>12){
        persona1.setMes(mes);
    }
    persona1.setMes(mes);
}while(mes<1 || mes>12);

do {
    entrada = JOptionPane.showInputDialog(null, "Ingrese el dia de nacimiento: ");
    dia = Integer.parseInt(entrada);
    if(dia<1 || dia>30){
        persona1.setDia(dia);
    }

}while(dia<1 || dia>30);

/**Se muestran los datos finales, llamando a cada uno de los metodos y se le pasan los valores que necesitan*/

    JOptionPane.showMessageDialog(null, "Edad del usuario "
            + persona1.getPrimerNombre() + " " + persona1.getApellido() + " es: \n"
            + persona1.DevolverEdad(anio, mes, dia));

    JOptionPane.showMessageDialog(null, "La frecuencia maxima del usuario "
            + persona1.getPrimerNombre() + " " + persona1.getApellido() + " es: \n"
            + persona1.FrecMaxima(anio, mes, dia));

    /**Esta seccion final es diferente ya que se puede imprimir desde el mismo metodo del objeto
     * con mayor facilidad, ya que se sustraen los valores del objeto, al metodo, directamente.*/

     persona1.FrecEsperada(anio, mes, dia);




}
