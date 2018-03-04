
public class Cilindro extends Circulo {

	private double altura;
	
	public Cilindro(double Raio, double altura) {
		super(Raio);
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	double area() {
		
		return super.Perimetro()* (getRaio() + getAltura());
	}
	

	@Override
	double Volume() {
		
		return (Math.PI*(Math.pow(getRaio(), 3))) * getAltura();
	}

}
