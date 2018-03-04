
public class Esfera extends Circulo {

	
	public Esfera(double Raio) {
		super(Raio);
		// TODO Auto-generated constructor stub
	}	
	@Override
	double Volume() {
		
		return (Math.PI * (Math.pow(getRaio(), 3))) * (4/3);
	}
		
}
