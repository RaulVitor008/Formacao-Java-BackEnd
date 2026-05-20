public class Exemplo_sintaxe{
    public static void main (String[] args){

        // impressão de texto
        System.out.println("podemos imprimir isso aqui");

        //2 - tipos primitivos
        // variavel = coloca dados
        int idade = 26;
        int Anoatual = 2026;

        System.out.println("sua idade é: " + idade + "anos.");
        System.out.println("sua idade é: " + Anoatual + "anos.");

        //ling prog => ingles
        // sempre . usar , so em texto
        double altura = 1.69;
        double pi = 3.14;

        System.out.println("a sua altura é:" + altura);
        System.out.println(" e numero de pi é:" + pi);

        // string = texto
        String nome = "raul";
        System.out.println("meu nome é:" + nome);

        // bool => True e False
        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("esta logado?" + estaLogado);
        System.out.println("acesso:" + temAcesso);

        // Variaveis
        // mesmo tipo declarado

        int numero;
        numero = 10;
        System.out.println(numero);

        String name;
        name = "raul";
        System.out.println(name);

        //variaveis
        //teste
        int r = 10, a = 11, u = 12, l = 13;
        System.out.println(r + " " + a + " " + u + "" + l);
        
        //operadores basicos
        int x = 10;
        int z = 3;

        // () => resolve primeiro
        System.out.println("x - z: " + (x-z));
        System.out.println("x + z: " + (x+z));
        System.out.println("x * z: " + (x*z));
        System.out.println("x / z: " + (x/z));
        
        double c = 10;
        double d = 3;
        
        System.out.println("c / d:" + (c/d));

        //contador (cremente e decremente)
        int contador = 0;
        contador++;
        
        System.out.println("valor contador: " + contador);

        //contador diminui o numero do contador acima
        contador --;
        contador --;

        System.out.println("valor contador:" + contador);

        //op.composto
        //a = 10, a = a + 5, a +=5
        c+=5;
        System.out.println("operador composto soma:" + c);
        c= 10;
        c-=15;
        System.out.println("operador composto sub:" + c);
        c = 10;
        c *= 5;
        System.out.println("operador composto multi:" + c);
        c = 10;
        c /= 5;
        System.out.println("operador composto divi:" + c);

    }
}
