public class Bicicletta extends Veicolo{
	public Bicicletta() {
		super();
	}
	
	private double vel = 0, acc=0;
	public void pedala(int numeroPedalate, int secondi) {
		acc = numeroPedalate/Math.pow(secondi,2);
		setAccellerazione(acc);
		vel += (acc*secondi);
		setVelocita(vel);
	}
}
