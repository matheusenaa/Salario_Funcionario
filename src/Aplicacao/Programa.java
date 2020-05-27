package Aplicacao;

import Entidades.ContratoPorHora;
import Entidades.Departamento;
import Entidades.Enum.NivelDeTrabalho;
import Entidades.Trabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String departamentoNome = JOptionPane.showInputDialog("Digite o nome do departamento:");
        String trabalhadorName = JOptionPane.showInputDialog("Digite seu nome: ");
        String trabalhadornivel = JOptionPane.showInputDialog("Digite seu nivel (JUNIOR, PLENO, SENIOR): ");
        Double SalarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario base"));

        Trabalhador trabalhador = new Trabalhador(trabalhadorName, NivelDeTrabalho.valueOf(trabalhadorName), SalarioBase, new Departamento(departamentoNome));

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos contratos o trabalhor possui ?"));

        for ( int i=1; i<=n; i++){
            JOptionPane.showInputDialog("Digite o contrato #" + i + "data:");
            String data = JOptionPane.showInputDialog("Digite a data (DD/MM/YYYY): ");
            Date ContratoDate = sdf.parse(data);
            Double ValorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor por Hora"));
            int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas horas você trabalhou"));
            ContratoPorHora contrato = new ContratoPorHora(ContratoDate, ValorPorHora, hora);
            trabalhador.addContratos(contrato);
        }
            
        String MesEAno = JOptionPane.showInputDialog("Digite o Mês e Ano trabalhado que deseja calcular (MM/YYYY): ");
        int Mes = Integer.parseInt(MesEAno.substring(0, 2));
        int Ano = Integer.parseInt(MesEAno.substring(3));
        
        JOptionPane.showInputDialog("Nome: " + trabalhador.getNome());
        JOptionPane.showInputDialog("Departamento: " + trabalhador.getDepartamento().getName());
        JOptionPane.showInputDialog("A receber " + MesEAno + ": " + String.format("%2.f", trabalhador.income(Mes, Ano)));
        
        
    }   

}
