import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAcademia {
    public static void main(String[] Args){
        try (Scanner leitura = new Scanner(System.in)) {
            int opcoes = 0;
            int AlunosCadastrados = 0;
            int CheckinsAlunos = 0;
            
            System.out.println("======== Sistema de gestão ======= RV-FITNESS ======");
            
            while (opcoes != 4) {
                System.out.println("\n ===Menu Principal===");
                System.out.println("1. Cadastrar aluno");
                System.out.println("2. Cadastrar ficha de treino");
                System.out.println("3. Registrar Check-in no Treino");
                System.out.println("4. Ficha cadastral / Sair e gerar relatório");
                System.out.print("Escolha uma opção: ");
                
                try {
                    opcoes = leitura.nextInt();
                    leitura.nextLine();
                    
                    switch (opcoes) {
                        case 1 -> {
                            System.out.print("Digite o nome: ");
                            String nome = leitura.nextLine();
                            System.out.print("Idade do aluno: ");
                            int idade = leitura.nextInt();
                            System.out.print("Altura/Peso (ex: 75.5): ");
                            double alturaPeso = leitura.nextDouble();
                            leitura.nextLine();
                            
                            System.out.println("Aluno " + nome + " (" + idade + " anos e com " + alturaPeso + "kg) cadastrado com sucesso!");
                            AlunosCadastrados++;
                        }
                        
                        case 2 -> {
                            System.out.print("Digite o nome para selecionar o treino: ");
                            String nomeTreino = leitura.nextLine();
                            System.out.println("Olá, " + nomeTreino + "! Selecione o Treino: " + """
                              Treino A - Peito e Triceps
                              Treino B - Costas e Biceps
                              Treino C - Perna Completa
                              """);
                        }
                        
                        case 3 -> {
                            System.out.print("Digite a matrícula (disponível no app): ");
                            String matricula = leitura.nextLine();
                            System.out.println("Matrícula " + matricula + " confirmada! Bom treino![Treino A - Peito e Triceps]");
                            CheckinsAlunos++;
                        }
                        
                        case 4 -> System.out.println("Encerrando o sistema RV-FITNESS...");
                        
                        default -> System.out.println("Opção inválida, selecione apenas as opções acima.");
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Você precisa digitar um número válido!");
                    leitura.nextLine();
                    opcoes = 0;
                }
            }
            
            System.out.println("\n!-----RELATÓRIO DO DIA-----!");
            System.out.println("Total de novos alunos cadastrados: " + AlunosCadastrados);
            System.out.println("Total de check-ins de treino hoje: " + CheckinsAlunos);
        }
    }
}_____+
