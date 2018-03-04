
public class Piramide extends Generalizacao {
	
	private double Largura;
	
	public Piramide(double base, double altura, double Largura) {
		super(base, altura);
		this.Largura = Largura;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return super.Volume() * (1/3);
	}

	public double getLargura() {
		return Largura;
	}

	public void setLargura(double largura) {
		Largura = largura;
	}

}
