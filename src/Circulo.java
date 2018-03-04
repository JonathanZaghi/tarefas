
public class Circulo extends Figura {

	
	private double Raio;
	
	public Circulo(double Raio) {
		this.Raio = Raio;
	}
	
	public double getRaio() {
		return Raio;
	}


	public void setRaio(double raio) {
		Raio = raio;
	}
	
	
	@Override
	double Perimetro() {
		
		return 2*(Math.PI*getRaio());
	}
	
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*getRaio();
	}


	@Override
	double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
