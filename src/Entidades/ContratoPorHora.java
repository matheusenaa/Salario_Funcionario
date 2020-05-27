package Entidades;

import java.util.Date;

public class ContratoPorHora {

    private Date data;
    private Double Valor_Por_Hora;
    private Integer hora;
    
   public  ContratoPorHora () {
       
   }

    public ContratoPorHora(Date data, Double Valor_Por_Hora, Integer hora) {
        this.data = data;
        this.Valor_Por_Hora = Valor_Por_Hora;
        this.hora = hora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor_Por_Hora() {
        return Valor_Por_Hora;
    }

    public void setValor_Por_Hora(Double Valor_Por_Hora) {
        this.Valor_Por_Hora = Valor_Por_Hora;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public double totalValue(){
        return Valor_Por_Hora * hora;
    }
    
    void add(ContratoPorHora contratos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void remove(ContratoPorHora contratos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
