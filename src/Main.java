import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = format.parse("26/08/2023");
        Date data2 = format.parse("20/03/2023");

        Banco banco1 = new Banco(1, "Banco 1", "Rua 1", 1);

        banco1.imprimirDados();

        Conta conta1 = new Conta(banco1, data, 600.55, 1);
        Conta conta2 = new Conta(banco1, data2, 1528.75, 2);

        conta1.verificarSaldo();
        conta1.depositar(20.45);
        conta1.verificarSaldo();
        conta1.sacar(10);
        conta1.verificarSaldo();

        Cliente cliente1 = new Cliente(1, "Adilson", "697.077.390-61", "Rua 1", conta1);
        Cliente cliente2 = new Cliente(2, "Adalberto", "375.595.490-71", "Rua 2", conta2);

        cliente1.imprimirValores();
        cliente2.imprimirValores();

        cliente1.transferencia(cliente2, 100);

        cliente1.imprimirValores();
        cliente2.imprimirValores();
    }
}