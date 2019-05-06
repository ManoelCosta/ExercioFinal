public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador a1 = new Administrador();

        a1.setAjudaDeCusto(100);
        a1.setCodigoSetor(45656455);
        a1.setImposto(15);
        a1.setSalarioBase(9454.85);
        a1.setCpf("45646545664");
        a1.setDataNascimento("30/05/2000");
        a1.setEndereco("rua adfjlsdajf");
        a1.setIdade(45);
        a1.setNome("Manoel");
        a1.setTelefone("7798799");
        System.out.println(a1.getAjudaDeCusto());
        System.out.println(a1.getImposto());
        System.out.println(a1.getSalarioBase());
        System.out.println(a1.getCodigoSetor());
        System.out.println(a1.getCpf());
        System.out.println(a1.getDataNascimento());
        System.out.println(a1.getEndereco());
        System.out.println(a1.getIdade());
        System.out.println(a1.getNome());
        System.out.println(a1.getTelefone());
        a1.calcularSalario();

    }
}
