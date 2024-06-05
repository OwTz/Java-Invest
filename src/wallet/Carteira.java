package wallet;

import models.Investimento;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Carteira {

    private Map<String, Investimento> carteira;

    public void acdicionarInvestimento(String nome, String code, Double valor, int quantidade ){
        LocalDate dataAtual = LocalDate.now();
        this.carteira.put(code, new Investimento(nome, code, valor, dataAtual, quantidade));
    }

    public Investimento procurarInvestimento(String code){
        Investimento procurarInvestimento = null;

        if (!this.carteira.isEmpty()) {
         procurarInvestimento = this.carteira.get(code);
        }

        return  procurarInvestimento;
    }

    public void atuaLizarInvestimento(String code, double novoValor){

        if (!this.carteira.isEmpty()) {

            Map<String, Investimento> listaaAtualizar = new TreeMap<>(this.carteira);

            Investimento investimentoPegar = listaaAtualizar.get(code);

            investimentoPegar.setValor(novoValor);
            listaaAtualizar.replace(code, investimentoPegar);

            this.carteira = listaaAtualizar;

            System.out.println("\n valor atualizado " +listaaAtualizar.get(code)+ "\n valor atualizado para: "+listaaAtualizar.get(code).getValor());
        }

    }
    public Map returnCarteira(){
        return this.carteira;
    }

    public Carteira(){
        this.carteira = new HashMap<>();
    }



    public void mostrarInvesimentos(){

        for(Investimento i: this.carteira.values()){
            System.out.println(i.toString());
        }
    }

    public double valorTotal(){
        double valorTotal = 0;
        for(Investimento i: this.carteira.values()){
            valorTotal += i.getValor() * i.getQuantidade();
        }

        return valorTotal;
    }

}



