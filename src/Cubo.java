
public class Cubo extends Quadrado {

	private double Largura;
	public Cubo(double base, double altura, double Largura) {
		super(base, altura);
		this.Largura = Largura;
		// TODO Auto-generated constructor stub
	}
	public double getLargura() {
		return Largura;
	}
	public void setLargura(double largura) {
		Largura = largura;
	}
	
	@Override
	double Perimetro() {
		
		return 12 * getBase() ;
	}
	
	
	@Override
	double area() {
		
		return (super.area() * 2) + getLargura();
	}


	@Override
	double Volume() {
		
		return super.area() * getLargura();
	}

}
