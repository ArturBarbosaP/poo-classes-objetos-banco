public class Banco
{
    public int idBanco;
    public String nome;
    public String endereco;
    public int qtd_contas;

    public Banco(int id, String nome, String endereco, int qtd_contas)
    {
        this.idBanco = id;
        this.nome = nome;
        this.endereco = endereco;
        this.qtd_contas = qtd_contas;
    }

    public void imprimirDados()
    {
        System.out.println(idBanco + "\n" + nome + "\n" + endereco);
    }
}