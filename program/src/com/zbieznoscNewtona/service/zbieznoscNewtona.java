package com.zbieznoscNewtona.service;

import java.util.Scanner;

//X[0] = startTab[0][0]      Y[0] = startTab[0][1]
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

	private static double[][] obliczenieFxy() {
		double Fxy[][] = new double[1][2];

		Fxy[0][0] = 2 * startTab[0][0] * startTab[0][1] - 3;
		Fxy[0][1] = startTab[0][0] * startTab[0][0] - startTab[0][1] - 2;

		System.out.println("\n------WYNIK F(x,y)---------");
		System.out.println("| " + Fxy[0][0] + " |");
		System.out.println("| " + Fxy[0][1] + " |");

		return Fxy;
	}

	private static double[][] obliczenieFprimXY() {
		double fPxy[][] = new double[2][2];

		fPxy[0][0] = 2 * startTab[0][1];
		fPxy[0][1] = 2 * startTab[0][0];
		fPxy[1][0] = 2 * startTab[0][0];
		fPxy[1][1] = -1;

		System.out.println("\n\n-----WYNIK f`(x,y)-----------");
		System.out.println(fPxy[0][0] + "  " + fPxy[0][1]);
		System.out.println(fPxy[1][0] + "  " + fPxy[1][1]);
		return fPxy;
	}

	private static double[][] macierzOdwrotna(double[][] fPxy) {
		double wyznacznik = 0;
		double fodwrotna[][] = new double[2][2];
		wyznacznik = fPxy[0][0] * fPxy[1][1] - fPxy[1][0] * fPxy[0][1];
		System.out.println("Wyznacznik: " + wyznacznik);
		fodwrotna[0][0] = (1 / wyznacznik) * fPxy[1][1];
		fodwrotna[1][1] = (1 / wyznacznik) * fPxy[0][0];
		fodwrotna[0][1] = (1 / wyznacznik) * (-1) * fPxy[0][1];
		fodwrotna[1][0] = (1 / wyznacznik) * (-1) * fPxy[1][0];
		System.out.println("---------Macierz odwrotna---------");
		System.out.println(fodwrotna[0][0] + "  " + fodwrotna[0][1]);
		System.out.println(fodwrotna[1][0] + "  " + fodwrotna[1][1]);
		return fPxy;

	}

	public static void main(String[] args) {
		double Fxy[][] = new double[1][2];
		double fPxy[][] = new double[2][2];
		double fodwrotna[][] = new double[2][2];
		int maxIterationCount = 0;
		double accuracy = 0;

		wczytywanieDanych(maxIterationCount, accuracy);
		Fxy = obliczenieFxy();
		fPxy = obliczenieFprimXY();
		fodwrotna = macierzOdwrotna(fPxy);
	}
}
