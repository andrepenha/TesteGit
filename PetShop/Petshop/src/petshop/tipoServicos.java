/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author Dj The Source
 */
public class tipoServicos {
    
    private String numero, cliente, tipoAtendimento, nomeServico, precoServico;
    
    public tipoServicos(String numero, String nomeServico, String tipoAtendimento, String precoServico){
        this.numero = numero;
        this.nomeServico = nomeServico;
        this.tipoAtendimento = tipoAtendimento;
        this.precoServico = precoServico;
}

   public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(String precoServico) {
        this.precoServico = precoServico;
    }
    
    
    
}
