package fiap_logica;

public class Main {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da adicao: " + soma);
		System.out.println("Resultado subtracao: " + subtracao);
		System.out.println("Resultado da mulplicacao " + multiplicacao);
		System.out.println("Resultado da divisao " + divisao);
		System.out.println("Resultado do modulo " + resto);
		
		x ++;
		System.out.println("Resultado do incremento de x: " + x);
		
		y --;
		System.out.println("Resultado do Decremento de y; " + y);
		
		x += 10;
		System.out.println("Atribuicao aditiva de x: " + x);
		
		y -= 10;
		System.out.println("Atribuicao subtrativa de y: " + y);
		
	}

}
