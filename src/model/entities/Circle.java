package model.entities;

import model.enums.Color;

public class Circle extends Shape{
	
	private double radius;

	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "DADOS DO CIRCULO:\n"+
			"RAIO: "+radius+"cm\n"+
			"COR:"+getColor()+"\n"+
			"AREA = "+String.format("%.2f",area());
	}
	
}
