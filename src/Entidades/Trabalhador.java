package Entidades;

import Entidades.Enum.NivelDeTrabalho;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelDeTrabalho nivel;
    private Double Salario_Base;

    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, NivelDeTrabalho nivel, Double Salario_Base, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.Salario_Base = Salario_Base;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDeTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalario_Base() {
        return Salario_Base;
    }

    public void setSalario_Base(Double Salario_Base) {
        this.Salario_Base = Salario_Base;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void addContratos(ContratoPorHora contratos){
        contratos.add(contratos);
    }
    public void removeContratos(ContratoPorHora contratos){
        contratos.remove(contratos);
    }
    
    public double income(int year, int month){
        double soma = Salario_Base;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }
        }
                return soma;
    }
}
