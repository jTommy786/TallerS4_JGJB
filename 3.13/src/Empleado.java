public class Empleado {

    /**Inicializacion de variables*/
    private String primer_nombre;
    private String apellido_paterno;
    private Double salario_mensual;
    private Double salarioTotal;

    public Empleado() {
    }

    public Empleado(String primer_nombre, String apellido_paterno, Double salario_mensual, Double salarioTotal) {
        primer_nombre = primer_nombre;
        apellido_paterno = apellido_paterno;
        salario_mensual = salario_mensual;
        salarioTotal = salarioTotal;
    }

    /**Metodo establecer y obtener de cada variable*/
    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public Double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(Double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    public Double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    /**Metodos de calculo de salarios*/

    public Double mostrarSalarioAnual(double Salario_mensual){
        double salarioAnual;

        salarioAnual=this.salario_mensual*12;

        return salarioAnual;
    }

    public Double calculoMasPorcentaje(double salario_mensual){

        double PorcentajeSalario=this.salario_mensual*0.1;
        this.salarioTotal= this.salario_mensual + PorcentajeSalario;

        return salarioTotal;
    }

    public Double mostrarSalariofinal(double Salario_mensual){
        double salarioFinal;



        salarioFinal=this.salarioTotal*12;

        return salarioFinal;
    }


}
