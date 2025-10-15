public class CalcularSalarioFinal {
public static void main(String[] args) {

// declarando as variaveis

    String nomeFuncionario = "Claudson hardy";
    double salarioBase = 2100.00;
    double percentualBonus = 0.5;
    double percentualDesconto = 0.1;

// chamada do metodo "salarioFinal"

    double salarioFinal = calcularSalarioFinal(salarioBase, percentualBonus, percentualDesconto);

// resultado da operação formatado

    System.out.println("Funcionario :" + nomeFuncionario);
    System.out.println("Salario base R$:" + salarioBase);
    System.out.println("bonus de :" + percentualBonus + "% | Desconto: "+ percentualDesconto + "%");
    System.out.println("Salario final : R$" + salarioFinal);
}

// metodo para calcular o salario final

public static double calcularSalarioFinal(double salarioBase, double percentualBonus, double percentualDesconto) {
    double salarioFinal = salarioBase + (salarioBase * percentualBonus * 100) - (salarioBase * percentualDesconto * 100);
    
    return salarioFinal;
}
}