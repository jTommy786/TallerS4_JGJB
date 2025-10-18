/**Librerias usadas para calcular correctamnte la edad en años de la persona*/
import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

/**Atributos de la clase*/

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private Integer anio;
    private Integer mes;
    private Integer dia;


    /**
     * Constructores de los datos
     */


    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String primerNombre, String apellido, Integer anio) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.anio = anio;
    }

    /**
     * Metodos obtener y establecer de los atributos
     */

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    /**
     * Metodos de calculos.
     */

    public Integer DevolverEdad(int anio, int mes, int dia) {

        /**Se ingresa la fecha de nacimiento con cada uno de sus elementos en un LocalDate*/
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        /**Se define la fecha actual, en este del dia en el que entregara el proyecto*/
        LocalDate fechaActual = LocalDate.of(2025, 10, 19);

        /**Se calcula la edad correcta de la persona, segun el mes y dia*/

        Period edad = Period.between(fechaNacimiento, fechaActual);

        return edad.getYears();
    }

    public Integer FrecMaxima(int anio, int mes, int dia){
        int frecMax;

            /**Se vuelve a llamar a la funcion DevolverEdad para tener los años exactos de la persona*/
            frecMax=(220-DevolverEdad(anio, mes, dia));


        return frecMax;
    }
    
    public String FrecEsperada(int anio, int mes, int dia){
        String frecEsp;

        /**Se vuelve a llamar a la funcion DevolverEdad para tener los años exactos de la persona ademas
         * de que se usa Math.floor para redondear los datos con Math.floor*/

            frecEsp = "Su frecuencia esperada esta entre "+ Math.floor(FrecMaxima(anio, mes, dia)*0.5)
                    + " - "+ Math.floor(FrecMaxima(anio, mes, dia)*0.85) + " (truncado)";

            JOptionPane.showMessageDialog(null, ""+frecEsp);
        return frecEsp;
    }





}
