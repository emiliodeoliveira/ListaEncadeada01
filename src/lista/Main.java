package lista;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		ListaSimples lista = new ListaSimples();
		Pessoa p;
		char opcao;

		do{
			opcao = menu();
			switch(opcao){
			case '1': 
				System.out.println("Inserindo no inicio da lista");
				p = new Pessoa();
				System.out.print("Nome: ");
				p.setNome(ler.next());
				System.out.print("Sexo: ");
				p.setSexo(ler.next());
				System.out.print("Idade: ");
				p.setIdade(ler.nextInt());
				lista.inserirPrimeiro(p);			
				break;
			case '2': 
				System.out.println("Inserindo no final da lista");
				p = new Pessoa();
				System.out.print("Nome: ");
				p.setNome(ler.next());
				System.out.print("Sexo: ");
				p.setSexo(ler.next());
				System.out.print("Idade: ");
				p.setIdade(ler.nextInt());
				lista.inserirUltimo(p);
				break;
			case '3': 
				if (lista.verificaVazia()){
					System.out.println("A lista está vazia!");
				}else{
					System.out.print("Localizando pessoa:\nDigite o nome:");
					String nome = ler.next();
					if (lista.pesquisarNo(nome) == null){
						System.out.println("Não foram encontrados registros!");
					} else{
						System.out.println("Resultados --------------------");
						System.out.println(lista.pesquisarNo(nome));
					}
				}
				break;
			case '4': 
				if (lista.verificaVazia()){
					System.out.println("A lista está vazia!");
				} else{
					System.out.print("Excluir uma pessoa --------------------\n Digite o nome:");
					String nome = ler.next();
					if (lista.removerNo(nome)){
						System.out.println(nome+" foi removido com sucesso!");
					} else {
						System.out.println("Não foi possível remover "+nome);
					}
				}
				break;
			case '5': 
				System.out.println("---------------------------------\n Lista:");
				System.out.println(lista.imprimirLista());
				break;
			case '6': 
				System.out.println("A lista contem "+lista.getQuantNo());
				break;
			case '7': 
				System.exit(0);
				break;
			}
		}while(opcao != '7');
		System.exit(0);
	}

	public static char menu(){
		String msg;
		menuInicial();
		msg = new Scanner(System.in).next();
		return msg.charAt(0);
	}

	public static void menuInicial(){
		System.out.println(
						"-------------------------------------------\n"
						+ "  Escolha sua opção\n"
						+"-------------------------------------------\n"
						+"1 - Inserir no inicio\n"
						+"2 - Inserir no final\n"
						+"3 - Localizar pessoa\n"
						+"4 - Excluir pessoa\n"
						+"5 - Imprimir lista\n"
						+"6 - Ver quantidade de pessoas\n"
						+"7 - Sair do programa\n"
				);
	}
}
