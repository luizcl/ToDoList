import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
	
	private int decisao;
	private List<String> categorias;
	
	public Menu() {
		categorias = new ArrayList<String>();
	}
	
	public void mensagemInicial() {
		
		System.out.println("Bem vindo ao sistema To Do List:");
		
	}
	
	public void decide() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite o número do que deseja fazer:");
			System.out.println("1) Adicionar categoria");
			System.out.println("2) Listar todas categorias");
			System.out.println("3) Remover categoria");
			System.out.println("0) Sair");
			
			this.decisao = sc.nextInt();
			switch (this.decisao) {
				
				case 1:
					adicionaCategoria(sc);
					break;
				
				case 2:
					listaCategorias();
					break;
				
				case 3:
					removeCategoria(sc);
					break;
				default:
					System.out.println("Opção inválida");
					break;
			
			}
			
			System.out.println();
			
		}while(decisao != 0);
		
		System.out.println("Adeus!");
		
		sc.close();
		
	}
	
	private void adicionaCategoria(Scanner sc) {
		
		System.out.println("Digite o nome da categoria sem espaços:");
		String nomeCategoria = sc.next();
		categorias.add(nomeCategoria);
	}
	
	private void listaCategorias() {
		
		for(String categoria : categorias) {
			System.out.println("Nome da categoria: " + categoria);
		}
		
	}
	
	private void removeCategoria(Scanner sc) {
		int i = 0;
		int index;
		
		System.out.println("Digite o número da categoria que deseja remover");
		
		for(String categoria : categorias) {
			
			System.out.println(i + " - " + categoria);
			i++;
		}
		
		i--;

		index = sc.nextInt();
		
		while(index > i || index < 0) {
			System.out.println("Valor inválido, informe novamente: ");
			index = sc.nextInt();
		}
		
		categorias.remove(index);
		
	}
	
}
