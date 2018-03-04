
public abstract class Poligono extends Figura {
	
	private double base;
	private double altura;

	
	
	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		
		
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	double Perimetro() {
		
		return 0;
	}
	@Override
	double Volume() {
		
		return 0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
