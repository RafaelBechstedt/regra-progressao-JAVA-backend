package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {


  /**
   * Boraaaa Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numeroDeAtividades = scanner.nextInt();
    scanner.nextLine();

    String[] atividades = new String[numeroDeAtividades];
    int[] pesosAtividades = new int[numeroDeAtividades];
    int[] notasAtividades = new int[numeroDeAtividades];
    int somaPesos = 0;
    int somaNotas = 0;

    for (int i = 0; i < numeroDeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      atividades[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      pesosAtividades[i] = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite a nota obtida para " + atividades[i] + ":");
      notasAtividades[i] = scanner.nextInt();
      scanner.nextLine();

      somaPesos += pesosAtividades[i];
      somaNotas += (notasAtividades[i] * pesosAtividades[i]);
    }

    double finalScore = (double) somaNotas / somaPesos;
    
    if (finalScore < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalScore
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    } else {
      System.out.println("Parabéns! Você alcançou " + finalScore
          + "%! E temos o prazer de informar que você obteve aprovação!");
    }
  }
}