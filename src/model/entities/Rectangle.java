package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
	
	private double width;
	private double height;

	public Rectangle() {
		
	}

	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		
		return width*height;
	}
	
	@Override
	public String toString() {
		return "DADOS DO RETÂNGULO:\n"+
			"ALTURA: "+width+"cm\n"+
			"LARGURA: "+height+"cm\n"+
			"COR:"+getColor()+"\n"+
			"AREA = "+area();
	}
	
}
