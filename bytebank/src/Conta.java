public class Conta {
    //as informações abaixo são atributos
    private double saldo; //não pode ser modificado por ninguém além da própria classe
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor; //valor não é um atributo, ele morre após fechar as chaves.
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) { //this se refere ao saldo dessa conta
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double pegaSaldo()  { //esse método serve para o código poder acessar o aributo privado saldo
        return this.saldo;
    }
}
