public class CalcularCompra {

    public static void main(String[] args) {
        int quantidade = 5;
        double precoUnitario = 9.99;
        boolean descontoAtivo = true;
        String produto = "Caderno";

        double valorFinal = calcularCompra(quantidade, precoUnitario, descontoAtivo);
        System.out.println("o valor final da compra foi de R$ " + valorFinal);
    }

    public static double calcularCompra(int quantidade, double precoUnitario, boolean descontoAtivo){

        double valorTotal;

        if (descontoAtivo){
            valorTotal = (quantidade * precoUnitario * 0.9);
            System.out.println("o produto contém um desconto ativo, portanto o valor final é de R$" + valorTotal);
        }
        else{
              valorTotal = (quantidade * precoUnitario);
            System.out.println("o produto não possui nenhum desconto, portanto o valor final é de R$" + valorTotal);
        }
        return valorTotal;
    }
}