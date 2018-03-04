
public abstract class Generalizacao extends Poligono {

	public Generalizacao(double base, double altura) {
		super(base, altura);
	}

	@Override
	double area() {
		
		return getBase() * getAltura();
	}
	
	@Override
	double Perimetro() {
		
		return 0;
	}
	
	@Override
	double Volume() {
		
		return getBase() * getAltura();
	}
	
}
