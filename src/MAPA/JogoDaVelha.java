package MAPA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {
	// MATRIZ 3X3
	private static char[][] tabuleiro = new char[3][3];
	// VARIÁVEL QUE IDENTIFICA O JOGADOR
	private static char jogadorAtual = 'X';

	// FUNÇAO PRINCIPAL
	public static void main(String[] args) {
		// CABEÇALHO DO PROGRAMA
		System.out.println("____________________________________________________");
		System.out.println("MAPA – MATERIAL DE AVALIAÇÃO PRÁTICA DA APRENDIZAGEM");
		System.out.println();
		System.out.println(" --------------- JOGO DA VELHA ---------------------");
		System.out.println("Desenvolvido por: WELBERT LUIZ SILVA");
		System.out.println("RA: 24513802-5");
		// PREENCHE O TABULEIRO COM ESPAÇOS VAZIOS ('-')
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = '-';
			}
		}
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// EXIBE O TABULEIRO COM BORDAS E NÚMEROS DE LINHA E COLUNA
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
			// SOLICITA JOGADA
			int linha, coluna;
			while (true) {
				try {
					System.out.println("Jogador " + jogadorAtual + ", faça sua jogada.");
					System.out.print("Escolha a linha (0-2): ");
					linha = scanner.nextInt();
					System.out.print("Escolha a coluna (0-2): ");
					coluna = scanner.nextInt();
					// VALIDA JOGADA
					if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
						tabuleiro[linha][coluna] = jogadorAtual;
						break;
					} else {
						System.out.println("Jogada inválida, insira números inteiros entre 0 e 2.");
					}
					// CAPTURA O ERRO
				} catch (InputMismatchException e) {
					System.out.println("Entrada inválida! Por favor, insira números inteiros entre 0 e 2.");
					scanner.next();
				}
			}
			// CHAMA A FUNÇÃO PARA VERIFICAR VITÓRIA E IMPRIME O RESULTADO
			if (verificarVitoria() == true) {
				System.out.println("Jogador - " + jogadorAtual + " - VENCEU!");
				break;
			}
			// CHAMA A FUNÇÃO PARA VERIFICAR EMPATE E IMPRIME O RESULTADO
			if (verificarEmpate() == true) {
				System.out.println("Empate! O jogo terminou.");
				break;
			}
			// ALTERA OS JOGADOR
			if (jogadorAtual == 'X') {
				jogadorAtual = 'O';
			} else {
				jogadorAtual = 'X';
			}
		}
		// VERIFICA SE QUER JOGAR NOVAMENTE
		System.out.println("Deseja jogar novamente? (S/N)");
		String resposta = scanner.next();
		while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
			System.out.println("Opção Inválida. Por favor, escolha 'S' para sim ou 'N' para não.");
			resposta = scanner.next();
		}
		if (resposta.equalsIgnoreCase("S")) {
			main(args);
		} else {
			System.out.println("Obrigado por jogar!");
		}
		scanner.close();
	}

	// FUNÇAO PARA VERIFICAR SE HÁ VENCEDOR
	public static boolean verificarVitoria() {
		// VERIFICAÇÃO DAS LINHAS
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
				return true;
			}
		}
		// VERIFICAÇÃO DAS COLUNAS
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
				return true;
			}
		}
		// VERIFICAÇAO DAS DIAGONAIS
		if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
			return true;
		}
		if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
			return true;
		}
		return false;
	}

	// FUNÇAO PARA VERIFICAR SE HÁ EMPATE
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
