package models;

import java.time.LocalDate;
import java.util.Objects;

public class Investimento {

    private double valor;
    private String nome;
    private String codigo;
    private LocalDate date;
    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public Investimento(String nome, String code, Double valor, LocalDate date, int quantidade){

        setCodigo(code);
        setNome(nome);
        setValor(valor);
        setQuantidade(quantidade);
        setDate(date);

    }
   @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Investimento that = (Investimento) obj;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "\n Investimento" +this.getNome()+ " \n código: " +this.getCodigo()+ 
        "\n valor: "+this.getValor()+ " \n quantidade: " +this.getQuantidade();
    }
}
