
import wallet.Carteira;

public class App {
    public static void main(String[] args) throws Exception {

        Carteira wallet = new Carteira();

        wallet.acdicionarInvestimento("Banco Felipinas", "XFDF", 20.30d, 2);
        wallet.acdicionarInvestimento("Banco Santander", "XFPF", 30.30d, 1);
        wallet.acdicionarInvestimento("Banco do brasil","BS3A3" , 27.3, 3);
        wallet.atuaLizarInvestimento("XFPF", 50.3d);
        
        wallet.mostrarInvesimentos();


        System.out.println(wallet.valorTotal());
    }
}
