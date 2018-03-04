
public class Retangulo extends Generalizacao implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		
		return super.area();
	}

	@Override
	public double calculaDiagonal() {
		
		return Math.sqrt((getBase()*getBase())+(getAltura()*getAltura()));
	}
	
	@Override
	double Perimetro() {
		
		return getBase()+getBase()+getAltura()+getAltura();
	}

	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
