package Model;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cadastrarUsuario();
		cadastrarMeta();
		cadastrarGasto();
	}
	
	
	private static void cadastrarUsuario() {
		Usuario usuario = new Usuario();
		
		Scanner teclado = new Scanner(System.in);
		usuario.idUsuario = 1;
		System.out.println("Digite seu Nome: ");
		usuario.nome = teclado.next();
		System.out.println("Digite seu Email: ");
		usuario.email = teclado.next();
		System.out.println("Digite sua Senha: ");
		usuario.setSenha(teclado.next());
		System.out.println("Digite seu Telefone: ");
		usuario.telefone = teclado.nextInt();
		System.out.println("----------------------------------");
		
		System.out.println("Nome: " + usuario.nome);
		System.out.println("Email: " + usuario.email);
		System.out.println("Telefone: " + usuario.telefone);
		System.out.println("----------------------------------");

		
	}
	
	private static void cadastrarMeta() {
		
		
		Scanner teclado = new Scanner(System.in);
		Meta meta1 = new Meta();
		System.out.println("Digite o preço do produto: ");
		meta1.setPreco(teclado.nextInt());
		System.out.println("Digite o endereço da imagem: ");
		meta1.setImagem(teclado.next());
		System.out.println("Digite seu saldo: ");
		double saldo = teclado.nextDouble();
		
		double calculo = ((saldo / meta1.getPreco()) * 100);
		String result = String.format("%.2f", calculo);
		System.out.println("----------------------------------");
	
		System.out.println("Preço: " + meta1.getPreco());
		System.out.println("Imagem: " + meta1.getImagem());
		System.out.println("Faltam: " + (result) + "%");
		
		System.out.println("----------------------------------");
		
		
	}
	private static void cadastrarGasto() {
		Scanner teclado = new Scanner(System.in);
		Gastos gasto1 = new Gastos();
		System.out.println("Digite a descrição/nome do gasto: ");
		gasto1.setDescricao(teclado.next());
		System.out.println("Digite o preço do gasto: ");
		gasto1.setPreco(teclado.nextDouble());
		System.out.println("Digite a data do gasto: ");
        gasto1.setData(teclado.next());
        System.out.println("----------------------------------");
	
		System.out.println("Preço: " + gasto1.getDescricao());
		System.out.println("Imagem: " + gasto1.getPreco());
        System.out.println("Data da Compra: " + gasto1.getData());
		System.out.println("----------------------------------");
	}

}
