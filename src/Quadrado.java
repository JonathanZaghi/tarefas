
public class Quadrado extends Generalizacao implements Diagonal {

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		
		return super.area();
	}

	@Override
	public double calculaDiagonal() {
		
		return getBase()*(Math.sqrt(2));
	}
	
	@Override
	double Perimetro() {
		
		return getBase()+getBase()+getBase()+getBase();
	}

	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
