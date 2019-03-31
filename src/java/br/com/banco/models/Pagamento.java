package br.com.banco.models;

public class Pagamento {
    
    private int id;
    private String nomeDespesa;
    private Double valor;
    private String dataVencimento;
    private String dataAgendamento;

    public Pagamento(int id, String nomeDespesa, Double valor, String dataVencimento, String dataAgendamento) {
        this.id = id;
        this.nomeDespesa = nomeDespesa;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataAgendamento = dataAgendamento;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDespesa() {
        return nomeDespesa;
    }

    public void setNomeDespesa(String nomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    
    
    
}
