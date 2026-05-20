package POO;

public class PogramaPrincipal {
    
public static void main(String[] args) {
    
    // criar uma pessoa => instanciar (new)
    Pessoa pessoal = new Pessoa();
    pessoal.setNome("brenda");
    pessoal.setIdade(21);
    pessoal.setAltura(1.68);
    pessoal.setPeso(70);
    System.out.println(pessoal.getNome() + "" + pessoal.getIdade() + "" + pessoal.getAltura() + "" + pessoal.getPeso());

}


}
