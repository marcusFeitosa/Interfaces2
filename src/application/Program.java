package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.print("Escolha corretamente a cor da figura PRETO OU BRANCO");
		String color;
		do {
			color=sc.next();
			color=color.toUpperCase();
			if(!(TestColor(color)))
				System.out.print("Erro! Digite a cor corretamente!");
		}while(!(TestColor(color)));
		
		System.out.println("\n\nEscolha sua figura:\n1 - Para Retangulo\n2 - Para Círculo");
		System.out.print("opc:");
		int opc=sc.nextInt();
		
		switch(opc){
			case 1:
				
				AbstractShape shape;
				System.out.print("Altura:");
				double height=sc.nextDouble();
				System.out.print("Largura:");
				double widht=sc.nextDouble();
				
				shape=new Rectangle(Color.valueOf(color),widht,height);
				
				System.out.println(shape);
				break;
				
			case 2:
				System.out.print("Raio:");
				double radius=sc.nextDouble();
				
				shape=new Circle(Color.valueOf(color),radius);
				System.out.println(shape);
				break;
		}
		
		
		sc.close();
	

	}
	
	static boolean TestColor(String color) {
				
		return (color.equals("PRETO")||color.equals("BRANCO"));
	}

}
