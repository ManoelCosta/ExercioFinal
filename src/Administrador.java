public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public void calcularSalario() {
        double salario = (getSalarioBase() - (getSalarioBase() * (getImposto()/100))) + getAjudaDeCusto();
        System.out.println("Salario: "+salario);
    }
}
