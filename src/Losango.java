
public class Losango extends Generalizacao {

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	double Perimetro() {
		
		return getBase()+getBase()+getBase()+getBase();
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
