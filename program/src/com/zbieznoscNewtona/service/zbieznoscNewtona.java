package com.zbieznoscNewtona.service;

import java.util.Scanner;

public class zbieznoscNewtona {
	static Scanner in = new Scanner(System.in);
	static double startTab[][] = new double[1][2];

	public static void wczytywanieDanych(int maxIterationCount, double accuracy) {

		System.out
				.println("Witaj w programie badajacym eksperymentalnie zbieznosc Newtona");

		System.out.println("Podaj wartosc poczatkowa dla x[0]");
		startTab[0][0] = in.nextDouble();

		System.out.println("Podaj wartosc poczatkowa dla y[0]");
		startTab[0][1] = in.nextDouble();

		System.out.println("Teraz podaj maksymaln¹ liczbe iteracji: ");
		maxIterationCount = in.nextInt();

		System.out
				.println("Okresl dokladnosc: (zamiast kropki, daj przecinek)");
		accuracy = in.nextDouble();

		System.out.println();
		System.out.println("--------Twoje dane---------");
		System.out.println("x[0] " + startTab[0][0]);
		System.out.println("y[0] " + startTab[0][1]);
		System.out.println("Iteration count " + maxIterationCount);
		System.out.println("Accuracy " + accuracy);

	}

	public static void main(String[] args) {

		int maxIterationCount = 0;
		double accuracy = 0;

		wczytywanieDanych(maxIterationCount, accuracy);
	}

}
