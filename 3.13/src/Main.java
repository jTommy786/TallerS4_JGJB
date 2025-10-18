import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /**Creacion de objetos*/    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Empleado empleado1= new Empleado();
    Empleado empleado2= new Empleado();

    /**Declaracion de variables*/

    String primer_nombre, apellido_paterno, entrada;
    double salario;

    /**Registro Primer Usuario*/

    primer_nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ");
    empleado1.setPrimer_nombre(primer_nombre);

    apellido_paterno = JOptionPane.showInputDialog(null, "Digite su apellido paterno: ");
    empleado1.setApellido_paterno(apellido_paterno);


    do {
        entrada = JOptionPane.showInputDialog(null, "Digite su salario actual: ");
        salario = Double.parseDouble(entrada);
        empleado1.setSalario_mensual(salario);
    }while(salario<0);



    /**Registro Segundo Usuario*/

    primer_nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ");
    empleado2.setPrimer_nombre(primer_nombre);

    apellido_paterno = JOptionPane.showInputDialog(null, "Digite su apellido paterno: ");
    empleado2.setApellido_paterno(apellido_paterno);


    do {
        entrada = JOptionPane.showInputDialog(null, "Digite su salario actual: ");
        salario = Double.parseDouble(entrada);
        empleado2.setSalario_mensual(salario);
    }while(salario<0);


    /**Datos de usuarios*/

    JOptionPane.showMessageDialog(null, "Usuario #1: " + empleado1.getPrimer_nombre() + " " + empleado1.getApellido_paterno() +
            "\nSalario anual es de: "+empleado1.mostrarSalarioAnual(salario) + "$" +
            "\n** Se aumentara el 10%" +
            "\nSalario mensual actualizado es de: "+ empleado1.calculoMasPorcentaje(salario)+ "$" +
            "\nSu salario anual mas bono: "+ empleado1.mostrarSalariofinal(salario)+ "$" +
            "\n------------------------------------" +
            "\nUsuario #2: " + empleado2.getPrimer_nombre() + " " + empleado2.getApellido_paterno() +
            "\nSalario anual es de: "+empleado2.mostrarSalarioAnual(salario) + "$" +
            "\n** Se le aumentara el 10%" +
            "\nSalario mensual actualizado es de: "+ empleado2.calculoMasPorcentaje(salario)+ "$" +
            "\nSalario anual mas bono: "+ empleado2.mostrarSalariofinal(salario)+ "$");



}
