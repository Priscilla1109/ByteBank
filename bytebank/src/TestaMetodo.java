public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaPriscilla = new Conta();
        contaDaPriscilla.titular = "Priscilla Fonseca";
        contaDaPriscilla.pegaSaldo();

        contaDaPriscilla.deposita(50); //aqui ele ta chamando o método e somando o valor ao que já tinha antes.
        System.out.println("O saldo da conta da Priscilla é R$" + contaDaPriscilla.pegaSaldo());

        boolean conseguiuRetirar = contaDaPriscilla.saca(20); //aqui invocamos o método e ele retorna true ou false.
        System.out.println("O saldo da conta da Priscilla é R$" + contaDaPriscilla.pegaSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDoRenan = new Conta();
        contaDoRenan.titular = "Renan Kenedy";
        contaDoRenan.deposita(1000);

        if (contaDoRenan.transfere(300, contaDaPriscilla)){
            System.out.println("A transferência foi feita com sucesso!");
        } else {
            System.out.println("Transferência falhou!");
        }
        System.out.println("O saldo da conta da " + contaDaPriscilla.titular + " é R$" + contaDaPriscilla.pegaSaldo());
        System.out.println("O saldo da conta do " + contaDoRenan.titular + " é R$" + contaDoRenan.pegaSaldo());


    }
}
