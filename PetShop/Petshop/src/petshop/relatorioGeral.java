
package petshop;


public class relatorioGeral {
    
    private String clientesMaisGastam, vendasPorMes, servicosMaisVendidos, rankingPetsLucros;

    
    public relatorioGeral(String clientesMaisGastam, String vendasPorMes, String servicosMaisVendidos, String rankingPetsLucros){
        this.clientesMaisGastam = clientesMaisGastam;
        this.vendasPorMes = vendasPorMes;
        this.servicosMaisVendidos = servicosMaisVendidos;
        this.rankingPetsLucros = rankingPetsLucros;
}    
    
    
    /**
     * @return the clientesMaisGastam
     */
    public String getClientesMaisGastam() {
        return clientesMaisGastam;
    }

    /**
     * @param clientesMaisGastam the clientesMaisGastam to set
     */
    public void setClientesMaisGastam(String clientesMaisGastam) {
        this.clientesMaisGastam = clientesMaisGastam;
    }

    /**
     * @return the vendasPorMes
     */
    public String getVendasPorMes() {
        return vendasPorMes;
    }

    /**
     * @param vendasPorMes the vendasPorMes to set
     */
    public void setVendasPorMes(String vendasPorMes) {
        this.vendasPorMes = vendasPorMes;
    }

    /**
     * @return the servicosMaisVendidos
     */
    public String getServicosMaisVendidos() {
        return servicosMaisVendidos;
    }

    /**
     * @param servicosMaisVendidos the servicosMaisVendidos to set
     */
    public void setServicosMaisVendidos(String servicosMaisVendidos) {
        this.servicosMaisVendidos = servicosMaisVendidos;
    }

    /**
     * @return the rankingPetsLucros
     */
    public String getRankingPetsLucros() {
        return rankingPetsLucros;
    }

    /**
     * @param rankingPetsLucros the rankingPetsLucros to set
     */
    public void setRankingPetsLucros(String rankingPetsLucros) {
        this.rankingPetsLucros = rankingPetsLucros;
    }
    
    
    
    
    
    
    
}
