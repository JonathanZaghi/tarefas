
public class Triangulo extends Generalizacao {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double Perimetro() {
		
		return getBase() + getAltura();
	}
	
	@Override
	double area() {
		
		return super.area()/2;
	}

	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
