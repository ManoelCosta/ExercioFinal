public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();

        f1.setValorDivida(65.56);
        f1.setValorCredito(1434.56);
        f1.setCpf("545444");
        f1.setDataNascimento("15/02/1999");
        f1.setTelefone("54444546556");
        f1.setEndereco("Rua amostra gratis");
        f1.setIdade(25);
        f1.setNome("Joelson");
        f1.obterSaldo();
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Idade: "+f1.getIdade());
        System.out.println(f1.getValorCredito());
        System.out.println(f1.getEndereco());
        System.out.println(f1.getDataNascimento());
        System.out.println(f1.getValorDivida());
        System.out.println(f1.getCpf());
        System.out.println(f1.getTelefone());

    }
}
