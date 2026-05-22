package ESTRUTURA_CONTROLE;

public class ExemplosControle {
    public static void main(String[] args) {
        
        // if - else (condicionais)
    // operadores de comparação
    // x > y, a == b
         int idade = 18;

        //if -> começa
        // () -> contem a condição verdadeira
        //{} -> corpo da condição
        if(idade >= 18) {
        System.out.println("voce é maior de idade. ");
        }

        //if -> validar se algo é verdadeiro
        //else -> executa se o if nao executar

        double nota = 6.3;

        if(nota > 7) {
            System.out.println("voce passou de ano!");

        }else if (nota <= 5) {
            System.out.println("voce ficou de recuperação");
        
        }else{
            System.out.println("infezlimente voce foi reprovado"); 
        }

        //else if -> intermediario do if e else

        int hora = 20;
        
        if(hora <= 12){
            System.out.println("Bom dia");
        
        }else if(hora <= 18){
            System.out.println("Boa Tarde");

        }else{
            System.out.println("boa noite");
        }

        // 2- operadores de comparações
        int x = 10;
        int y = 5;

       // = é diferente de ==
       // = é atribuição
       // == é comparação
        System.out.println("x == y:" + (x == y));
        // != diferente
        System.out.println("x == y:" + (x != y));
        // > (maior)
        System.out.println("x == y:" + (x > y));
        // <(menor)
        System.out.println("x == y:" + (x < y));
        // >= (maior ou igual)
        System.out.println("x == y:" + (x >= y));
        // <= (menor ou igual)
        System.out.println("x ==y:" + (x <= y));

        // bool é verdadeiro entao é if
        boolean o = true;

        if(o){
            System.out.println("é verdadeiro");
        }

        //op. logicos
        //&& => AND (e) -> op1 && op2 => bollean => apenas se as duas op. forem true
        // || => OR (ou)-> op1 || op2 => bollean => apenas se uma for true
        //! => NOT (não)-> !valor =>  altera o valor ao contrario => true <> false

        boolean temDinheiro = true;
        boolean temTempo = true;

        if(temDinheiro && temTempo){
            System.out.println("pode viajar");
        }else{
            System.out.println("nao pode viajar");
        }

              int contador = 1;

        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }
        
        for (int i = 1; i < 5; i++ ) {
            System.out.println("valor de i é: " + i);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        int somaPar = 0;
        int somaImpar = 0;
        
        for(int num : numeros) {
            if(num % 2 == 0){
                somaPar += num;

            }else{
                somaImpar += num;
            }
    }
        System.out.println("soma pares:" + somaPar);
        System.out.println("soma impares" + somaImpar);

        // break
        // continue

        for(int i = 1; i <=10; i++){
            if(i == 2){
                continue;
            }
            if(i == 7){
                break;
            }
            System.out.println(i);
        }

    }

    
}
