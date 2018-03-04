
public class Trapezio extends Generalizacao {

	public Trapezio(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double area() {
		
		return (getBase() + getBase()) *  (getAltura()/2);
	}
	
	@Override
	double Perimetro() {
		
		return  (getBase() + getBase()) + (getAltura() + getAltura()) ;
	}

	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
