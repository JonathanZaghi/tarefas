import java.util.ArrayList;

public class Geometria {
	
	
	public static void main(String args[]) {
	
	ArrayList<Figura> figuras= new ArrayList<Figura>();
	 
			 figuras.add(new Quadrado(5,5));
			 figuras.add(new Circulo(5));
			 figuras.add(new Retangulo(5,5));
			 figuras.add(new Trapezio(5,5));
			 figuras.add(new Losango(5,3));
			 figuras.add(new Triangulo(5,5));
			
			
			
			for(Figura emp:figuras){
				System.out.println(emp.area());
				System.out.println(emp.Perimetro());
				if(emp instanceof Diagonal){
				System.out.println(((Diagonal)emp).calculaDiagonal());
				}
			}   
		    
	}		    	
}
