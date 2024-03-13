package funcionário;

import javax.swing.JOptionPane;


public class Funcionário {

    String nome = "";
    String nasc = "";
    double salario = 0.0;
    
  
    public void informarSalario(String nome, double salario){
        JOptionPane.showMessageDialog(null, "Salário de " +nome +": "+salario);
    }
    
    public void calcularIdade(String nasc){
        int ano = Integer.parseInt(nasc.substring(6,10));
        ano = 2024 - ano;
        JOptionPane.showMessageDialog(null, "Em 2024 vai ter/tem "+ano +" anos");
    }
    
    public static void main(String[] args) {
       Funcionário func = new Funcionário();
       Funcionário_Helena func_Helena = new Funcionário_Helena();
       Funcionário_Mário func_Mario = new Funcionário_Mário();
       func.informarSalario(func_Helena.name, func_Helena.salario);
       func.informarSalario(func_Mario.name, func_Mario.salario);
       func.calcularIdade(func_Helena.nasc);
       func.calcularIdade(func_Mario.nasc);
    }
    
}