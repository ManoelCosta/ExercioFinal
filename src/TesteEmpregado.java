public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();

        e1.setCodigoSetor(485755);
        e1.setImposto(36.5);
        e1.setSalarioBase(994.50);
        e1.setCpf("654564644564");
        e1.setDataNascimento("565645645");
        e1.setIdade(26);
        e1.setEndereco("rua mortalicca");
        e1.setNome("joão das neves");
        e1.setTelefone("45445648");
        System.out.println(e1.getCpf());
        System.out.println(e1.getDataNascimento());
        System.out.println(e1.getEndereco());
        System.out.println(e1.getIdade());
        System.out.println(e1.getNome());
        System.out.println(e1.getTelefone());
        System.out.println(e1.getImposto());
        System.out.println(e1.getCodigoSetor());
        System.out.println(e1.getSalarioBase());
        e1.calcularSalario();
    }
}
