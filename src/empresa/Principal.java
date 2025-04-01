package empresa;
import java.util.Scanner;

//Lucas Nogueira Delegredo RU: 5071970

public class Principal {

	public static void main(String[] args) {
		
		//criar o scanner de opções
		Scanner scanner = new Scanner(System.in);
		//Criar o cofrinho
		Cofrinho cofrinho = new Cofrinho();
		
		//opções de menu
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1- Adicionar moeda no cofrinho");
            System.out.println("2- Remover moeda do cofrinho");
            System.out.println("3- Listar moedas do cofrinho");
            System.out.println("4- Calcular total em reais");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");
            
            //capturar opção inserida
 
            int opcao = scanner.nextInt();
            if (opcao == 0) break;
            
            switch (opcao) {
                case 1:
                    System.out.print("Por favor insira qual a moeda (1- Dólar, 2- Euro, 3- Real): ");
                    //capturar qual o tipo de moeda ele deseja
                    int tipo = scanner.nextInt();
                    
                    System.out.print("Qual valor deseja inserir? ");
                    
                    //capturar o valor que ele deseja inserir
                    double valor = scanner.nextDouble();
                    
                    //vamos comparar qual tipo ele deseja inserir de moeda e chamar o devido metodo
                    switch (tipo) {
                        case 1: cofrinho.adicionar(new Dolar(valor)); break;
                        case 2: cofrinho.adicionar(new Euro(valor)); break;
                        case 3: cofrinho.adicionar(new Real(valor)); break;
                        default: System.out.println("Tipo inválido!");
                    }
                    break;
                
                case 2:
                	System.out.print("Por favor insira qual a moeda (1- Dólar, 2- Euro, 3- Real): ");
                	int tipoRemove = scanner.nextInt();
                	double valorRemove = scanner.nextDouble();
                	switch (tipoRemove) {
	                    case 1: cofrinho.remover(new Dolar(valorRemove)); break;
	                    case 2: cofrinho.remover(new Euro(valorRemove)); break;
	                    case 3: cofrinho.remover(new Real(valorRemove)); break;
	                    default: System.out.println("Tipo inválido de moeda selecionado!");
                	}
                    break;
                
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                
                case 4:
                    System.out.println("Total em reais: R$ " + cofrinho.totalConvertido());
                    break;
                
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }


		
		
	}

