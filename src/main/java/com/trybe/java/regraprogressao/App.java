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

    String[] atividades = new String[numeroDeAtividades];

    for (int i = 0; i < numeroDeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      atividades[i] = scanner.next();
    }
  }
}