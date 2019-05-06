public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void calcularSalario(){
        double salario = getSalarioBase() - (getSalarioBase() * (getImposto()/100));
        System.out.println("Salario: "+ salario);
    }
}
