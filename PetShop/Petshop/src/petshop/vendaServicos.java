
package petshop;


public class vendaServicos {
    
    private String dataCompra, cliente, servicoRealizado, vendaTotalServicos, precoServico;
    
    public vendaServicos(String dataCompra, String cliente, String servicoRealizado, String vendaTotalServicos, String precoServico){
        this.dataCompra = dataCompra;
        this.cliente = cliente;
        this.servicoRealizado = servicoRealizado;
        this.vendaTotalServicos = vendaTotalServicos;
        this.precoServico = precoServico;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the servicoRealizado
     */
    public String getServicoRealizado() {
        return servicoRealizado;
    }

    /**
     * @param servicoRealizado the servicoRealizado to set
     */
    public void setServicoRealizado(String servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }

    /**
     * @return the vendaTotalServicos
     */
    public String getVendaTotalServicos() {
        return vendaTotalServicos;
    }

    /**
     * @param vendaTotalServicos the vendaTotalServicos to set
     */
    public void setVendaTotalServicos(String vendaTotalServicos) {
        this.vendaTotalServicos = vendaTotalServicos;
    }

    /**
     * @return the precoServico
     */
    public String getPrecoServico() {
        return precoServico;
    }

    /**
     * @param precoServico the precoServico to set
     */
    public void setPrecoServico(String precoServico) {
        this.precoServico = precoServico;
    }
    
    
    
    
}
