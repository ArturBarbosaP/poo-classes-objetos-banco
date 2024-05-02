import java.util.Date;

public class Conta
{
    public Banco banco;
    public Date data_criacao;
    public double saldo;
    public int numero_conta;

    public Conta(Banco banco, Date data_criacao, double saldo, int numero_conta)
    {
        this.banco = banco;
        this.data_criacao = data_criacao;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }

    public void sacar(double valor)
    {
        saldo -= valor;
    }

    public void depositar(double valor)
    {
        saldo += valor;
    }

    public void verificarSaldo()
    {
        System.out.println("Saldo: R$" + saldo);
    }
}