public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.pegaSaldo();

        System.out.println("Saldo da primeira conta: " + primeiraConta.pegaSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.pegaSaldo()); //aqui ele vai imprimir o mesmo saldo da primeira conta, uma vez que só tem um objeto do tipo conta.

        System.out.println("Saldo da primeira conta: " + primeiraConta.pegaSaldo()); //como as duas contas apontam para o mesmo objeto, aqui ele também retornará 400.

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta!");
            System.out.println("Primeira: " + primeiraConta);
            System.out.println("Segunda: " + segundaConta);
        } else {
            System.out.println("São contas diferentes.");
            System.out.println("Primeira: " + primeiraConta);
            System.out.println("Segunda: " + segundaConta);
        }


    }
}
