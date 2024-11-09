package MAPA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {

	// Tabuleiro do jogo 3x3
	private static char[][] tabuleiro = new char[3][3];

	// Definindo quem é o jogador da vez
	private static char jogadorAtual = 'X';

	public static void main(String[] args) {

		// Cabeçalho do programa
		System.out.println("____________________________________________________");
		System.out.println("MAPA – MATERIAL DE AVALIAÇÃO PRÁTICA DA APRENDIZAGEM");
		System.out.println();
		System.out.println(" --------------- JOGO DA VELHA ---------------------");
		System.out.println("Desenvolvido por: WELBERT LUIZ SILVA");
		System.out.println("RA: 24513802-5");

		// Inicializa o tabuleiro com espaços vazios ('-')
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = '-';
			}
		}

		// Loop principal do jogo
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// Exibe o tabuleiro com bordas e números de linha e coluna
			System.out.println("____________________________________________________");
			System.out.println("Tabuleiro do Jogo");
			System.out.println();
			System.out.println("  0 1 2 ");
			System.out.println(" -------");
			for (int i = 0; i < 3; i++) {
				System.out.print(i + "|");
				for (int j = 0; j < 3; j++) {
					System.out.print(tabuleiro[i][j] + " ");
				}
				System.out.println("|" + i);
			}
			System.out.println(" -------");
			System.out.println("  0 1 2 ");
			System.out.println("____________________________________________________");

			// Solicita a jogada do jogador
			int linha, coluna;
			while (true) {
				try {
					System.out.println("Jogador " + jogadorAtual + ", faça sua jogada.");
					System.out.print("Escolha a linha (0-2): ");
					linha = scanner.nextInt();
					System.out.print("Escolha a coluna (0-2): ");
					coluna = scanner.nextInt();

					// Valida a jogada
					if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
						tabuleiro[linha][coluna] = jogadorAtual;
						break;
					} else {
						System.out.println("Jogada inválida, insira números inteiros entre 0 e 2.");
					}

				// Captura o erro caso o usuário insira algo que não seja um número
				} catch (InputMismatchException e) {
					System.out.println("Entrada inválida! Por favor, insira números inteiros entre 0 e 2.");
					scanner.next(); 
				}

			}

			// Verifica se alguém venceu
			if (verificarVitoria() == true) {
				System.out.println("Jogador - " + jogadorAtual + " - VENCEU!");
				break;
			}

			// Verifica se houve empate
			if (verificarEmpate() == true) {
				System.out.println("Empate! O jogo terminou.");
				break;
			}

			// Alternar Jogador
			if (jogadorAtual == 'X') {
				jogadorAtual = 'O';
			} else {
				jogadorAtual = 'X';
			}
		}

		// Pergunta se o jogador quer jogar novamente
		System.out.println("Deseja jogar novamente? (S/N)");
		String resposta = scanner.next();

		// Se a resposta não for S nem N, pede para o jogador tentar novamente
		while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
			System.out.println("Opção Inválida. Por favor, escolha 'S' para sim ou 'N' para não.");
			resposta = scanner.next();
		}
		
		// Reinicia o jogo
		if (resposta.equalsIgnoreCase("S")) {
			main(args); 
		} else {
			System.out.println("Obrigado por jogar!");
		}
		scanner.close();
	}

	// Verifica se há um vencedor
	public static boolean verificarVitoria() {
		// Verifica as linhas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
				return true;
			}
		}
		// Verifica as colunas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
				return true;
			}
		}
		// Verifica as diagonais
		if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
			return true;
		}
		if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
			return true;
		}

		return false;
	}

	// Verifica se há empate
	public static boolean verificarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
