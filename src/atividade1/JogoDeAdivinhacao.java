package atividade1;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int min = 0, max = 0;

		// Cabeçalho do programa
		System.out.println("_______________________________________");
		System.out.println(" --- JOGO DE ADIVINHAÇÃO DE NÚMEROS ---");
		System.out.println("Desenvolvido por Welbert Luiz Silva");
		System.out.println("RA: 24513802-5");
		System.out.println("_______________________________________");

		// Definição de intervalos
		boolean intervaloValido = false;
		while (!intervaloValido) {
			// Tratamento de exceção para valores válidos
			try {
				System.out.print("Digite o valor mínimo do intervalo: ");
				min = scanner.nextInt();
				System.out.print("Digite o valor máximo do intervalo: ");
				max = scanner.nextInt();

				if (min >= max) {
					System.out.println("O valor mínimo deve ser menor que o máximo. Tente novamente.");
				} else {
					intervaloValido = true;
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida. Por favor, insira números inteiros válidos.");
				scanner.next(); // Limpa a entrada inválida
			}
		}

		// Geração do número aleatório
		int numeroSecreto = random.nextInt(max - min + 1) + min;
		int tentativas = 0;
		boolean acertou = false;
		
		System.out.println("_______________________________________");
		System.out.println("Estou pensando em um número entre " + min + " e " + max + ".");
		System.out.println("_______________________________________");

		// Loop do jogo
		while (!acertou) {
			System.out.print("Digite sua tentativa (ou 'sair' para encerrar): ");
			String entrada = scanner.next();

			// Opção de sair
			if (entrada.equalsIgnoreCase("sair")) {
				System.out.println("Você saiu do jogo. O número era: " + numeroSecreto);
				break;
			}

			// Tratamento de exceções para valores válidos
			try {
				int tentativa = Integer.parseInt(entrada);
				tentativas++;

				// Fornecimento de dicas
				if (tentativa < numeroSecreto) {
					System.out.println("O número é maior.");
				} else if (tentativa > numeroSecreto) {
					System.out.println("O número é menor.");
					
				// Resultado do jogo
				} else {
					if (tentativas == 1) {
						System.out.println("_______________________________________");
						System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa.");
						System.out.println("_______________________________________");
					} else {
						System.out.println("_______________________________________");
						System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
						System.out.println("_______________________________________");
					}
					acertou = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Por favor, insira um número válido.");
			}
		}

		scanner.close();
	}
}
