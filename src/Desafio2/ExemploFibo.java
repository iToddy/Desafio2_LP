package Desafio2;

import java.util.Scanner;

public class ExemploFibo {
	
	static int fib(int n) {
	    // caso base
	    if (n <= 1) {
	      return n;
	    }
	    
	    // passo recursivo
	    return fib(n-1) + fib(n-2);
	}
	
	
	static int show(int n) {
	
		int vector [] = new int [n];
		
		for (int j = n; j > 0 ; j --) {
			vector [j] = (n-1) + (n-2);
		}
		
		return vector[n];
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da sequência?");
		int n = in.nextInt();
		
		
		System.out.println("Fib(5) = " + fib(n));
		System.out.println("Dados separados: " + show(n));
		
	}

}
