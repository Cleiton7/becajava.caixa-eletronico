package caixaEletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe valor do saque: ");
		int saque = scanner.nextInt();
		int valorSacado = 0;

		int restoDois;
		int restoCinco;
		int restoDez;
		int restoVinte;
		int restoCinquenta;
		int restoCem;
		int restoDuzentos;
		
		int qtdDuzentos = saque / 200;
		restoDuzentos = saque % 200;
		int qtdCem = restoDuzentos / 100;

		qtdCem = saque / 100;
		restoCem = saque % 100;
		int qtdCinquenta = restoDuzentos / 50;

		int qtdCinco = saque / 5;
		restoCinco = saque % 5;
		int qtdDois = restoCinco / 2;
//
		System.out.println("notas de 200: " + qtdDuzentos);
		System.out.println("notas de 100: " + qtdCem);
		System.out.println("notas de 5: " + restoCinco);
		System.out.println("notas de 2: " + qtdDois);
//
//		System.out.println(43 % 3);
//		System.out.println("Sacando " + i + " notas de " + valorSacado);		
	}
}
