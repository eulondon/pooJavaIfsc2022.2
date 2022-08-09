package ifsc;

import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class PrimeiraClasse {

	//man ctrl espaco
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// comando de exubucao de dados
		//sysout ctrl +espaco
		System.out.println("Hello  World!");
		
		//read e salva leitura
		Scanner leitura = new Scanner(System.in);
		
		//leitura de dados
//		System.out.println("Informe uma variavel:");
//		String leiaStr = leitura.nextLine();
//		//printf
//		System.out.println(leiaStr + " foi o que voce4 digitou");
//		leitura.close();
//		
		//********************
		//String char[];
		//Tipos  primitivos
		char a = 'a';
		int nl =  27;
		//double, float
		long lon = 45654645646l;
		String aa = "a";
		
		//Wrapper classes
		String str = "Bruna";
		
		//
		List<String> lista = new ArrayList<>();
		
		lista.add("Bruna1");
		lista.add("Bruna2");
		lista.add("Bruna3");
		lista.add("Bruna4");
		
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.toString());
	
		System.out.println(lista.isEmpty());
		
		for (String str1 : lista) {
			System.out.println(str1);
		}
			
		System.out.println("*****************");
		for (int i =0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		int contador = 0;
		while(contador < lista.size()) {
			System.out.println(lista.get(contador));
			contador++;
		}
		
		
		
		
		}//fim do main		
	}//fin da classe
