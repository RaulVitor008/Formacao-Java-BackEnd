package ESTRUTURA_CONTROLE;

public class Exercicio_gem {
   public static void main(String[] args) {

    int veiculoTipo = 1;
    double valorPedagio = 15;
    double valorFinal;

    switch(veiculoTipo){
        case 1 -> {
            valorFinal = valorPedagio - (valorPedagio * 10 / 100);
            System.out.println("o valor do pedagio é de: " + valorFinal);
        }

        case 2 ->{
            valorFinal = valorPedagio - (valorPedagio * 20 / 100);
             System.out.println("o valor do pedagio é de: " + valorFinal);
        }
        default ->{
            System.out.println("o valor do pedagio é de: " + valorPedagio);      
        }

    }

     }

}



