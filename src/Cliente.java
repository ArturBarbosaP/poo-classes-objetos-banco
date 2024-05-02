public class Cliente
{
    public int cod_cliente;
    public String nome;
    public String cpf;
    public String endereco;
    public Conta conta;

    public Cliente(int cod_cliente, String nome, String cpf, String endereco, Conta conta)
    {
        this.cod_cliente = cod_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = conta;
    }

    public void imprimirValores()
    {
        System.out.println(conta.saldo);
    }

    public void transferencia(Cliente destinatario, double valor)
    {
        conta.sacar(valor);
        destinatario.conta.depositar(valor);
        System.out.println("R$" + valor + " transferido para " + destinatario.nome);
    }
}