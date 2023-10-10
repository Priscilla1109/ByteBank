import java.sql.SQLOutput;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //criamos o objeto Conta do tipo Conta que seria o double
        primeiraConta.pegaSaldo(); //atribuimos o valor 200 para o atributo saldo do objeto primeiraConta
        System.out.println("Primeira conta tem R$"  + primeiraConta.pegaSaldo()); //estamos acessando um atributo e imprimindo ele

        Conta segundaConta = new Conta();
        segundaConta.pegaSaldo();
        System.out.println("Segunda conta tem R$"  + segundaConta.pegaSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta!"); //irão apontar o mesmo endereço de memória
            System.out.println("Primeira: " + primeiraConta);
            System.out.println("Segunda: " + segundaConta);
        } else {
            System.out.println("São contas diferentes."); //irão apontar endereços de memória diferentes
            System.out.println("Primeira: " + primeiraConta);
            System.out.println("Segunda: " + segundaConta);
        }
    }
}
